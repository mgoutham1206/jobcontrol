package com.comcast.meld.jobcontrol.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the MELD_PROGRAM_NM database table.
 * 
 */
@Entity
@Table(name="MELD_PROGRAM_NM")
@NamedQuery(name="MeldProgramNm.findAll", query="SELECT m FROM MeldProgramNm m")
public class MeldProgramNm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROGRAM_ID")
	private Integer programId;

	@Column(name="ACTIVE_IND")
	private BigDecimal activeInd;

	@Column(name="ACTUAL_FREQ")
	private String actualFreq;

	@Column(name="ACTUAL_SCHED_TIME")
	private String actualSchedTime;

	@Column(name="APP_NAME")
	private String appName;

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

	@Column(name="CLUSTER_NAME")
	private String clusterName;

	@Column(name="CONTACT_GROUP_ID")
	private BigDecimal contactGroupId;

	private String descr;

	@Column(name="GROUP_NAME")
	private String groupName;

	private String name;

	@Column(name="PARENT_ID")
	private BigDecimal parentId;

	@Column(name="PLAN_FREQ")
	private String planFreq;

	@Column(name="PLAN_SCHED_TIME")
	private String planSchedTime;

	@Column(name="SLA_EXTERNAL_CONTACT_GROUP_ID")
	private BigDecimal slaExternalContactGroupId;

	@Column(name="SLA_EXTERNAL_ET")
	private String slaExternalEt;

	@Column(name="SLA_INTERNAL_CONTACT_GROUP_ID")
	private BigDecimal slaInternalContactGroupId;

	@Column(name="SLA_INTERNAL_ET")
	private String slaInternalEt;

	@Column(name="TASK_ID")
	private BigDecimal taskId;

	@Column(name="WF_JOB_NAME")
	private String wfJobName;

	//bi-directional many-to-one association to MeldJobStatus
	@OneToMany(mappedBy="meldProgramNm")
	@JsonIgnore
	private List<MeldJobStatus> meldJobStatuses;

	//bi-directional many-to-one association to MeldVariable
	@OneToMany(mappedBy="meldProgramNm")
	@JsonIgnore
	private List<MeldVariable> meldVariables;

	public MeldProgramNm() {
	}

	public Integer getProgramId() {
		return this.programId;
	}

	public void setProgramId(Integer programId) {
		this.programId = programId;
	}

	public BigDecimal getActiveInd() {
		return this.activeInd;
	}

	public void setActiveInd(BigDecimal activeInd) {
		this.activeInd = activeInd;
	}

	public String getActualFreq() {
		return this.actualFreq;
	}

	public void setActualFreq(String actualFreq) {
		this.actualFreq = actualFreq;
	}

	public String getActualSchedTime() {
		return this.actualSchedTime;
	}

	public void setActualSchedTime(String actualSchedTime) {
		this.actualSchedTime = actualSchedTime;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
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

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	public BigDecimal getContactGroupId() {
		return this.contactGroupId;
	}

	public void setContactGroupId(BigDecimal contactGroupId) {
		this.contactGroupId = contactGroupId;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getParentId() {
		return this.parentId;
	}

	public void setParentId(BigDecimal parentId) {
		this.parentId = parentId;
	}

	public String getPlanFreq() {
		return this.planFreq;
	}

	public void setPlanFreq(String planFreq) {
		this.planFreq = planFreq;
	}

	public String getPlanSchedTime() {
		return this.planSchedTime;
	}

	public void setPlanSchedTime(String planSchedTime) {
		this.planSchedTime = planSchedTime;
	}

	public BigDecimal getSlaExternalContactGroupId() {
		return this.slaExternalContactGroupId;
	}

	public void setSlaExternalContactGroupId(BigDecimal slaExternalContactGroupId) {
		this.slaExternalContactGroupId = slaExternalContactGroupId;
	}

	public String getSlaExternalEt() {
		return this.slaExternalEt;
	}

	public void setSlaExternalEt(String slaExternalEt) {
		this.slaExternalEt = slaExternalEt;
	}

	public BigDecimal getSlaInternalContactGroupId() {
		return this.slaInternalContactGroupId;
	}

	public void setSlaInternalContactGroupId(BigDecimal slaInternalContactGroupId) {
		this.slaInternalContactGroupId = slaInternalContactGroupId;
	}

	public String getSlaInternalEt() {
		return this.slaInternalEt;
	}

	public void setSlaInternalEt(String slaInternalEt) {
		this.slaInternalEt = slaInternalEt;
	}

	public BigDecimal getTaskId() {
		return this.taskId;
	}

	public void setTaskId(BigDecimal taskId) {
		this.taskId = taskId;
	}

	public String getWfJobName() {
		return this.wfJobName;
	}

	public void setWfJobName(String wfJobName) {
		this.wfJobName = wfJobName;
	}

	public List<MeldJobStatus> getMeldJobStatuses() {
		return this.meldJobStatuses;
	}

	public void setMeldJobStatuses(List<MeldJobStatus> meldJobStatuses) {
		this.meldJobStatuses = meldJobStatuses;
	}

	public MeldJobStatus addMeldJobStatus(MeldJobStatus meldJobStatus) {
		getMeldJobStatuses().add(meldJobStatus);
		meldJobStatus.setMeldProgramNm(this);

		return meldJobStatus;
	}

	public MeldJobStatus removeMeldJobStatus(MeldJobStatus meldJobStatus) {
		getMeldJobStatuses().remove(meldJobStatus);
		meldJobStatus.setMeldProgramNm(null);

		return meldJobStatus;
	}

	public List<MeldVariable> getMeldVariables() {
		return this.meldVariables;
	}

	public void setMeldVariables(List<MeldVariable> meldVariables) {
		this.meldVariables = meldVariables;
	}

	public MeldVariable addMeldVariable(MeldVariable meldVariable) {
		getMeldVariables().add(meldVariable);
		meldVariable.setMeldProgramNm(this);

		return meldVariable;
	}

	public MeldVariable removeMeldVariable(MeldVariable meldVariable) {
		getMeldVariables().remove(meldVariable);
		meldVariable.setMeldProgramNm(null);

		return meldVariable;
	}

}