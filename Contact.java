package projectOne;
/*
Name: Kyle Smith
Course: CS-320 Software Test, Automation
Assignment: 3-2 Milestone: Service Contact
*/

// Class for contact with fields and validation
public class Contact {
	private final String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	// Constructor with validation for each field
	public Contact (String contactId, String firstName, String lastName, String phone, String address) {
		// Validate contact ID length and null check
		if (contactId == null || contactId.length() > 10)  
			throw new IllegalArgumentException("Invalid contact ID");
		
		// Validate first name
		if (firstName == null || firstName.length() > 10) 
			throw new IllegalArgumentException("Invalid first name");
		
		// Validate last name
		if (lastName == null || lastName.length() > 10) 
			throw new IllegalArgumentException("Invalid last name");
		
		// Validate phone number
		if (phone == null || phone.length() != 10) 
			throw new IllegalArgumentException("Invalid phone number");
		
		// Validate address
		if (address == null || address.length() > 30) 
			throw new IllegalArgumentException("Invalid address");
		
		// Assign fields if validations pass
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	// Getters for each field
	public String getContactId() { return contactId; }
	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public String getPhone() { return phone; }
	public String getAddress() { return address; }
	
	// Setters with validation so fields update with valid input
	public void setFirstName(String firstName) {
		if (firstName != null && firstName.length() <= 10) 
			this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		if (lastName != null && lastName.length() <= 10) 
			this.lastName = lastName;
	}
	
	public void setPhone(String phone) {
		if (phone != null && phone.length() == 10)
			this.phone = phone;
	}
	
	public void setAddress(String address) {
		if (address != null && address.length() <= 30)
			this.address = address;
	}
	
	
}
