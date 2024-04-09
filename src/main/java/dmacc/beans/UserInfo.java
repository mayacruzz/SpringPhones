package dmacc.beans;

import jakarta.persistence.Embeddable;

/**
 * Maya Cruz - Gcruz
 * CIS175 - Spring 2024
 * Apr 9, 2024
 */
@Embeddable
public class UserInfo {
	
	//instance variables
	private String userName;
	private String phoneNumber;
	private boolean esim;
	
	public UserInfo() {
		super();
	}

	public UserInfo(String userName, String phoneNumber, boolean esim) {
		super();
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.esim = esim;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isEsim() {
		return esim;
	}

	public void setEsim(boolean esim) {
		this.esim = esim;
	}

	@Override
	public String toString() {
		return "UserInfo [userName=" + userName + ", phoneNumber=" + phoneNumber + ", esim=" + esim + "]";
	}
	
	
}