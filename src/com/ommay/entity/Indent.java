package com.ommay.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Indent entity. @author MyEclipse Persistence Tools
 */

public class Indent implements java.io.Serializable {

	// Fields

	private Long uuidIndent;
	private Boolean paid;
	private Long moneyIndent;
	private Boolean finishIndent;
	private String indentUniqueId;
	private Set indentGroups = new HashSet(0);
	private Set indentVips = new HashSet(0);
	private Set orderDetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Indent() {
	}

	/** minimal constructor */
	public Indent(Long uuidIndent) {
		this.uuidIndent = uuidIndent;
	}

	/** full constructor */
	public Indent(Long uuidIndent, Boolean paid, Long moneyIndent,
			Boolean finishIndent, String indentUniqueId, Set indentGroups,
			Set indentVips, Set orderDetails) {
		this.uuidIndent = uuidIndent;
		this.paid = paid;
		this.moneyIndent = moneyIndent;
		this.finishIndent = finishIndent;
		this.indentUniqueId = indentUniqueId;
		this.indentGroups = indentGroups;
		this.indentVips = indentVips;
		this.orderDetails = orderDetails;
	}

	// Property accessors

	public Long getUuidIndent() {
		return this.uuidIndent;
	}

	public void setUuidIndent(Long uuidIndent) {
		this.uuidIndent = uuidIndent;
	}

	public Boolean getPaid() {
		return this.paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	public Long getMoneyIndent() {
		return this.moneyIndent;
	}

	public void setMoneyIndent(Long moneyIndent) {
		this.moneyIndent = moneyIndent;
	}

	public Boolean getFinishIndent() {
		return this.finishIndent;
	}

	public void setFinishIndent(Boolean finishIndent) {
		this.finishIndent = finishIndent;
	}

	public String getIndentUniqueId() {
		return this.indentUniqueId;
	}

	public void setIndentUniqueId(String indentUniqueId) {
		this.indentUniqueId = indentUniqueId;
	}

	public Set getIndentGroups() {
		return this.indentGroups;
	}

	public void setIndentGroups(Set indentGroups) {
		this.indentGroups = indentGroups;
	}

	public Set getIndentVips() {
		return this.indentVips;
	}

	public void setIndentVips(Set indentVips) {
		this.indentVips = indentVips;
	}

	public Set getOrderDetails() {
		return this.orderDetails;
	}

	public void setOrderDetails(Set orderDetails) {
		this.orderDetails = orderDetails;
	}

}