package com.ommay.entity;

/**
 * AccountFinance entity. @author MyEclipse Persistence Tools
 */

public class AccountFinance implements java.io.Serializable {

	// Fields

	private String accountFinance;
	private Account account;
	private String passwordFinance;
	private String emailFinance;
	private String departmentFinance;
	private String positionFinance;
	private String nameFinance;
	private String sexFinance;
	private String phoneFinance;

	// Constructors

	/** default constructor */
	public AccountFinance() {
	}

	/** minimal constructor */
	public AccountFinance(String accountFinance) {
		this.accountFinance = accountFinance;
	}

	/** full constructor */
	public AccountFinance(String accountFinance, Account account,
			String passwordFinance, String emailFinance,
			String departmentFinance, String positionFinance,
			String nameFinance, String sexFinance, String phoneFinance) {
		this.accountFinance = accountFinance;
		this.account = account;
		this.passwordFinance = passwordFinance;
		this.emailFinance = emailFinance;
		this.departmentFinance = departmentFinance;
		this.positionFinance = positionFinance;
		this.nameFinance = nameFinance;
		this.sexFinance = sexFinance;
		this.phoneFinance = phoneFinance;
	}

	// Property accessors

	public String getAccountFinance() {
		return this.accountFinance;
	}

	public void setAccountFinance(String accountFinance) {
		this.accountFinance = accountFinance;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getPasswordFinance() {
		return this.passwordFinance;
	}

	public void setPasswordFinance(String passwordFinance) {
		this.passwordFinance = passwordFinance;
	}

	public String getEmailFinance() {
		return this.emailFinance;
	}

	public void setEmailFinance(String emailFinance) {
		this.emailFinance = emailFinance;
	}

	public String getDepartmentFinance() {
		return this.departmentFinance;
	}

	public void setDepartmentFinance(String departmentFinance) {
		this.departmentFinance = departmentFinance;
	}

	public String getPositionFinance() {
		return this.positionFinance;
	}

	public void setPositionFinance(String positionFinance) {
		this.positionFinance = positionFinance;
	}

	public String getNameFinance() {
		return this.nameFinance;
	}

	public void setNameFinance(String nameFinance) {
		this.nameFinance = nameFinance;
	}

	public String getSexFinance() {
		return this.sexFinance;
	}

	public void setSexFinance(String sexFinance) {
		this.sexFinance = sexFinance;
	}

	public String getPhoneFinance() {
		return this.phoneFinance;
	}

	public void setPhoneFinance(String phoneFinance) {
		this.phoneFinance = phoneFinance;
	}

}