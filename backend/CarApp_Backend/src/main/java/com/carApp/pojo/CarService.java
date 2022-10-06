package com.carApp.pojo;

public class CarService {
	private int checkInId;
	private int serviceId;
	private String complaints;
	private String[] additionalCheckUps;
	private String checkInDate;
	private int bill;
	private String checkOutDate;
	
	public CarService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCheckInId() {
		return checkInId;
	}

	public void setCheckInId(int checkInId) {
		this.checkInId = checkInId;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getComplaints() {
		return complaints;
	}

	public void setComplaints(String complaints) {
		this.complaints = complaints;
	}

	public String[] getAdditionalCheckUps() {
		return additionalCheckUps;
	}

	public void setAdditionalCheckUps(String[] additionalCheckUps) {
		this.additionalCheckUps = additionalCheckUps;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public CarService(int checkInId, int serviceId, String complaints, String[] additionalCheckUps, String checkInDate,
			int bill, String checkOutDate) {
		super();
		this.checkInId = checkInId;
		this.serviceId = serviceId;
		this.complaints = complaints;
		this.additionalCheckUps = additionalCheckUps;
		this.checkInDate = checkInDate;
		this.bill = bill;
		this.checkOutDate = checkOutDate;
	}

	@Override
	public String toString() {
		return "CarService [checkInId=" + checkInId + ", serviceId=" + serviceId + ", complaints=" + complaints
				+ ", additionalCheckUps=" + additionalCheckUps + ", checkInDate=" + checkInDate + ", bill=" + bill
				+ ", checkOutDate=" + checkOutDate + "]";
	}
	
}
