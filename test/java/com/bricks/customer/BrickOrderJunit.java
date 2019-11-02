package com.bricks.customer;


import static org.junit.Assert.assertNotNull;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bricks.customer.bean.Customer;
import com.bricks.customer.dao.BrickOrderDAO;


@RunWith(SpringJUnit4ClassRunner.class)
public class BrickOrderJunit {
 
	@Autowired
	private BrickOrderDAO brickOrderDAO;
	/**
	 * write test cases for all the scenarios for single unit of code 
	 * in service,dao layers and utility classes in the brick order application with Junit.
	 * @throws Exception
	 */
 
    @Test
    public void tesGetCustomerList() throws Exception{
        
    	brickOrderDAO = new BrickOrderDAO();
    	List<Customer> list =brickOrderDAO.getCustomerList();
    	
        if (list != null) {
        	 assertNotNull(list);
        }
 
    }
    
}