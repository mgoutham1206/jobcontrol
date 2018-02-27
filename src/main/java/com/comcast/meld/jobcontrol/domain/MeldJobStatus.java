package com.comcast.meld.jobcontrol.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;


/**
 * The persistent class for the MELD_JOB_STATUS database table.
 * 
 */
@Entity
@Table(name="MELD_JOB_STATUS")
@NamedQuery(name="MeldJobStatus.findAll", query="SELECT m FROM MeldJobStatus m")
public class MeldJobStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="JOB_STATUS_ID")
	private long jobStatusId;

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

	@Temporal(TemporalType.DATE)
	@Column(name="DATA_DATE")
	private Date dataDate;

	@Column(name="DELETED_ROWS")
	private String deletedRows;

	@Temporal(TemporalType.DATE)
	@Column(name="END_TIME")
	private Date endTime;

	@Column(name="INSERTED_ROWS")
	private String insertedRows;

	private String ref1;

	private String ref2;

	@Temporal(TemporalType.DATE)
	@Column(name="START_TIME")
	private Date startTime;

	private String status;

	@Column(name="TOTAL_ROWS")
	private String totalRows;

	@Column(name="UPDATED_ROWS")
	private String updatedRows;

	//bi-directional many-to-one association to MeldProgramNm
	@ManyToOne
	@JoinColumn(name="PROGRAM_ID")
	@JsonIgnore
	private MeldProgramNm meldProgramNm;

	public MeldJobStatus() {
	}

	public long getJobStatusId() {
		return this.jobStatusId;
	}

	public void setJobStatusId(long jobStatusId) {
		this.jobStatusId = jobStatusId;
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

	public Date getDataDate() {
		return this.dataDate;
	}

	public void setDataDate(Date dataDate) {
		this.dataDate = dataDate;
	}

	public String getDeletedRows() {
		return this.deletedRows;
	}

	public void setDeletedRows(String deletedRows) {
		this.deletedRows = deletedRows;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getInsertedRows() {
		return this.insertedRows;
	}

	public void setInsertedRows(String insertedRows) {
		this.insertedRows = insertedRows;
	}

	public String getRef1() {
		return this.ref1;
	}

	public void setRef1(String ref1) {
		this.ref1 = ref1;
	}

	public String getRef2() {
		return this.ref2;
	}

	public void setRef2(String ref2) {
		this.ref2 = ref2;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTotalRows() {
		return this.totalRows;
	}

	public void setTotalRows(String totalRows) {
		this.totalRows = totalRows;
	}

	public String getUpdatedRows() {
		return this.updatedRows;
	}

	public void setUpdatedRows(String updatedRows) {
		this.updatedRows = updatedRows;
	}

	public MeldProgramNm getMeldProgramNm() {
		return this.meldProgramNm;
	}

	public void setMeldProgramNm(MeldProgramNm meldProgramNm) {
		this.meldProgramNm = meldProgramNm;
	}

}