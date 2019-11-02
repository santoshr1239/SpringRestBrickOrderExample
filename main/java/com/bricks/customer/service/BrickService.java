package com.bricks.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bricks.customer.bean.Customer;
import com.bricks.customer.dao.BrickOrderDAO;


@Service("brickService")
public class BrickService {
	@Autowired
	private BrickOrderDAO brickOrderDAO;
	/**
	 * Adds new customer
	 * 
	 * @param customer
	 * @return
	 */
	public String addCustomer(Customer customer) throws Exception {
		return brickOrderDAO.addCustomer(customer);
	}

	/**
	 * Return's customer list
	 * 
	 * @return
	 */
	public List<Customer> getCustomerList() throws Exception{
		return brickOrderDAO.getCustomerList();
	}

	

}
