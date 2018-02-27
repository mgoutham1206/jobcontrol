package com.comcast.meld.jobcontrol.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MELD_PROGRAM_CONNECTIONS database table.
 * 
 */
@Entity
@Table(name="MELD_PROGRAM_CONNECTIONS")
@NamedQuery(name="MeldProgramConnection.findAll", query="SELECT m FROM MeldProgramConnection m")
public class MeldProgramConnection implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MeldProgramConnectionPK id;

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

	private String descr;

	//bi-directional many-to-one association to MeldConnection
	@ManyToOne
	@JoinColumn(name="CONNECTION_ID",insertable = false, updatable = false)
	@JsonIgnore
	private MeldConnection meldConnection;

	public MeldProgramConnection() {
	}

	public MeldProgramConnectionPK getId() {
		return this.id;
	}

	public void setId(MeldProgramConnectionPK id) {
		this.id = id;
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

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public MeldConnection getMeldConnection() {
		return this.meldConnection;
	}

	public void setMeldConnection(MeldConnection meldConnection) {
		this.meldConnection = meldConnection;
	}

}