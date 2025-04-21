package projectOne;

/*
Name: Kyle Smith
Course: CS-320 Software Test, Automation
Assignment: 3-2 Milestone: Service Contact
*/

import java.util.ArrayList;
import java.util.List;


public class ContactService {
	// List to hold contacts
	private List<Contact> contacts = new ArrayList<>();
	
	// Add a new contact to list
	public void addContact(Contact contact) {
		// Checks for duplicate contact ID
		for (Contact c : contacts) {
			if (c.getContactId().equals(contact.getContactId())) 
				throw new IllegalArgumentException ("Duplicate contact ID");
		}
		contacts.add(contact);
	}
	
	// Delete a contact by ID
	public void deleteContact(String contactId) {
		contacts.removeIf(contact -> contact.getContactId().equals(contactId));
	}
	
	// Updates first name for a contact by ID
	public void updateFirstName(String contactId, String firstName) {
		for (Contact contact : contacts) {
			if (contact.getContactId().equals(contactId)) {
				contact.setFirstName(firstName);
			}
		}
	}
	
	// Updates last name for a contact by ID
	public void updateLastName(String contactId, String lastName) {
		for (Contact contact : contacts) {
			if (contact.getContactId().equals(contactId)) {
				contact.setLastName(lastName);
			}
		}
	}
	
	// Updates phone number for a contact by ID
	public void updatePhone(String contactId, String phone) {
		for (Contact contact : contacts) {
			if (contact.getContactId().equals(contactId)) {
				contact.setPhone(phone);
			}
		}
	}
	
	// Updates address for a contact by ID
	public void updateAddress(String contactId, String address) {
		for (Contact contact : contacts) {
			if (contact.getContactId().equals(contactId)) {
				contact.setAddress(address);
			}
		}
	}

}
