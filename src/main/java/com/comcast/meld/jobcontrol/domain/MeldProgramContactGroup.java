package com.comcast.meld.jobcontrol.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the MELD_PROGRAM_CONTACT_GROUPS database table.
 * 
 */
@Entity
@Table(name="MELD_PROGRAM_CONTACT_GROUPS")
@NamedQuery(name="MeldProgramContactGroup.findAll", query="SELECT m FROM MeldProgramContactGroup m")
public class MeldProgramContactGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MeldProgramContactGroupPK id;

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

	@Column(name="GROUP_NAME")
	private String groupName;

	//bi-directional many-to-one association to MeldContact
	@ManyToOne
	@JoinColumn(name="CONTACT_ID",insertable = false, updatable = false)
	@JsonIgnore
	private MeldContact meldContact;

	public MeldProgramContactGroup() {
	}

	public MeldProgramContactGroupPK getId() {
		return this.id;
	}

	public void setId(MeldProgramContactGroupPK id) {
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

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public MeldContact getMeldContact() {
		return this.meldContact;
	}

	public void setMeldContact(MeldContact meldContact) {
		this.meldContact = meldContact;
	}

}