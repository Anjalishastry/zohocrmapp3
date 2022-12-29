package com.zohocrmapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.entities.Contact;
import com.zohocrmapp.entities.Lead;
import com.zohocrmapp.repository.BillingRepository;
import com.zohocrmapp.repository.ContactRepository;
import com.zohocrmapp.repository.LeadRepository;


@Service
public class ContactServiceImpl implements ContactService {
	
	
	@Autowired
	private ContactRepository contactRepo;
	
	
	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
		
	}


	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}


	@Override
	public Contact getContactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
			Contact contact = findById.get();
		return contact;
	}






}
