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
public class Customer {

	private String cutomerId;
	private String address;
	private String mobileNo;
	private String customerName;
	private String orderReferenceId;
	private String message;

	public String getCutomerId() {
		return cutomerId;
	}

	public void setCutomerId(String cutomerId) {
		this.cutomerId = cutomerId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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
