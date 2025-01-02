/*
 * 
 * het teklifin bir id si bunu yaoar bir alıcısı ve miktarı var
 *  ve bunları daha sonra hata ile karşılaşırsak diye düzenleyebilmemiz için getter ve setter ları var
 * display bid metotdu ile de bu teklif hakkında bilgileri ediniyoruz
 * 
 */


package auctionPackage;

import java.util.Date;

import userPackage.Bidder;

public class Bid {

    private int id;
    private Bidder bidder;
    private double amount;
    private Date timestamp;

    public Bid(int id, Bidder bidder, double amount) {
        this.id = id;
        this.bidder = bidder;
        this.amount = amount;
        this.timestamp = new Date();
    }

    public double getAmount() {
        return amount;
    }

    public Bidder getBidder() {
        return bidder;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void displayBid() {
        System.out.println("Bid ID: " + id + ", Amount: " + amount + ", Bidder: " + bidder.getName() + ", Timestamp: " + timestamp);
    }
}
