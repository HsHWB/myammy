package com.ommay.entity;

/**
 * AccountManager entity. @author MyEclipse Persistence Tools
 */

public class AccountManager implements java.io.Serializable {

	// Fields

	private String accountManager;
	private Account account;
	private String passwordManager;
	private String emailManager;
	private String departmentManager;
	private String positionManager;
	private String nameManager;
	private String sexManager;
	private String phoneManager;

	// Constructors

	/** default constructor */
	public AccountManager() {
	}

	/** minimal constructor */
	public AccountManager(String accountManager) {
		this.accountManager = accountManager;
	}

	/** full constructor */
	public AccountManager(String accountManager, Account account,
			String passwordManager, String emailManager,
			String departmentManager, String positionManager,
			String nameManager, String sexManager, String phoneManager) {
		this.accountManager = accountManager;
		this.account = account;
		this.passwordManager = passwordManager;
		this.emailManager = emailManager;
		this.departmentManager = departmentManager;
		this.positionManager = positionManager;
		this.nameManager = nameManager;
		this.sexManager = sexManager;
		this.phoneManager = phoneManager;
	}

	// Property accessors

	public String getAccountManager() {
		return this.accountManager;
	}

	public void setAccountManager(String accountManager) {
		this.accountManager = accountManager;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getPasswordManager() {
		return this.passwordManager;
	}

	public void setPasswordManager(String passwordManager) {
		this.passwordManager = passwordManager;
	}

	public String getEmailManager() {
		return this.emailManager;
	}

	public void setEmailManager(String emailManager) {
		this.emailManager = emailManager;
	}

	public String getDepartmentManager() {
		return this.departmentManager;
	}

	public void setDepartmentManager(String departmentManager) {
		this.departmentManager = departmentManager;
	}

	public String getPositionManager() {
		return this.positionManager;
	}

	public void setPositionManager(String positionManager) {
		this.positionManager = positionManager;
	}

	public String getNameManager() {
		return this.nameManager;
	}

	public void setNameManager(String nameManager) {
		this.nameManager = nameManager;
	}

	public String getSexManager() {
		return this.sexManager;
	}

	public void setSexManager(String sexManager) {
		this.sexManager = sexManager;
	}

	public String getPhoneManager() {
		return this.phoneManager;
	}

	public void setPhoneManager(String phoneManager) {
		this.phoneManager = phoneManager;
	}

}