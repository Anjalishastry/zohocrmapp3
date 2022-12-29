package com.zohocrmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrmapp.entities.Billing;
import com.zohocrmapp.service.BillingService;

@Controller
public class BillingController {
	
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/saveBill")
	public String saveBill(Billing bill,Model model) {
		billingService.generateBill(bill);
		model.addAttribute("bill", bill);
		return"Bill_info";
		
	}
	
	@RequestMapping("/listBills")
	public String listBills(Model model) {
		List<Billing> bills = billingService.getAllBills();
		model.addAttribute("bills",bills);
		return"list_bills";
		
	}

}
