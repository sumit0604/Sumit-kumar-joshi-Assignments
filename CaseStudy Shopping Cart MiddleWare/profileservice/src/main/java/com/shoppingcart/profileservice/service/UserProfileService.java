package com.shoppingcart.profileservice.service;

import java.util.List;

import com.shoppingcart.profileservice.model.Role;
import com.shoppingcart.profileservice.model.UserProfile;

public interface UserProfileService {
	
	public Role createNewRole(Role role);
	
	public UserProfile registerNewUser(UserProfile user);

	public List<UserProfile> getAllProfiles();
	
	public UserProfile getByProfileId(int profileId);
	
	public void updateProfile(UserProfile userProfile);
	
	public void deleteProfile(int profileId);
	
	public List<UserProfile> getByUserName(String fullName);
}
