package com.ommay.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * ProjectDetail entity. @author MyEclipse Persistence Tools
 */

public class ProjectDetail implements java.io.Serializable {

	// Fields

	private Long uuidProjectDetail;
	private Project project;
	private Long uuidOrderDetail;
	private String testType;
	private Integer number;
	private Set orderDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public ProjectDetail() {
	}

	/** minimal constructor */
	public ProjectDetail(Long uuidProjectDetail) {
		this.uuidProjectDetail = uuidProjectDetail;
	}

	/** full constructor */
	public ProjectDetail(Long uuidProjectDetail, Project project,
			Long uuidOrderDetail, String testType, Integer number,
			Set orderDetails) {
		this.uuidProjectDetail = uuidProjectDetail;
		this.project = project;
		this.uuidOrderDetail = uuidOrderDetail;
		this.testType = testType;
		this.number = number;
		this.orderDetails = orderDetails;
	}

	// Property accessors

	public Long getUuidProjectDetail() {
		return this.uuidProjectDetail;
	}

	public void setUuidProjectDetail(Long uuidProjectDetail) {
		this.uuidProjectDetail = uuidProjectDetail;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Long getUuidOrderDetail() {
		return this.uuidOrderDetail;
	}

	public void setUuidOrderDetail(Long uuidOrderDetail) {
		this.uuidOrderDetail = uuidOrderDetail;
	}

	public String getTestType() {
		return this.testType;
	}

	public void setTestType(String testType) {
		this.testType = testType;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Set getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set orderDetails) {
		this.orderDetails = orderDetails;
	}

}