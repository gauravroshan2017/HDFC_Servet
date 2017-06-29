package com.gaurav.bean;

public class RegisterUser {
	private String fname;
	private String password;
	private String address;
	private int pin;
	
	public RegisterUser(String fname, String password, String address, int pin) {
		this.fname = fname;
		this.password = password;
		this.address = address;
		this.pin = pin;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}
