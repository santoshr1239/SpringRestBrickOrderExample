package com.bricks.customer;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.bricks.customer.bean.CustomerOrderDetails;
import com.bricks.customer.dao.BrickOrderDAO;
import com.bricks.customer.utility.BrickOrderUtility;
 
@RunWith(MockitoJUnitRunner.class)
public class BrickOrderJunit
{
     
    @InjectMocks
    BrickOrderUtility brickOrderUtility;
    
    @InjectMocks
    CustomerOrderDetails customerOrderDetails;
     
    
   @Test
    public void testAddOrderDetails() throws Exception
    {
	    customerOrderDetails.setCustomerName("santhosh");
    	String referenceId =brickOrderUtility.addCustomer(customerOrderDetails);
    	assertNotNull(referenceId);
     }
    
    @Test
    public void tesGetCustomerList() throws Exception
    {
    	List<CustomerOrderDetails> list;
    	String numberBrick ="10";
    	list =brickOrderUtility.getCustomerList();
    	assertNotNull(list);
     }
} 

 
   