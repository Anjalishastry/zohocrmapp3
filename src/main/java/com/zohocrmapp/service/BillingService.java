package com.zohocrmapp.service;

import java.util.List;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.entities.Contact;

public interface BillingService {

	public void generateBill(Billing bill);
	
	public List<Billing> getAllBills();
	
	public Billing getBillById(long id);
}
