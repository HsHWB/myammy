package com.ommay.entity;

/**
 * AccountClient entity. @author MyEclipse Persistence Tools
 */

public class AccountClient implements java.io.Serializable {

	// Fields

	private String accountClient;
	private Account account;
	private String passwordClient;
	private String nameClient;
	private String sexIndent;
	private String phoneClient;
	private String identityCardNumber;
	private String emailClient;
	private String sicknessHistory;
	private String addressClient;

	// Constructors

	/** default constructor */
	public AccountClient() {
	}

	/** minimal constructor */
	public AccountClient(String accountClient) {
		this.accountClient = accountClient;
	}

	/** full constructor */
	public AccountClient(String accountClient, Account account,
			String passwordClient, String nameClient, String sexIndent,
			String phoneClient, String identityCardNumber, String emailClient,
			String sicknessHistory, String addressClient) {
		this.accountClient = accountClient;
		this.account = account;
		this.passwordClient = passwordClient;
		this.nameClient = nameClient;
		this.sexIndent = sexIndent;
		this.phoneClient = phoneClient;
		this.identityCardNumber = identityCardNumber;
		this.emailClient = emailClient;
		this.sicknessHistory = sicknessHistory;
		this.addressClient = addressClient;
	}

	// Property accessors

	public String getAccountClient() {
		return this.accountClient;
	}

	public void setAccountClient(String accountClient) {
		this.accountClient = accountClient;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getPasswordClient() {
		return this.passwordClient;
	}

	public void setPasswordClient(String passwordClient) {
		this.passwordClient = passwordClient;
	}

	public String getNameClient() {
		return this.nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public String getSexIndent() {
		return this.sexIndent;
	}

	public void setSexIndent(String sexIndent) {
		this.sexIndent = sexIndent;
	}

	public String getPhoneClient() {
		return this.phoneClient;
	}

	public void setPhoneClient(String phoneClient) {
		this.phoneClient = phoneClient;
	}

	public String getIdentityCardNumber() {
		return this.identityCardNumber;
	}

	public void setIdentityCardNumber(String identityCardNumber) {
		this.identityCardNumber = identityCardNumber;
	}

	public String getEmailClient() {
		return this.emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public String getSicknessHistory() {
		return this.sicknessHistory;
	}

	public void setSicknessHistory(String sicknessHistory) {
		this.sicknessHistory = sicknessHistory;
	}

	public String getAddressClient() {
		return this.addressClient;
	}

	public void setAddressClient(String addressClient) {
		this.addressClient = addressClient;
	}

}