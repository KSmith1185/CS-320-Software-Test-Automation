package projectOne;

/*
Name: Kyle Smith
Course: CS-320 Software Test, Automation
Assignment: 3-2 Milestone: Service Contact
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
	// Test adding a contact and preventing duplicates
	@Test
	public void testAddContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact ("1", "Kyle", "Smith", "3304103667", "933 Wimbleton Dr");
		service.addContact(contact);
		// Try adding same contact - should throw exception
		assertThrows(IllegalArgumentException.class, () -> service.addContact(contact));
	}
	
	// Test deleting a contact by ID
	@Test
	public void testDeleteContact() {
		ContactService service = new ContactService();
		Contact contact = new Contact ("2", "Micheal", "Warner", "3306354785", "614 West Abbey St");
		service.addContact(contact);
		service.deleteContact("2");  // Should successfully delete
		service.deleteContact("2");  // Second delete should not throw error
	}
	
	// Test updating first name
	@Test
	public void testUpdateFirstName() {
		ContactService service = new ContactService();
		Contact contact = new Contact ("3", "Micheal", "Diello", "3306352791", "9988 Bilney Court");
		service.addContact(contact);
		service.updateFirstName("3", "John");
		assertEquals ("John", contact.getFirstName());
	}
	
	// Test updating last name
	@Test
	public void testUpdateLastName() {
		ContactService service = new ContactService();
		Contact contact = new Contact ("4", "Nicole", "Smith", "3306354915", "273 Oak St");
		service.addContact(contact);
		service.updateLastName("4", "Davison");
		assertEquals ("Davison", contact.getLastName());
	}
	
	// Test updating phone number with invalid value (should not change)
	@Test
	public void testUpdatePhoneInvalid() {
		ContactService service = new ContactService();
		Contact contact = new Contact ("5", "Sarah", "Warner", "3306352786", "584 Valley Dr");
		service.addContact(contact);
		service.updatePhone("5", "716");  // Invalid, should not change
		assertEquals ("3306352786", contact.getPhone());   // Original number should remain
	}
	
	// Test updating phone number with valid value
	@Test
	public void testUpdatePhoneValid() {
		ContactService service = new ContactService();
		Contact contact = new Contact ("6", "Devon", "Diello", "3306352299", "9988 Bilney Court");
		service.addContact(contact);
		service.updatePhone("6", "7164503965");
		assertEquals ("7164503965", contact.getPhone());
		
	}
	
	// Test updating address field
	@Test
	public void testUpdateAddress() {
		ContactService service = new ContactService();
		Contact contact = new Contact ("7", "Amelia", "Smith", "3306356539", "351 Hooper Dr");
		service.addContact(contact);
		service.updateAddress("7", "509 Spooner Rd");
		assertEquals ("509 Spooner Rd", contact.getAddress());
		
	}

}
