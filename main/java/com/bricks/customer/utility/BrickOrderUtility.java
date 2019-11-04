package com.bricks.customer.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.bricks.customer.bean.CustomerOrderDetails;

@Service("brickOrderUtility")
public class BrickOrderUtility {

	public static List<CustomerOrderDetails> customerOrderList = new ArrayList<CustomerOrderDetails>();
	
	private static int idCounter = 100000;

     /**   
	 * Return's customer list
	 * 
	 * @return
	 */
	public CustomerOrderDetails getCustomerList(String orderreferenceid) throws Exception {
		
		for (int i = 0; i < customerOrderList.size(); i++) {
			
			CustomerOrderDetails customerOrderDetails = customerOrderList.get(i);
			
			if(customerOrderDetails.getOrderReferenceId().equals(orderreferenceid)){
				return customerOrderDetails;
			} 
			
		}
		
			return null;
	}

	/**
	 * Generates unique reference id
	 * 
	 * @return
	 */
	public String getReferenceId() throws Exception {
		return String.valueOf(++idCounter);
	}

	/*
	 * adding dummy customer data
	 */

	public String addCustomer(CustomerOrderDetails customerOrderDetails) throws Exception {
		// TODO Auto-generated method stub
		 customerOrderList.add(customerOrderDetails);
		return "success";
	}


	public List<CustomerOrderDetails> getCustomerList() {
		// TODO Auto-generated method stub
		return customerOrderList;
	}

}
