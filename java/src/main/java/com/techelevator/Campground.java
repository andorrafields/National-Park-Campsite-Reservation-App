package com.techelevator;

public class Campground {
	
	private int campgroundId;
	private int parkId;
	private String campgroundName;
	private String openMonth;
	private String closeMonth;
	private double dailyFee;
	
	
	
	public int getCampgroundId() {
		return campgroundId;
	}
	public void setCampgroundId(int campgroundId) {
		this.campgroundId = campgroundId;
	}
	public int getParkId() {
		return parkId;
	}
	public void setParkId(int parkId) {
		this.parkId = parkId;
	}
	public String getCampgroundName() {
		return campgroundName;
	}
	public void setCampgroundName(String campgroundName) {
		this.campgroundName = campgroundName;
	}
	public String getOpenMonth() {
		return openMonth;
	}
	public void setOpenMonth(String openMonth) {
		this.openMonth = openMonth;
	}
	public String getCloseMonth() {
		return closeMonth;
	}
	public void setCloseMonth(String closeMonth) {
		this.closeMonth = closeMonth;
	}
	public double getDailyFee() {
		return dailyFee;
	}
	public void setDailyFee(double dailyFee) {
		this.dailyFee = dailyFee;
	}

}
