/*
 * hemen hemen ana sınıfımız diyebiliriz
 * değişkenlerimiz : açık arttırma (BUNDAN SONRA AA OLARAK KISALTILACAKTIR)
 *  AA'nın id'si mevcut AAnın aracı, satıcı sınıfından satıcı nesnesi, teklifleri tuttugumuz arraylist AAnın açık veya kapalı oldugununu tutan boolean türünden bir değişken
 * 
 * constructor'da farklı olarak AA nesnesi oluşturdugumuzda teklifleri tutacak bids arraylisti oluşturuluyor
 * 
 * startAuction metodunda eğer AA kapalı değilse AAnın başlatıldıgına dair sysout mesajı veriyor
 * eğer kapalıysa kapalı sysout mesajı veriyor
 * 
 * clsoeAuction metotuda startAuction metodunu yaptıgının aslında tam tersini yapıyor
 * 
 * getHighestBid metodu ise içini null için kontrol ediyor eğer null değilse
 *      null deilse ilk teklife en buyuk diyip for döngüsü ile diğer seçeneklere bakrak en buyuk ile karşlatırıyor 
 *      eger ikici teklif en buyukten buyukse ikinci teklifeen buyuk diyip döngüye devame diyor
 *      bu sayede en buyuk teklifi bulup bize döndürüyor
 *  
 * 
 * getter ve setter metotlarımız yine ekleniyor
 * 
 * addBid metodumuz ise bids arraylistine bid türünden yeni teklif ekliyor
 * 
 */

package auctionPackage;

import java.util.ArrayList;
import java.util.List;

import interfacesPackage.Auctionable;
import userPackage.Seller;
import vehiclePackage.Vehicle;

public class Auction implements Auctionable{
    private int id;
    private Vehicle vehicle;
    private Seller seller;
    private List<Bid> bids;
    private boolean isClosed;
    
    public Auction() {
        bids = new ArrayList<>();
        isClosed = false;
    }
    
    public void startAuction() {
        if (!isClosed) {
            System.out.println("Auction has started for vehicle: " + vehicle.getBrand() + " " + vehicle.getModel());
        } else {
            System.out.println("Auction cannot be started. It is already closed.");
        }
    }
    
    public void closeAuction() {
        if (!isClosed) {
            isClosed = true;
            System.out.println("Auction for vehicle: " + vehicle.getBrand() + " " + vehicle.getModel() + " is now closed.");
        } else {
            System.out.println("Auction is already closed.");
        }
    }
    
    public Bid getHighestBid() {
        if (bids.isEmpty()) {
            System.out.println("No bids have been placed yet.");
            return null;
        }
        
        Bid highestBid = bids.get(0);
        for (Bid bid : bids) {
            if (bid.getAmount() > highestBid.getAmount()) {
                highestBid = bid;
            }
        }
        
        System.out.println("The highest bid is $" + highestBid.getAmount() + " placed by " + highestBid.getBidder().getName());
        return highestBid;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
    
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void addBid(Bid bid) {
        bids.add(bid);
        System.out.println("New bid of $" + bid.getAmount() + " has been added to the auction.");
    }
    
}
