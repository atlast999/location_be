package com.example.accessingdata.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "locations")
public class Location {

	@Id
	@Column(name = "beacon_address")
	private String beaconAddress; 
	
	@Column(name = "rssi")
	private int rssi; 
	
	@Column(name = "distance")
	private Double distance; 
	
	@Column(name = "last_seen")
	private Long lastSeen; 
	
	@Column(name = "uuid")
	private String uuid; 
	
	@Column(name = "major")
	private String major; 
	
	@Column(name = "minor")
	private String minor;


	public String getBeaconAddress() {
		return beaconAddress;
	}

	public void setBeaconAddress(String beaconAddress) {
		this.beaconAddress = beaconAddress;
	}

	public int getRssi() {
		return rssi;
	}

	public void setRssi(int rssi) {
		this.rssi = rssi;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Long getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(Long lastSeen) {
		this.lastSeen = lastSeen;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

}
