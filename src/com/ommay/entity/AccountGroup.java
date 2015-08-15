package com.ommay.entity;

/**
 * AccountGroup entity. @author MyEclipse Persistence Tools
 */

public class AccountGroup implements java.io.Serializable {

	// Fields

	private String accountGroup;
	private Account account;
	private String passwordGroup;
	private String nameMaster;
	private String phoneMaster;
	private String workingPhoneMaster;

	// Constructors

	/** default constructor */
	public AccountGroup() {
	}

	/** minimal constructor */
	public AccountGroup(String accountGroup) {
		this.accountGroup = accountGroup;
	}

	/** full constructor */
	public AccountGroup(String accountGroup, Account account,
			String passwordGroup, String nameMaster, String phoneMaster,
			String workingPhoneMaster) {
		this.accountGroup = accountGroup;
		this.account = account;
		this.passwordGroup = passwordGroup;
		this.nameMaster = nameMaster;
		this.phoneMaster = phoneMaster;
		this.workingPhoneMaster = workingPhoneMaster;
	}

	// Property accessors

	public String getAccountGroup() {
		return this.accountGroup;
	}

	public void setAccountGroup(String accountGroup) {
		this.accountGroup = accountGroup;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getPasswordGroup() {
		return this.passwordGroup;
	}

	public void setPasswordGroup(String passwordGroup) {
		this.passwordGroup = passwordGroup;
	}

	public String getNameMaster() {
		return this.nameMaster;
	}

	public void setNameMaster(String nameMaster) {
		this.nameMaster = nameMaster;
	}

	public String getPhoneMaster() {
		return this.phoneMaster;
	}

	public void setPhoneMaster(String phoneMaster) {
		this.phoneMaster = phoneMaster;
	}

	public String getWorkingPhoneMaster() {
		return this.workingPhoneMaster;
	}

	public void setWorkingPhoneMaster(String workingPhoneMaster) {
		this.workingPhoneMaster = workingPhoneMaster;
	}

}