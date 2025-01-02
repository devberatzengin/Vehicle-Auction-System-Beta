/*
 * 
 * User sınfında kendi constructor'u var yine
 * 3 adet abstract metotodu var register, login ve logout olmak üzere bunları sonrasında User sınfınnın alt sınıfları olan Seller ve Bidder sınıflarında Override ediyoruz
 * Her userin 3 adet ortak değişkeni var bunlar userid nameuser ve useremail 
 * private tanımlı bu üç değişken hendi sınıfı haracinde erilemeyeceğinden her si için 3er toplam 6 adet getter ver setter metotları var 
 * 
 */

package userPackage;

import java.io.*;
import java.util.Scanner;

public abstract class User {
    private int userid;
    private String username;
    private String useremail;

    public User(int id, String name, String email) {
        this.userid = id;
        this.username = name;
        this.useremail = email;
    }

    public abstract void register();
    public abstract void login();
    public abstract void logout();

    protected void saveToFile(String action, String password) {
        try (FileWriter fileWriter = new FileWriter("user_log.txt", true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println(username + "," + useremail + "," + password);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    protected boolean authenticate(String password) {
        try (Scanner scanner = new Scanner(new File("user_log.txt"))) {
            while (scanner.hasNextLine()) {
                String[] userInfo = scanner.nextLine().split(",");
                if (userInfo[0].equals(username) && userInfo[1].equals(useremail) && userInfo[2].equals(password)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("User log file not found.");
        }
        return false;
    }

    public int getId() {
        return userid;
    }

    public void setId(int id) {
        this.userid = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getEmail() {
        return useremail;
    }

    public void setEmail(String email) {
        this.useremail = email;
    }
}
