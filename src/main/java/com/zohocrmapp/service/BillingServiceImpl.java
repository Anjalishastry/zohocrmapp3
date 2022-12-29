package com.zohocrmapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.entities.Lead;
import com.zohocrmapp.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void generateBill(Billing bill) {
		billingRepo.save(bill);
		
	}
	

	@Override
	public List<Billing> getAllBills() {
		List<Billing> bills = billingRepo.findAll();
		System.out.println(bills);
		return bills;
	}


	@Override
	public Billing getBillById(long id) {
			Optional<Billing> findById = billingRepo.findById(id);
			Billing bill = findById.get();
			return bill;
	}
	
	

}
