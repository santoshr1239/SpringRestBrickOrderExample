/**
 * 
 */
package com.bricks.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bricks.customer.bean.Customer;
import com.bricks.customer.service.BrickService;

/**
 * Bricks rest service class
 * 
 * @author SANTHOSH
 *
 */
@RestController
public class BricksCustomerController {

	@Autowired
	private BrickService brickService;

	/**
	 * Get API that return all customers
	 * 
	 * @return
	 */

	@RequestMapping(value = "/customersOrders/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public  ResponseEntity<Customer> getCustomers(@PathVariable int id) throws Exception  {
		
		/*
		 * test list empty or nor and also status meassage, create responseEntity object accordingly
		 *  
		 */
		List<Customer> customer = brickService.getCustomerList();

		ResponseEntity<Customer> responseEntity = new ResponseEntity<Customer>(HttpStatus.OK);
		return responseEntity;
			
	}

	/**
	 * Post API to add new customer
	 * 
	 * @param newCustomer
	 * @return
	 */
	@RequestMapping(value = "/customersOrders", method = RequestMethod.POST, headers = "Accept=application/json")
	public  ResponseEntity<String> createCustomer(Customer customer) throws Exception  {
		
		
		String orderRefenrenceId = brickService.addCustomer(customer);
		// if success return http status code created and else write code accordingly
		ResponseEntity<String> responseEntity = new ResponseEntity<>("customer",
                 HttpStatus.CREATED);
		return responseEntity;
	}

}
