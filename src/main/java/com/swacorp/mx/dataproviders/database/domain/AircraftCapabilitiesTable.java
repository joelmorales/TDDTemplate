package com.swacorp.mx.dataproviders.database.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AircraftCapabilities")
public class AircraftCapabilitiesTable {

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	private String id;

	@Column(name = "CapabilityName", length = 20)
	public String CapabilityName;

	@Column(name = "Value", length = 20)
	public String Value;

	public String getCapabilityName() {
		return CapabilityName;
	}

	public String getId() {
		return id;
	}

	public String getValue() {
		return Value;
	}

	public void setCapabilityName(String capabilityName) {
		CapabilityName = capabilityName;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setValue(String value) {
		Value = value;
	}

}
