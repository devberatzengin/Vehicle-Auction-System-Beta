/*
 * Protected(Yani sadece aynı paket içinden erişilebilen) olarak tanımlanan değişkenlerimiz var bunlar her açar için ortak :
 * 		id marka model ve açılış fiyat olarak 
 * 
 * yine constructor var
 * getter ve setter metotolarımız var constructor'da yanlış tanımlarsak vs diye
 * 
 * abstract metodumuz var her acar için ekstra detaylarımız oldugu için
 *  ve id değişkenimiz static çükü her aça tanımladıgımızda id artacak
 * 
 * 
 *   
 * 
 */



package vehiclePackage;

public abstract class Vehicle {

    protected static int id=0;
    protected String brand;
    protected String model;
    protected double basePrice;
	protected abstract void displayDetails();
    
    public Vehicle(String brand,String model,double baseprice) {
    	this.basePrice=baseprice;
    	this.brand=brand;
    	this.model=model;
    	this.id= this.id+1;
    }
    
    
    public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public static int getId() {
		return id;
	}


	public static void setId(int id) {
		Vehicle.id = id;
	}



	public double getBasePrice() {
		return basePrice;
	}



	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


}
