package com.bricks.customer.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bricks.customer.bean.Customer;

@Service("brickOrderUtility")
public class BrickOrderUtility {

	@Autowired
	public static List<Customer> customerList = new ArrayList<Customer>();

	/**
	 * Return's customer list
	 * 
	 * @return
	 */
	public List<Customer> getCustomerList() throws Exception {
		
		Customer customerDummy = new Customer();
		customerDummy.setCustomerName("Santhosh");
		customerDummy.setOrderReferenceId(getReferenceId());
		customerList.add(customerDummy);
		return customerList;
	}

	/**
	 * Generates unique reference id
	 * 
	 * @return
	 */
	public String getReferenceId() throws Exception {
		Random r = new Random();
		int numbers = 100000 + (int) (r.nextFloat() * 899900);
		return String.valueOf(numbers);
	}

	/*
	 * adding dummy customer data
	 */

	public String addCustomer() throws Exception {
		// TODO Auto-generated method stub
		Customer customerDummy = new Customer();
		customerDummy.setCustomerName("Santhosh");
		customerDummy.setOrderReferenceId(getReferenceId());
		customerList.add(customerDummy);
		return "success";
	}

}
