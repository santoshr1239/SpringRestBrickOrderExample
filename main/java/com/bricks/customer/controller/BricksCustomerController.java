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
	private ResponseEntity<List<Customer>> responseEntity;
	private ResponseEntity<String> responseEntityString;

	/**
	 * Get API that return all customers orders
	 * 
	 * @return
	 */

	@RequestMapping(value = "/customer-orders", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<List<Customer>> getCustomers() {

		/*
		 * test list empty or nor and also status meassage, create
		 * responseEntity object accordingly
		 * 
		 */
		//ResponseEntity<List<Customer>> responseEntity = new ResponseEntity<List<Customer>>(HttpStatus.OK);
		
		try {
			List<Customer> customer = brickService.getCustomerList();
			return ResponseEntity.ok().body(customer);

		} catch (Exception e) {
			e.printStackTrace();

		}
		return responseEntity;
	}

	/**
	 * Post API to add new customer
	 * 
	 * @param newCustomer
	 * @return
	 */
	@RequestMapping(value = "/customersOrders", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<String> createCustomer(Customer customer)  {

		//ResponseEntity<String> responseEntity = new ResponseEntity<>("ok", HttpStatus.CREATED);
		try {
			String orderRefenrenceId = brickService.addCustomer(customer);
			// if success return http status code created and else write code
			// accordingly

			return ResponseEntity.ok().body(orderRefenrenceId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntityString;
	}
         
}
