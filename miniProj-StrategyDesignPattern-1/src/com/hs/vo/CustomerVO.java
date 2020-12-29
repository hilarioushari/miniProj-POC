package com.hs.vo;

public class CustomerVO {

	private String cName;
	private String cAdd;
	private String pAmt;
	private String rate;
	private String time;
	private String intrAmt;
	
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

	public String getpAmt() {
		return pAmt;
	}

	public void setpAmt(String pAmt) {
		this.pAmt = pAmt;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getIntrAmt() {
		return intrAmt;
	}

	public void setIntrAmt(String intrAmt) {
		this.intrAmt = intrAmt;
	}

	@Override
	public String toString() {
		return "CustomerVO [cName=" + cName + ", cAdd=" + cAdd + ", pAmt=" + pAmt + ", rate=" + rate + ", time=" + time
				+ ", intrAmt=" + intrAmt + "]";
	}
	
	
}
