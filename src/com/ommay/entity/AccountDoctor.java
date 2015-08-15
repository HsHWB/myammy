package com.ommay.entity;

/**
 * AccountDoctor entity. @author MyEclipse Persistence Tools
 */

public class AccountDoctor implements java.io.Serializable {

	// Fields

	private String accountDoctor;
	private Account account;
	private String passwordDoctor;
	private String departmentDoctor;
	private String positionDoctor;
	private String emailDoctor;

	// Constructors

	/** default constructor */
	public AccountDoctor() {
	}

	/** minimal constructor */
	public AccountDoctor(String accountDoctor) {
		this.accountDoctor = accountDoctor;
	}

	/** full constructor */
	public AccountDoctor(String accountDoctor, Account account,
			String passwordDoctor, String departmentDoctor,
			String positionDoctor, String emailDoctor) {
		this.accountDoctor = accountDoctor;
		this.account = account;
		this.passwordDoctor = passwordDoctor;
		this.departmentDoctor = departmentDoctor;
		this.positionDoctor = positionDoctor;
		this.emailDoctor = emailDoctor;
	}

	// Property accessors

	public String getAccountDoctor() {
		return this.accountDoctor;
	}

	public void setAccountDoctor(String accountDoctor) {
		this.accountDoctor = accountDoctor;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getPasswordDoctor() {
		return this.passwordDoctor;
	}

	public void setPasswordDoctor(String passwordDoctor) {
		this.passwordDoctor = passwordDoctor;
	}

	public String getDepartmentDoctor() {
		return this.departmentDoctor;
	}

	public void setDepartmentDoctor(String departmentDoctor) {
		this.departmentDoctor = departmentDoctor;
	}

	public String getPositionDoctor() {
		return this.positionDoctor;
	}

	public void setPositionDoctor(String positionDoctor) {
		this.positionDoctor = positionDoctor;
	}

	public String getEmailDoctor() {
		return this.emailDoctor;
	}

	public void setEmailDoctor(String emailDoctor) {
		this.emailDoctor = emailDoctor;
	}

}