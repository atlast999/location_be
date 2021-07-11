package com.example.accessingdata.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beacons")
public class Beacon {

	@Id
	@Column(name = "beacon_address")
	private String beaconAddress; 
	
	@Column(name = "txPower")
	private int txPower; 
	
	@Column(name = "xAxis")
	private float xAxis; 
	
	@Column(name = "yAxis")
	private float yAxis;

	public String getBeaconAddress() {
		return beaconAddress;
	}

	public void setBeaconAddress(String beaconAddress) {
		this.beaconAddress = beaconAddress;
	}

	public int getTxPower() {
		return txPower;
	}

	public void setTxPower(int txPower) {
		this.txPower = txPower;
	}

	public float getxAxis() {
		return xAxis;
	}

	public void setxAxis(float xAxis) {
		this.xAxis = xAxis;
	}

	public float getyAxis() {
		return yAxis;
	}

	public void setyAxis(float yAxis) {
		this.yAxis = yAxis;
	}
}
