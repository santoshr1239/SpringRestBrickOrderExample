package com.bricks.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bricks.customer.bean.CustomerOrderDetails;
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
	public String addCustomer(String numberBrick) throws Exception {
		return brickOrderDAO.addCustomer(numberBrick);
	}

	/**
	 * Return's customer list
	 * 
	 * @return
	 */
	public CustomerOrderDetails getCustomerList(String orderreferenceid) throws Exception{
		return brickOrderDAO.getCustomerList(orderreferenceid);
	}

	public  List<CustomerOrderDetails> getCustomerList() throws Exception{
		return brickOrderDAO.getCustomerList();
	}

}
