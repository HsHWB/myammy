package com.ommay.entity;

/**
 * TestResult entity. @author MyEclipse Persistence Tools
 */

public class TestResult implements java.io.Serializable {

	// Fields

	private Long uuidTestDetail;
	private OrderDetail orderDetail;
	private String result;

	// Constructors

	/** default constructor */
	public TestResult() {
	}

	/** minimal constructor */
	public TestResult(Long uuidTestDetail) {
		this.uuidTestDetail = uuidTestDetail;
	}

	/** full constructor */
	public TestResult(Long uuidTestDetail, OrderDetail orderDetail,
			String result) {
		this.uuidTestDetail = uuidTestDetail;
		this.orderDetail = orderDetail;
		this.result = result;
	}

	// Property accessors

	public Long getUuidTestDetail() {
		return this.uuidTestDetail;
	}

	public void setUuidTestDetail(Long uuidTestDetail) {
		this.uuidTestDetail = uuidTestDetail;
	}

	public OrderDetail getOrderDetail() {
		return this.orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}