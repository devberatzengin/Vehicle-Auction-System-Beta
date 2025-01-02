/*
 * constructor metodumuzada super metodumuzda kullanılıyor
 *
 * yeni değişkenlerimiz: motor kapasitesi ve (Farklı değişken türü olsun diye) true ve false seçeneği olan SepetiVarMı değişkeni
 * displaydetails Override ediliyor yeni değişkenlerimiz için
 * getter ve setter metotlarımız ekleniyor yeniden
 * 
 * 
 *
 */

package vehiclePackage;

public class Motorcycle extends Vehicle {
    
	private int engineCapacity;
	private boolean hasSidecar;
	
	
	public Motorcycle(String brand,String model,double baseprice,int engineCapacity,boolean hasSidecar) {
    	super(brand,model,baseprice);
    	this.engineCapacity=engineCapacity;
    	this.hasSidecar=hasSidecar;
    }

    @Override
	public void displayDetails() {
    	System.out.println("Truck's Id is: "+getId());
    	System.out.println("Truck's Brand Name is: "+getBrand()+"");
    	System.out.println("Truck's Model is:"+getModel());
    	System.out.println("Truck's Base Price is:"+getBasePrice());
    	System.out.println("Truck's Engine Capacity is:"+engineCapacity);
    	System.out.println("Truck's has Sidecar [True or False]:"+hasSidecar);    	
    }


	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public boolean isHasSidecar() {
		return hasSidecar;
	}
	public void setHasSidecar(boolean hasSidecar) {
		this.hasSidecar = hasSidecar;
	}

	
	
}
