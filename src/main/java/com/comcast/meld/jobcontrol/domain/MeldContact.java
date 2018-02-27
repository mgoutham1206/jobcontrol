package com.comcast.meld.jobcontrol.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the MELD_CONTACTS database table.
 * 
 */
@Entity
@Table(name="MELD_CONTACTS")
@NamedQuery(name="MeldContact.findAll", query="SELECT m FROM MeldContact m")
public class MeldContact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CONTACT_ID")
	private long contactId;

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

	private String email;

	private String name;

	private String phone;

	//bi-directional many-to-one association to MeldProgramContactGroup
	@OneToMany(mappedBy="meldContact")
	@JsonIgnore
	private List<MeldProgramContactGroup> meldProgramContactGroups;

	public MeldContact() {
	}

	public long getContactId() {
		return this.contactId;
	}

	public void setContactId(long contactId) {
		this.contactId = contactId;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<MeldProgramContactGroup> getMeldProgramContactGroups() {
		return this.meldProgramContactGroups;
	}

	public void setMeldProgramContactGroups(List<MeldProgramContactGroup> meldProgramContactGroups) {
		this.meldProgramContactGroups = meldProgramContactGroups;
	}

	public MeldProgramContactGroup addMeldProgramContactGroup(MeldProgramContactGroup meldProgramContactGroup) {
		getMeldProgramContactGroups().add(meldProgramContactGroup);
		meldProgramContactGroup.setMeldContact(this);

		return meldProgramContactGroup;
	}

	public MeldProgramContactGroup removeMeldProgramContactGroup(MeldProgramContactGroup meldProgramContactGroup) {
		getMeldProgramContactGroups().remove(meldProgramContactGroup);
		meldProgramContactGroup.setMeldContact(null);

		return meldProgramContactGroup;
	}

}