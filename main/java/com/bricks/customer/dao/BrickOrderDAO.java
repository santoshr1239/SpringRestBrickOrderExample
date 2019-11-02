/**
 * 
 */
package com.bricks.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bricks.customer.bean.Customer;
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
	
	/**
	 * Adds new customer
	 * 
	 * @param customer
	 * @return
	 */
	public String addCustomer(Customer customer) throws Exception{
		String newId = Integer.toString(brickOrderUtility.getCustomerList().size() + 1);
		customer.setCutomerId(newId);
		customer.setOrderReferenceId(brickOrderUtility.getReferenceId());
		brickOrderUtility.getCustomerList().add(customer);
		return newId;
	}

	public List<Customer> getCustomerList() throws Exception {
		// TODO Auto-generated method stub
		return brickOrderUtility.getCustomerList();
	}

	
}
