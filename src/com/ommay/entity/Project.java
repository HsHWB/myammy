package com.ommay.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Project entity. @author MyEclipse Persistence Tools
 */

public class Project implements java.io.Serializable {

	// Fields

	private Long uuidProject;
	private Account account;
	private String clientName;
	private Boolean projectReviewFlag;
	private Boolean contractReviewFlag;
	private Date timeBegin;
	private Date timeEnd;
	private String addressGroup;
	private String phoneGroup;
	private String emailProject;
	private Integer peopleNumber;
	private String remark;
	private String projectBuilder;
	private Date projectReviewDate;
	private Date contractReviewDate;
	private String projectReviewRemark;
	private String projectReviewMaster;
	private String contractReviewRemark;
	private String contractReviewMaster;
	private Set projectDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Project() {
	}

	/** minimal constructor */
	public Project(Long uuidProject) {
		this.uuidProject = uuidProject;
	}

	/** full constructor */
	public Project(Long uuidProject, Account account, String clientName,
			Boolean projectReviewFlag, Boolean contractReviewFlag,
			Date timeBegin, Date timeEnd, String addressGroup,
			String phoneGroup, String emailProject, Integer peopleNumber,
			String remark, String projectBuilder, Date projectReviewDate,
			Date contractReviewDate, String projectReviewRemark,
			String projectReviewMaster, String contractReviewRemark,
			String contractReviewMaster, Set projectDetails) {
		this.uuidProject = uuidProject;
		this.account = account;
		this.clientName = clientName;
		this.projectReviewFlag = projectReviewFlag;
		this.contractReviewFlag = contractReviewFlag;
		this.timeBegin = timeBegin;
		this.timeEnd = timeEnd;
		this.addressGroup = addressGroup;
		this.phoneGroup = phoneGroup;
		this.emailProject = emailProject;
		this.peopleNumber = peopleNumber;
		this.remark = remark;
		this.projectBuilder = projectBuilder;
		this.projectReviewDate = projectReviewDate;
		this.contractReviewDate = contractReviewDate;
		this.projectReviewRemark = projectReviewRemark;
		this.projectReviewMaster = projectReviewMaster;
		this.contractReviewRemark = contractReviewRemark;
		this.contractReviewMaster = contractReviewMaster;
		this.projectDetails = projectDetails;
	}

	// Property accessors

	public Long getUuidProject() {
		return this.uuidProject;
	}

	public void setUuidProject(Long uuidProject) {
		this.uuidProject = uuidProject;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Boolean getProjectReviewFlag() {
		return this.projectReviewFlag;
	}

	public void setProjectReviewFlag(Boolean projectReviewFlag) {
		this.projectReviewFlag = projectReviewFlag;
	}

	public Boolean getContractReviewFlag() {
		return this.contractReviewFlag;
	}

	public void setContractReviewFlag(Boolean contractReviewFlag) {
		this.contractReviewFlag = contractReviewFlag;
	}

	public Date getTimeBegin() {
		return this.timeBegin;
	}

	public void setTimeBegin(Date timeBegin) {
		this.timeBegin = timeBegin;
	}

	public Date getTimeEnd() {
		return this.timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public String getAddressGroup() {
		return this.addressGroup;
	}

	public void setAddressGroup(String addressGroup) {
		this.addressGroup = addressGroup;
	}

	public String getPhoneGroup() {
		return this.phoneGroup;
	}

	public void setPhoneGroup(String phoneGroup) {
		this.phoneGroup = phoneGroup;
	}

	public String getEmailProject() {
		return this.emailProject;
	}

	public void setEmailProject(String emailProject) {
		this.emailProject = emailProject;
	}

	public Integer getPeopleNumber() {
		return this.peopleNumber;
	}

	public void setPeopleNumber(Integer peopleNumber) {
		this.peopleNumber = peopleNumber;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getProjectBuilder() {
		return this.projectBuilder;
	}

	public void setProjectBuilder(String projectBuilder) {
		this.projectBuilder = projectBuilder;
	}

	public Date getProjectReviewDate() {
		return this.projectReviewDate;
	}

	public void setProjectReviewDate(Date projectReviewDate) {
		this.projectReviewDate = projectReviewDate;
	}

	public Date getContractReviewDate() {
		return this.contractReviewDate;
	}

	public void setContractReviewDate(Date contractReviewDate) {
		this.contractReviewDate = contractReviewDate;
	}

	public String getProjectReviewRemark() {
		return this.projectReviewRemark;
	}

	public void setProjectReviewRemark(String projectReviewRemark) {
		this.projectReviewRemark = projectReviewRemark;
	}

	public String getProjectReviewMaster() {
		return this.projectReviewMaster;
	}

	public void setProjectReviewMaster(String projectReviewMaster) {
		this.projectReviewMaster = projectReviewMaster;
	}

	public String getContractReviewRemark() {
		return this.contractReviewRemark;
	}

	public void setContractReviewRemark(String contractReviewRemark) {
		this.contractReviewRemark = contractReviewRemark;
	}

	public String getContractReviewMaster() {
		return this.contractReviewMaster;
	}

	public void setContractReviewMaster(String contractReviewMaster) {
		this.contractReviewMaster = contractReviewMaster;
	}

	public Set getProjectDetails() {
		return this.projectDetails;
	}

	public void setProjectDetails(Set projectDetails) {
		this.projectDetails = projectDetails;
	}

}