/*
 * constructor ımızda super ve yeni değişkenlerimiz olan yükkapasitesi, dorse kapasitemiz ve aks sayımı da değişken olarak ekleniyor
 * displayDetails metotdumuz Override ediyor (abstract metot oldugu için) 
 *  
 */

package vehiclePackage;

public class Truck extends Vehicle{


    private double payloadCapacity;
    private double trailerCapacity;
    private int numberOfAxles;
	
    
    public Truck(String brand,String model,double baseprice,double payloadCapacity,double trailerCapacity,int numberOfAxles) {
    	super(brand,model,baseprice);
    	this.payloadCapacity=payloadCapacity;
    	this.trailerCapacity=trailerCapacity;
    	this.numberOfAxles=numberOfAxles;
    }
    
    
    @Override
    public void displayDetails() {
    	System.out.println("Truck's Id is: "+getId());
    	System.out.println("Truck's Brand Name is: "+getBrand()+"");
    	System.out.println("Truck's Model is:"+getModel());
    	System.out.println("Truck's Base Price is:"+getBasePrice());
    	System.out.println("Truck's Payload Capacity is:"+payloadCapacity);
    	System.out.println("Truck's Trailer Capacity is:"+trailerCapacity);
    	System.out.println("Truck's Number Of Axles is:"+numberOfAxles);
    	
    }



	public double getPayloadCapacity() {
		return payloadCapacity;
	}
	public void setPayloadCapacity(double payloadCapacity) {
		this.payloadCapacity = payloadCapacity;
	}
	public double getTrailerCapacity() {
		return trailerCapacity;
	}
	public void setTrailerCapacity(double trailerCapacity) {
		this.trailerCapacity = trailerCapacity;
	}
	public int getNumberOfAxles() {
		return numberOfAxles;
	}
	public void setNumberOfAxles(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}
    
    
	
}
