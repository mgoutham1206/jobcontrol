package com.comcast.meld.jobcontrol.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the MELD_PROGRAM_CONNECTIONS database table.
 * 
 */
@Embeddable
public class MeldProgramConnectionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PROGRAM_ID")
	private long programId;

	@Column(name="CONNECTION_ID", insertable=false, updatable=false)
	private long connectionId;

	public MeldProgramConnectionPK() {
	}
	public long getProgramId() {
		return this.programId;
	}
	public void setProgramId(long programId) {
		this.programId = programId;
	}
	public long getConnectionId() {
		return this.connectionId;
	}
	public void setConnectionId(long connectionId) {
		this.connectionId = connectionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MeldProgramConnectionPK)) {
			return false;
		}
		MeldProgramConnectionPK castOther = (MeldProgramConnectionPK)other;
		return 
			(this.programId == castOther.programId)
			&& (this.connectionId == castOther.connectionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.programId ^ (this.programId >>> 32)));
		hash = hash * prime + ((int) (this.connectionId ^ (this.connectionId >>> 32)));
		
		return hash;
	}
}