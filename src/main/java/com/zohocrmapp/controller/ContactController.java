package com.zohocrmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.entities.Contact;
import com.zohocrmapp.entities.Lead;
import com.zohocrmapp.service.BillingService;
import com.zohocrmapp.service.ContactService;

@Controller

public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	

	@RequestMapping("/listContacts")
	public String listContacts(Model model) {
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts",contacts);
		return"list_contacts";
	}
	
	@RequestMapping("/createBill")
	public String createBill(@RequestParam("id") long id, Model model) {
		Contact contact = contactService.getContactById(id);
		model.addAttribute("contact",contact);
		return "generate_bill";
		
	}
	
	
	

	
	

}
