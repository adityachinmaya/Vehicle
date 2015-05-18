
public abstract class Vehicle {

	String Name;
	String Color;
	double Weight;
	Person Owner;
	
	
	public Vehicle(String name, String color, double weight, Person owner) {
		super();
		Name = name;
		Color = color;
		this.Weight = weight;
		Owner = owner;
	}
	
	public void transferOwnership(Person newOwner){
		this.Owner = newOwner;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public Double getWeight() {
		return Weight;
	}

	public void setWeight(Double weight) {
		Weight = weight;
	}

	public Person getOwner() {
		return Owner;
	}

	public void setOwner(Person owner) {
		Owner = owner;
	}
	
	
	
}
