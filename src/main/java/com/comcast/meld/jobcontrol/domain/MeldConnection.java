package com.comcast.meld.jobcontrol.domain;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the MELD_CONNECTIONS database table.
 * 
 */
@Entity
@Table(name="MELD_CONNECTIONS")
@NamedQuery(name="MeldConnection.findAll", query="SELECT m FROM MeldConnection m")
public class MeldConnection implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CONNECTION_ID")
	private long connectionId;

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

	@Column(name="AUTH_PASSWORD")
	private String authPassword;

	@Column(name="AUTH_USERNAME")
	private String authUsername;

	@Column(name="CONN_TYPE")
	private String connType;

	@Column(name="\"HOST\"")
	private String host;

	private String name;

	private BigDecimal port;

	private String ref1;

	private String ref2;

	private String url;

	//bi-directional many-to-one association to MeldProgramConnection
	@OneToMany(mappedBy="meldConnection")
	@JsonIgnore
	private List<MeldProgramConnection> meldProgramConnections;

	public MeldConnection() {
	}

	public long getConnectionId() {
		return this.connectionId;
	}

	public void setConnectionId(long connectionId) {
		this.connectionId = connectionId;
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

	public String getAuthPassword() {
		return this.authPassword;
	}

	public void setAuthPassword(String authPassword) {
		this.authPassword = authPassword;
	}

	public String getAuthUsername() {
		return this.authUsername;
	}

	public void setAuthUsername(String authUsername) {
		this.authUsername = authUsername;
	}

	public String getConnType() {
		return this.connType;
	}

	public void setConnType(String connType) {
		this.connType = connType;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPort() {
		return this.port;
	}

	public void setPort(BigDecimal port) {
		this.port = port;
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<MeldProgramConnection> getMeldProgramConnections() {
		return this.meldProgramConnections;
	}

	public void setMeldProgramConnections(List<MeldProgramConnection> meldProgramConnections) {
		this.meldProgramConnections = meldProgramConnections;
	}

	public MeldProgramConnection addMeldProgramConnection(MeldProgramConnection meldProgramConnection) {
		getMeldProgramConnections().add(meldProgramConnection);
		meldProgramConnection.setMeldConnection(this);

		return meldProgramConnection;
	}

	public MeldProgramConnection removeMeldProgramConnection(MeldProgramConnection meldProgramConnection) {
		getMeldProgramConnections().remove(meldProgramConnection);
		meldProgramConnection.setMeldConnection(null);

		return meldProgramConnection;
	}

}