package com.shoppingcart.profileservice.model;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserProfile {
	@Id
	private int profileId;
	private String fullName;
	private String image;
	private String emailId;
	private Long mobileNumber;
	private String about;
	private String dateOfBirth;
	private String gender;
	private Set<Role> role;
	private String userName;
	private String password;
	private UserProfileAddress address;
	
	
	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserProfile(int profileId, String fullName, String image, String emailId, Long mobileNumber, String about,
			String dateOfBirth, String gender, Set<Role> role, String userName, String password,
			UserProfileAddress address) {
		super();
		this.profileId = profileId;
		this.fullName = fullName;
		this.image = image;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.about = about;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.role = role;
		this.userName = userName;
		this.password = password;
		this.address = address;
	}

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserProfileAddress getAddress() {
		return address;
	}

	public void setAddress(UserProfileAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserProfile [profileId=" + profileId + ", fullName=" + fullName + ", image=" + image + ", emailId="
				+ emailId + ", mobileNumber=" + mobileNumber + ", about=" + about + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", role=" + role + ", userName=" + userName + ", password=" + password
				+ ", address=" + address + "]";
	}
	
	
	
	

	
	
}
