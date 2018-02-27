package com.comcast.meld.jobcontrol.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MELD_VARIABLES database table.
 * 
 */
@Entity
@Table(name="MELD_VARIABLES")
@NamedQuery(name="MeldVariable.findAll", query="SELECT m FROM MeldVariable m")
public class MeldVariable implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VARIABLE_ID")
	private long variableId;

	@Column(name="ACTIVE_IND")
	private BigDecimal activeInd;

	@Temporal(TemporalType.DATE)
	@Column(name="AUD_CREATE_DT")
	private Date audCreateDt;

	@Column(name="AUD_CREATE_USER")
	private String audCreateUser;

	@Temporal(TemporalType.DATE)
	@Column(name="AUD_MODIFY_DT")
	private Date audModifyDt;

	@Column(name="AUD_MODIFY_USER")
	private String audModifyUser;

	@Column(name="VARIABLE_NAME")
	private String variableName;

	@Column(name="VARIABLE_VALUE")
	private String variableValue;

	//bi-directional many-to-one association to MeldProgramNm
	@ManyToOne
	@JoinColumn(name="PROGRAM_ID",insertable = false, updatable = false)
	@JsonIgnore
	private MeldProgramNm meldProgramNm;

	public MeldVariable() {
	}

	public long getVariableId() {
		return this.variableId;
	}

	public void setVariableId(long variableId) {
		this.variableId = variableId;
	}

	public BigDecimal getActiveInd() {
		return this.activeInd;
	}

	public void setActiveInd(BigDecimal activeInd) {
		this.activeInd = activeInd;
	}

	public Date getAudCreateDt() {
		return this.audCreateDt;
	}

	public void setAudCreateDt(Date audCreateDt) {
		this.audCreateDt = audCreateDt;
	}

	public String getAudCreateUser() {
		return this.audCreateUser;
	}

	public void setAudCreateUser(String audCreateUser) {
		this.audCreateUser = audCreateUser;
	}

	public Date getAudModifyDt() {
		return this.audModifyDt;
	}

	public void setAudModifyDt(Date audModifyDt) {
		this.audModifyDt = audModifyDt;
	}

	public String getAudModifyUser() {
		return this.audModifyUser;
	}

	public void setAudModifyUser(String audModifyUser) {
		this.audModifyUser = audModifyUser;
	}

	public String getVariableName() {
		return this.variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
	}

	public String getVariableValue() {
		return this.variableValue;
	}

	public void setVariableValue(String variableValue) {
		this.variableValue = variableValue;
	}

	public MeldProgramNm getMeldProgramNm() {
		return this.meldProgramNm;
	}

	public void setMeldProgramNm(MeldProgramNm meldProgramNm) {
		this.meldProgramNm = meldProgramNm;
	}

}