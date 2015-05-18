import java.util.UUID;

public class Person {

	
	private String FirstName;
	private String LastName;
	private UUID PersonID;
	
	public Person(String firstName, String lastName, UUID personID){
		super();
		FirstName = firstName;
		LastName = lastName;
		PersonID = personID;		
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public UUID getPersonID() {
		return PersonID;
	}
	public void setPersonID(UUID personID) {
		PersonID = new UUID(1000, 1000);		
	}
	
}
