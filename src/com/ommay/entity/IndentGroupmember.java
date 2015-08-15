package com.ommay.entity;

/**
 * IndentGroupmember entity. @author MyEclipse Persistence Tools
 */

public class IndentGroupmember implements java.io.Serializable {

	// Fields

	private Long indentMemberUniqueId;
	private IndentGroup indentGroup;
	private String indentIncId;
	private String indentGroupMemberName;
	private String indentGroupMemberSex;
	private Integer indentGroupMemberAge;
	private String indentGroupMemberSicknessHistory;

	// Constructors

	/** default constructor */
	public IndentGroupmember() {
	}

	/** minimal constructor */
	public IndentGroupmember(Long indentMemberUniqueId) {
		this.indentMemberUniqueId = indentMemberUniqueId;
	}

	/** full constructor */
	public IndentGroupmember(Long indentMemberUniqueId,
			IndentGroup indentGroup, String indentIncId,
			String indentGroupMemberName, String indentGroupMemberSex,
			Integer indentGroupMemberAge,
			String indentGroupMemberSicknessHistory) {
		this.indentMemberUniqueId = indentMemberUniqueId;
		this.indentGroup = indentGroup;
		this.indentIncId = indentIncId;
		this.indentGroupMemberName = indentGroupMemberName;
		this.indentGroupMemberSex = indentGroupMemberSex;
		this.indentGroupMemberAge = indentGroupMemberAge;
		this.indentGroupMemberSicknessHistory = indentGroupMemberSicknessHistory;
	}

	// Property accessors

	public Long getIndentMemberUniqueId() {
		return this.indentMemberUniqueId;
	}

	public void setIndentMemberUniqueId(Long indentMemberUniqueId) {
		this.indentMemberUniqueId = indentMemberUniqueId;
	}

	public IndentGroup getIndentGroup() {
		return this.indentGroup;
	}

	public void setIndentGroup(IndentGroup indentGroup) {
		this.indentGroup = indentGroup;
	}

	public String getIndentIncId() {
		return this.indentIncId;
	}

	public void setIndentIncId(String indentIncId) {
		this.indentIncId = indentIncId;
	}

	public String getIndentGroupMemberName() {
		return this.indentGroupMemberName;
	}

	public void setIndentGroupMemberName(String indentGroupMemberName) {
		this.indentGroupMemberName = indentGroupMemberName;
	}

	public String getIndentGroupMemberSex() {
		return this.indentGroupMemberSex;
	}

	public void setIndentGroupMemberSex(String indentGroupMemberSex) {
		this.indentGroupMemberSex = indentGroupMemberSex;
	}

	public Integer getIndentGroupMemberAge() {
		return this.indentGroupMemberAge;
	}

	public void setIndentGroupMemberAge(Integer indentGroupMemberAge) {
		this.indentGroupMemberAge = indentGroupMemberAge;
	}

	public String getIndentGroupMemberSicknessHistory() {
		return this.indentGroupMemberSicknessHistory;
	}

	public void setIndentGroupMemberSicknessHistory(
			String indentGroupMemberSicknessHistory) {
		this.indentGroupMemberSicknessHistory = indentGroupMemberSicknessHistory;
	}

}