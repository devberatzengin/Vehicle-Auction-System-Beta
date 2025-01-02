/*
 * ekstra olarak oturma kapasitesi ve yakıt tipi değişkenlerimiz var
 * constructor da farklı olarak super() metodumuz var ki ust sınıf olan vehicleda ki değişkenleride atayabileli diye
 * 
 * display details Override ediliyor ve metot kullanılıyor
 *  
 * yeni değişkenlerimiz için getter ve setter metotları ekleniyor
 * 
 */



package vehiclePackage;

public class Car extends Vehicle {
    
	private int seatingCapacity;
    private String fuelType;
	
    public Car(String brand,String model,double baseprice,int seatingCapacity,String fuelType) {
    	super(brand,model,baseprice);
    	this.seatingCapacity=seatingCapacity;
    	this.fuelType=fuelType;
    }
    @Override
    public void displayDetails() {
    	System.out.println("Car's id is: "+getId());
    	System.out.println("Car's brand name is: "+getBrand()+"");
    	System.out.println("Car's model is:"+getModel());
    	System.out.println("Car's base price is:"+getBasePrice());
    	System.out.println("Car's seating Capacity is:"+seatingCapacity);
    	System.out.println("Car's fuel Type is:"+fuelType);
    }

	public int getSeatingCapacity() {
		return seatingCapacity;
	}
	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
    
}
