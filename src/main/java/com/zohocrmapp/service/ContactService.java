package com.zohocrmapp.service;

import java.util.List;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.entities.Contact;

public interface ContactService {
	

	public void saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);

	
	
}