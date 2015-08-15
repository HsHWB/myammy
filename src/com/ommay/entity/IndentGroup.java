package com.ommay.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * IndentGroup entity. @author MyEclipse Persistence Tools
 */

public class IndentGroup implements java.io.Serializable {

	// Fields

	private Long indentGroupUniqueId;
	private Indent indent;
	private String indentGroupName;
	private Set indentGroupmembers = new HashSet(0);

	// Constructors

	/** default constructor */
	public IndentGroup() {
	}

	/** minimal constructor */
	public IndentGroup(Long indentGroupUniqueId) {
		this.indentGroupUniqueId = indentGroupUniqueId;
	}

	/** full constructor */
	public IndentGroup(Long indentGroupUniqueId, Indent indent,
			String indentGroupName, Set indentGroupmembers) {
		this.indentGroupUniqueId = indentGroupUniqueId;
		this.indent = indent;
		this.indentGroupName = indentGroupName;
		this.indentGroupmembers = indentGroupmembers;
	}

	// Property accessors

	public Long getIndentGroupUniqueId() {
		return this.indentGroupUniqueId;
	}

	public void setIndentGroupUniqueId(Long indentGroupUniqueId) {
		this.indentGroupUniqueId = indentGroupUniqueId;
	}

	public Indent getIndent() {
		return this.indent;
	}

	public void setIndent(Indent indent) {
		this.indent = indent;
	}

	public String getIndentGroupName() {
		return this.indentGroupName;
	}

	public void setIndentGroupName(String indentGroupName) {
		this.indentGroupName = indentGroupName;
	}

	public Set getIndentGroupmembers() {
		return this.indentGroupmembers;
	}

	public void setIndentGroupmembers(Set indentGroupmembers) {
		this.indentGroupmembers = indentGroupmembers;
	}

}