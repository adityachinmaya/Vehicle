
public abstract class MotorCycle extends Vehicle implements VehicleInterface{

	boolean hasSideCar;

	public MotorCycle(String name, String color, double weight, Person owner) {
		super(name, color, weight, owner);
	}
	
	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}
	
	
}
