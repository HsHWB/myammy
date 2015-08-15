package com.ommay.entity;

import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

/**
 * OrderDetail entity. @author MyEclipse Persistence Tools
 */

public class OrderDetail implements java.io.Serializable {

	// Fields

	private Long uuidOrderDetail;
	private ProjectDetail projectDetail;
	private Indent indent;
	private Time orderTime;
	private Double moneyOrder;
	private String orderClientName;
	private Set testResults = new HashSet(0);

	// Constructors

	/** default constructor */
	public OrderDetail() {
	}

	/** minimal constructor */
	public OrderDetail(Long uuidOrderDetail) {
		this.uuidOrderDetail = uuidOrderDetail;
	}

	/** full constructor */
	public OrderDetail(Long uuidOrderDetail, ProjectDetail projectDetail,
			Indent indent, Time orderTime, Double moneyOrder,
			String orderClientName, Set testResults) {
		this.uuidOrderDetail = uuidOrderDetail;
		this.projectDetail = projectDetail;
		this.indent = indent;
		this.orderTime = orderTime;
		this.moneyOrder = moneyOrder;
		this.orderClientName = orderClientName;
		this.testResults = testResults;
	}

	// Property accessors

	public Long getUuidOrderDetail() {
		return this.uuidOrderDetail;
	}

	public void setUuidOrderDetail(Long uuidOrderDetail) {
		this.uuidOrderDetail = uuidOrderDetail;
	}

	public ProjectDetail getProjectDetail() {
		return this.projectDetail;
	}

	public void setProjectDetail(ProjectDetail projectDetail) {
		this.projectDetail = projectDetail;
	}

	public Indent getIndent() {
		return this.indent;
	}

	public void setIndent(Indent indent) {
		this.indent = indent;
	}

	public Time getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Time orderTime) {
		this.orderTime = orderTime;
	}

	public Double getMoneyOrder() {
		return this.moneyOrder;
	}

	public void setMoneyOrder(Double moneyOrder) {
		this.moneyOrder = moneyOrder;
	}

	public String getOrderClientName() {
		return this.orderClientName;
	}

	public void setOrderClientName(String orderClientName) {
		this.orderClientName = orderClientName;
	}

	public Set getTestResults() {
		return this.testResults;
	}

	public void setTestResults(Set testResults) {
		this.testResults = testResults;
	}

}