
public abstract class Truck extends Vehicle implements VehicleInterface{

	int NumberOfAxels;

	public Truck(String name, String color, double weight, Person owner) {
		super(name, color, weight, owner);
	}
	
	public int getNumberOfAxels() {
		return NumberOfAxels;
	}

	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}
	
	
	
}
