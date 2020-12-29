package com.hs.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	private String cName;
	private String cAdd;
	private float pAmt;
	private float rate;
	private float time;
	private float intrAmt;
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcAdd() {
		return cAdd;
	}
	public void setcAdd(String cAdd) {
		this.cAdd = cAdd;
	}
	public float getpAmt() {
		return pAmt;
	}
	public void setpAmt(float pAmt) {
		this.pAmt = pAmt;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getTime() {
		return time;
	}
	public void setTime(float time) {
		this.time = time;
	}
	public float getIntrAmt() {
		return intrAmt;
	}
	public void setIntrAmt(float intrAmt) {
		this.intrAmt = intrAmt;
	}
	@Override
	public String toString() {
		return "CustomerDTO [cName=" + cName + ", cAdd=" + cAdd + ", pAmt=" + pAmt + ", rate=" + rate + ", time=" + time
				+ ", intrAmt=" + intrAmt + "]";
	}
	
	
	
}
