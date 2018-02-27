package com.comcast.meld.jobcontrol.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the MELD_PROGRAM_CONTACT_GROUPS database table.
 * 
 */
@Embeddable
public class MeldProgramContactGroupPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CONTACT_GROUP_ID")
	private long contactGroupId;

	@Column(name="CONTACT_ID", insertable=false, updatable=false)
	private long contactId;

	public MeldProgramContactGroupPK() {
	}
	public long getContactGroupId() {
		return this.contactGroupId;
	}
	public void setContactGroupId(long contactGroupId) {
		this.contactGroupId = contactGroupId;
	}
	public long getContactId() {
		return this.contactId;
	}
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MeldProgramContactGroupPK)) {
			return false;
		}
		MeldProgramContactGroupPK castOther = (MeldProgramContactGroupPK)other;
		return 
			(this.contactGroupId == castOther.contactGroupId)
			&& (this.contactId == castOther.contactId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.contactGroupId ^ (this.contactGroupId >>> 32)));
		hash = hash * prime + ((int) (this.contactId ^ (this.contactId >>> 32)));
		
		return hash;
	}
}