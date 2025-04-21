package projectOne;

/*
Name: Kyle Smith
Course: CS-320 Software Test, Automation
Assignment: 3-2 Milestone: Service Contact
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {
	// Test contact creation with valid values
	@Test
	public void testContactCreationValid() {
		Contact contact = new Contact ("1", "Kyle", "Smith", "3304103667", "933 Wimbleton Dr");
		assertEquals ("1", contact.getContactId());
		assertEquals ("Kyle", contact.getFirstName());
		assertEquals ("Smith", contact.getLastName());
		assertEquals ("3304103667", contact.getPhone());
		assertEquals ("933 Wimbleton Dr", contact.getAddress());
	}
	
	// Test updating fields using setters with valid values
	@Test
	public void testSettersValidUpdates() {
		Contact contact = new Contact ("2", "Micheal", "Smith", "3303652055", "233 Greeley St");
		contact.setFirstName("Shawn");
		contact.setLastName("Lowe");
		contact.setPhone("3304506539");
		contact.setAddress("645 Oak Ave");
		
		assertEquals ("Shawn", contact.getFirstName());
		assertEquals ("Lowe", contact.getLastName());
		assertEquals ("3304506539", contact.getPhone());
		assertEquals ("645 Oak Ave", contact.getAddress());
	}
	
	// Test invalid contact creation throws exceptions
	@Test
	public void testInvalidContactCreation() {
		assertThrows (IllegalArgumentException.class, 
				() -> new Contact (null, "Kyle", "Smith", "3304103667", "933 Wimbleton Dr"));
		
		assertThrows (IllegalArgumentException.class, 
				() -> new Contact ("1", null, "Smith", "3304103667", "933 Wimbleton Dr"));
		
		assertThrows (IllegalArgumentException.class, 
				() -> new Contact ("1", "Kyle", null, "3304103667", "933 Wimbleton Dr"));
		
		assertThrows (IllegalArgumentException.class, 
				() -> new Contact ("1", "Kyle", "Smith", "330", "933 Wimbleton Dr"));
		
		assertThrows (IllegalArgumentException.class, 
				() -> new Contact ("1", "Kyle", "Smith", "3304103667", null));
		
	} 
	
	@Test
	public void testEdgeLimit() {
		String id = "5428731648";   // 10 character ID
		String first = "Kyle Smith"; // 10 character first name
		String last = "Kyle Smith"; // 10 character last name
		String phone = "3304103667"; // 10 character phone
		String address = "5167533 North Wimbleton Drive"; // 29 character address
		
		Contact contact = new Contact(id, first, last, phone, address);
		assertEquals(id, contact.getContactId());
		assertEquals(first, contact.getFirstName());
		assertEquals(last, contact.getLastName());
		assertEquals(phone, contact.getPhone());
		assertEquals(address, contact.getAddress());
				
	}
	
	@Test
	public void testSettersRejectInvalidInputs() {
		Contact contact = new Contact("1", "Kyle", "Smith", "3304103667", "933 Wimbleton Dr");
		contact.setFirstName("Kyle J Smith");
		assertEquals("Kyle", contact.getFirstName()); // Should stay unchanged
		
		contact.setLastName(null);
		assertEquals("Smith", contact.getLastName()); // Should stay unchanged

		contact.setPhone("123");
		assertEquals("3304103667", contact.getPhone()); // Should stay unchanged

		contact.setAddress("495167533 North Wimbleton Drive");
		assertEquals("933 Wimbleton Dr", contact.getAddress()); // Should stay unchanged
	}
	
	@Test
	public void testMinimumValidValues() {
		Contact contact = new Contact("C", "A", "B", "3304103667", "Z"); 
		assertEquals("C", contact.getContactId());
		assertEquals("A", contact.getFirstName());
		assertEquals("B", contact.getLastName());
		assertEquals("3304103667", contact.getPhone());
		assertEquals("Z", contact.getAddress());
	}

}
