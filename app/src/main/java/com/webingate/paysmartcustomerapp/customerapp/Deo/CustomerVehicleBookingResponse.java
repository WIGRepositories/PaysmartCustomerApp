package com.webingate.paysmartcustomerapp.customerapp.Deo;

import com.google.gson.annotations.SerializedName;

public class CustomerVehicleBookingResponse{

	@SerializedName("bookingNumber")
	private String bookingNumber;

	public void setBookingNumber(String bookingNumber){
		this.bookingNumber = bookingNumber;
	}

	public String getBookingNumber(){
		return bookingNumber;
	}

	@Override
 	public String toString(){
		return 
			"CustomerVehicleBookingResponse{" + 
			"bookingNumber = '" + bookingNumber + '\'' + 
			"}";
		}
}