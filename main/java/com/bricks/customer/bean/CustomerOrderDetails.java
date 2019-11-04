/**
 * 
 */
package com.bricks.customer.bean;

/**
 * Customer POJO class
 * 
 * @author SANTHOSH
 *
 */
public class CustomerOrderDetails {

	private String cutomerId;
	private String customerName;
	private String orderReferenceId;
	private String numberofBricks;
	private String message;
	
	public String getNumberofBricks() {
		return numberofBricks;
	}

	public void setNumberofBricks(String numberofBricks) {
		this.numberofBricks = numberofBricks;
	}

	public String getCutomerId() {
		return cutomerId;
	}

	public void setCutomerId(String cutomerId) {
		this.cutomerId = cutomerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOrderReferenceId() {
		return orderReferenceId;
	}

	public void setOrderReferenceId(String orderReferenceId) {
		this.orderReferenceId = orderReferenceId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	}
