/**
 * 
 */
package com.bricks.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.bricks.customer.Exception.CustomizedResponseEntityExceptionHandler;
import com.bricks.customer.bean.CustomerOrderDetails;
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
	private ResponseEntity<Object> responseEntity;
	private ResponseEntity<String> responseEntityString;

	/**
	 * Get API that return all customers orders
	 * 
	 * @return
	 */

	@RequestMapping(value = "/customer-orders/{orderreferenceid}", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<Object> getCustomers(@PathVariable String orderreferenceid) {

		/*
		 * test object empty or nor and also status meassage, create
		 * responseEntity object accordingly
		 * 
		 */
	    // orderreferenceid = "667004";
		try {
			CustomerOrderDetails customer = brickService.getCustomerList(orderreferenceid);
			
			if(customer != null){
				
			return ResponseEntity.ok().body(customer);
			} else {
				return ResponseEntity.badRequest().body("no order details are returned");
			}
			

		} catch (Exception e) {
			e.printStackTrace();

		}
		return responseEntity;
	}
	
	@RequestMapping(value = "/customer-orders", method = RequestMethod.GET, headers = "Accept=application/json")
	public ResponseEntity<Object> getCustomers() {

		try {
			 List<CustomerOrderDetails> customer = brickService.getCustomerList();
			
			if(customer != null){
				
			return ResponseEntity.ok().body(customer);
			} else {
				return ResponseEntity.badRequest().body("no order details are returned");
			}
			

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
	@RequestMapping(value = "/customersOrders/{numberBrick}", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<String> createCustomer(@PathVariable String numberBrick)  {

		try {
			String orderRefenrenceId = brickService.addCustomer(numberBrick);
			// if success return http status code created and else write code
			// accordingly

			return ResponseEntity.ok().body(orderRefenrenceId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseEntityString;
	}
         
}
