/*
 * vehicles araylisti (Koleksiyon da deniliyor) sayesinde Vehicle sınıfına agit objeleri tutuyor
 * yine yapıcı blogu constructor'ı var
 * addVehicle metotu ie vehicles arraylistine Vehicle sınfınndan nesne ekliyor
 * startAuction da ise önce hemen null ve close kontrolü yapılıyor ondan sonra Auction sınıfndan setSeller ve setVehicle ile açık arttırmayı başlatıyor
 * showVehicles metotodunda ise hemen bir vehicles arraylistesindeki uzunlugu kontrol ediyor yeteri kadar aça var ise aracları listeliyor
 */
package userPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import vehiclePackage.Vehicle;

public class Seller extends User {

    private List<Vehicle> vehicles = new ArrayList<>();
    
    private Vehicle vehicle;

    public Seller(int id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void register() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password for registration: ");
        String password = scanner.nextLine();
        saveToFile("register", password);
        System.out.println("Seller registered successfully.");
    }

    @Override
    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password to login: ");
        String password = scanner.nextLine();
        if (authenticate(password)) {
            System.out.println("Seller logged in successfully.");
        } else {
            System.out.println("Login failed. Incorrect password.");
        }
    }

    @Override
    public void logout() {
        System.out.println("Seller logged out.");
    }


    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle " + vehicle.getBrand() + " " + vehicle.getModel() + " added.");
    }

}
