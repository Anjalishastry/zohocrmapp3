package com.zohocrmapp.service;


import java.util.List;

import com.zohocrmapp.entities.Lead;


public interface LeadService {
	
	public void saveOneLead(Lead lead);
	
	
public Lead getLeadById(long id);
public void deleteLeadById(long id);


public List<Lead> getAllLeads();

}
