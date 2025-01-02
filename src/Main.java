import userPackage.Seller;
import userPackage.Bidder;
import auctionPackage.Auction;
import vehiclePackage.Car;
import vehiclePackage.Motorcycle;
import vehiclePackage.Truck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome! Please enter name for seller: ");
        String sname = scanner.next();
        System.out.print(sname + "'s e-mail please: ");
        String semail = scanner.next();
        Seller seller = new Seller(1, sname, semail);

        System.out.print("Welcome! Please enter name for bidder: ");
        String bname = scanner.next();
        System.out.print(bname + "'s e-mail please: ");
        String bemail = scanner.next();
        Bidder bidder = new Bidder(1, bname, bemail);
        Bidder bidder2 = new Bidder(2, "Other Bidder", "otherbidder@example.com");

        seller.register();
        bidder.register();
        seller.login();
        bidder.login();

        Car car = addCar(scanner);
        seller.addVehicle(car);

//        Truck truck = addTruck(scanner);  // tır eklemek istersek
//        seller.addVehicle(truck);         // tır eklemek istersek
//        truck.displayDetails();
//        Motorcycle motorcycle = addMotorcycle(scanner);   //motor eklemek istersek
//        seller.addVehicle(motorcycle);                    //
//        motorcycle.displayDetails();


        Auction auction = new Auction();
        auction.setVehicle(car);
        auction.setSeller(seller);
        auction.startAuction();

        System.out.println("-------------------------------------------");
        System.out.println(car.getBrand() + "'s starting value is: $" + car.getBasePrice());
        System.out.println("-------------------------------------------");

        char answer;
        int vehicleCurrentValue = (int) car.getBasePrice();
        int newvalue;
        

        for (int i = 0; i < 5; i++) {
            if (i != 0) {
                System.out.println(car.getBrand() + "'s current value is: $" + vehicleCurrentValue);
            }

            System.out.print("Do you want to join " + car.getBrand() + "'s auction? [Y/N]: ");
            answer = scanner.next().toUpperCase().charAt(0);

            if (answer == 'Y') {
                do {
                    System.out.print("Please enter your bid: ");
                    newvalue = scanner.nextInt();
                    if (newvalue < vehicleCurrentValue) {
                        System.out.println("Your bid must be at least $" + vehicleCurrentValue + " or higher.");
                    }
                } while (newvalue < vehicleCurrentValue);

                bidder.placeBid(auction, newvalue);
                vehicleCurrentValue = newvalue;
            } else {
                System.out.println("Other user is bidding...");
                int randombet = (int) (1 + Math.random() * 999);
                int randomBidValue = vehicleCurrentValue + randombet;
                bidder2.placeBid(auction, randomBidValue);
                System.out.println("Other user placed a bid of $" + randomBidValue);
                vehicleCurrentValue = randomBidValue;
            }

            for (int j = 0; j < 10; j++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                System.out.print("\t----- ");
            }
            System.out.println();
        }

        auction.getHighestBid();
        auction.closeAuction();

        seller.logout();
        bidder.logout();
    }

    public static Car addCar(Scanner scanner) {
        System.out.print("Brand name for car: ");
        String cname = scanner.next();
        System.out.print("Model name for " + cname + ": ");
        String cmodel = scanner.next();
        System.out.print(cname + "'s base price: ");
        int cbprice = scanner.nextInt();
        System.out.print(cname + "'s seating capacity: ");
        int cscap = scanner.nextInt();
        System.out.print(cname + "'s fuel type: ");
        String cftype = scanner.next();

        return new Car(cname, cmodel, cbprice, cscap, cftype);
    }

    public static Truck addTruck(Scanner scanner) {
        System.out.print("Brand name for truck: ");
        String tname = scanner.next();
        System.out.print("Model name for " + tname + ": ");
        String tmodel = scanner.next();
        System.out.print(tname + "'s base price: ");
        double tbprice = scanner.nextDouble();
        System.out.print(tname + "'s payload capacity: ");
        double tpcap = scanner.nextDouble();
        System.out.print(tname + "'s trailer capacity: ");
        double ttcap = scanner.nextDouble();
        System.out.print(tname + "'s number of axles: ");
        int tnoa = scanner.nextInt();
        
        return new Truck(tname, tmodel, tbprice, tpcap, ttcap, tnoa);
    }

    public static Motorcycle addMotorcycle(Scanner scanner) {
        System.out.print("Brand name for motorcycle: ");
        String mname = scanner.next();
        System.out.print("Model name for " + mname + ": ");
        String mmodel = scanner.next();
        System.out.print(mname + "'s base price: ");
        double mbprice = scanner.nextDouble();
        System.out.print(mname + "'s engine capacity: ");
        int mecap = scanner.nextInt();
        System.out.print(mname + " has sidecar [true/false]: ");
        boolean mhscar = scanner.nextBoolean();
    
        return new Motorcycle(mname, mmodel, mbprice, mecap, mhscar);
    }



}
