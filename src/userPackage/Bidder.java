/*
 * Bidder Sınıfi Hakkında
 * Yine kendi yapıcı blogu (Constructor) var.
 * User sınıfından extend oldugu için USt sınıfı olan Userden gelen register, login, logout abstract metotlarını Override etmek zorunda
 * Kullandıgı placeBid metdu sayesinde eger açıkarttırma kapali değilse aldıgı açıkattırma ve teklif ile Auction sınıfına gidiyor devamı orada...
 * 
 */
package userPackage;

import auctionPackage.Auction;
import auctionPackage.Bid;
import java.util.Scanner;

public class Bidder extends User {

    public Bidder(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password for registration: ");
        String password = scanner.nextLine();
        saveToFile("register", password);
        System.out.println("Bidder registered successfully.");
    }

    @Override
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password to login: ");
        String password = scanner.nextLine();
        if (authenticate(password)) {
            System.out.println("Bidder logged in successfully.");
        } else {
            System.out.println("Login failed. Incorrect password.");
        }
    }

    @Override
    public void logout() {
        System.out.println("Bidder logged out.");
    }

    public void placeBid(Auction auction, int amount) {
        if (auction.isClosed()) {
            System.out.println("Cannot place bid. The auction is closed.");
        } else {
            Bid bid = new Bid(this.getId(), this, amount);
            auction.addBid(bid);
            System.out.println("Bid placed by " + this.getName() + " for $" + amount);
        }
    }
}
