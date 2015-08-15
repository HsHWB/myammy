package com.ommay.entity;

/**
 * IndentVip entity. @author MyEclipse Persistence Tools
 */

public class IndentVip implements java.io.Serializable {

	// Fields

	private Long indentVipUniqueId;
	private Indent indent;
	private String accountClientIndent;
	private String indentVipName;
	private String indentVipSex;
	private String indentVipPhone;
	private String indentVipIdcard;
	private String indentVipEmail;
	private String indentVipAddress;
	private String indentVipSicknessHistory;

	// Constructors

	/** default constructor */
	public IndentVip() {
	}

	/** minimal constructor */
	public IndentVip(Long indentVipUniqueId) {
		this.indentVipUniqueId = indentVipUniqueId;
	}

	/** full constructor */
	public IndentVip(Long indentVipUniqueId, Indent indent,
			String accountClientIndent, String indentVipName,
			String indentVipSex, String indentVipPhone, String indentVipIdcard,
			String indentVipEmail, String indentVipAddress,
			String indentVipSicknessHistory) {
		this.indentVipUniqueId = indentVipUniqueId;
		this.indent = indent;
		this.accountClientIndent = accountClientIndent;
		this.indentVipName = indentVipName;
		this.indentVipSex = indentVipSex;
		this.indentVipPhone = indentVipPhone;
		this.indentVipIdcard = indentVipIdcard;
		this.indentVipEmail = indentVipEmail;
		this.indentVipAddress = indentVipAddress;
		this.indentVipSicknessHistory = indentVipSicknessHistory;
	}

	// Property accessors

	public Long getIndentVipUniqueId() {
		return this.indentVipUniqueId;
	}

	public void setIndentVipUniqueId(Long indentVipUniqueId) {
		this.indentVipUniqueId = indentVipUniqueId;
	}

	public Indent getIndent() {
		return this.indent;
	}

	public void setIndent(Indent indent) {
		this.indent = indent;
	}

	public String getAccountClientIndent() {
		return this.accountClientIndent;
	}

	public void setAccountClientIndent(String accountClientIndent) {
		this.accountClientIndent = accountClientIndent;
	}

	public String getIndentVipName() {
		return this.indentVipName;
	}

	public void setIndentVipName(String indentVipName) {
		this.indentVipName = indentVipName;
	}

	public String getIndentVipSex() {
		return this.indentVipSex;
	}

	public void setIndentVipSex(String indentVipSex) {
		this.indentVipSex = indentVipSex;
	}

	public String getIndentVipPhone() {
		return this.indentVipPhone;
	}

	public void setIndentVipPhone(String indentVipPhone) {
		this.indentVipPhone = indentVipPhone;
	}

	public String getIndentVipIdcard() {
		return this.indentVipIdcard;
	}

	public void setIndentVipIdcard(String indentVipIdcard) {
		this.indentVipIdcard = indentVipIdcard;
	}

	public String getIndentVipEmail() {
		return this.indentVipEmail;
	}

	public void setIndentVipEmail(String indentVipEmail) {
		this.indentVipEmail = indentVipEmail;
	}

	public String getIndentVipAddress() {
		return this.indentVipAddress;
	}

	public void setIndentVipAddress(String indentVipAddress) {
		this.indentVipAddress = indentVipAddress;
	}

	public String getIndentVipSicknessHistory() {
		return this.indentVipSicknessHistory;
	}

	public void setIndentVipSicknessHistory(String indentVipSicknessHistory) {
		this.indentVipSicknessHistory = indentVipSicknessHistory;
	}

}