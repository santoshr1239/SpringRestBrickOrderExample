/**
 * 
 */
package com.bricks.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bricks.customer.bean.CustomerOrderDetails;
import com.bricks.customer.utility.BrickOrderUtility;
/**
 * Customer DAO class
 * 
 * @author SANTHOSH
 *
 */
@Repository("brickOrderDAO")
public class BrickOrderDAO {

	@Autowired
	private BrickOrderUtility brickOrderUtility;
	
    static int id =0;
	
	/**
	 * Adds new customer
	 * 
	 * @param customer
	 * @return
	 */
	public String addCustomer(String numberBrick) throws Exception{
		
		String orderReferenceId = brickOrderUtility.getReferenceId();
		CustomerOrderDetails customerOrderDetails = new CustomerOrderDetails();
		customerOrderDetails.setCutomerId(String.valueOf(++id));
		customerOrderDetails.setNumberofBricks(numberBrick);
		customerOrderDetails.setOrderReferenceId(orderReferenceId);
		//brickOrderUtility.getCustomerList().add(customerOrderDetails);
		//String orderReferenceId = brickOrderUtility.getReferenceId();
		brickOrderUtility.addCustomer(customerOrderDetails);
		return orderReferenceId;
	}

	public CustomerOrderDetails getCustomerList(String orderreferenceid) throws Exception {
		// TODO Auto-generated method stub
		return brickOrderUtility.getCustomerList(orderreferenceid);
	}

	public  List<CustomerOrderDetails> getCustomerList() {
		// TODO Auto-generated method stub
		 return brickOrderUtility.getCustomerList();
	}

	
}
