package com.shoppingcart.profileservice.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.shoppingcart.profileservice.model.Role;
import com.shoppingcart.profileservice.model.UserProfile;
import com.shoppingcart.profileservice.repository.UserRoleRepository;
import com.shoppingcart.profileservice.exceptions.UserNotFoundException;
import com.shoppingcart.profileservice.repository.UserProfileRepository;

@Service
public class UserProfileServiceImpl implements UserProfileService{
	@Autowired
	private UserRoleRepository roleRepository;
	
	@Autowired
	private UserProfileRepository userRepository;
	
	@Autowired
    private PasswordEncoder passwordEncoder;

	//Creating a new Role
	@Override
	public Role createNewRole(Role role) {
		return roleRepository.save(role);
	}

	//registration of new User
	@Override
	public UserProfile registerNewUser(UserProfile user) {
		 Role role = roleRepository.findById("user").get();
	        Set<Role> userRoles = new HashSet<>();
	        userRoles.add(role);
	        user.setRole(userRoles);
	        user.setPassword(getEncodedPassword(user.getPassword()));
		return userRepository.save(user);
	}

	//getting encoder method to encode coming password......
	public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }

	//Getting all profiles
	@Override
	public List<UserProfile> getAllProfiles(){
		return userRepository.findAll();
	}

	//getting profile By id
	@Override
	public UserProfile getByProfileId(int profileId) {
		return userRepository.findUserProfileByProfileId(profileId).orElseThrow(()-> new UserNotFoundException("user by id " + profileId + " was not found"));
	}
	// update profile
	@Override
	public void updateProfile(UserProfile userProfile) {
		 Role role = roleRepository.findById("user").get();
	        Set<Role> userRoles = new HashSet<>();
	        userRoles.add(role);
	        userProfile.setRole(userRoles);
	        userRepository.save(userProfile);
		
	}

	//delete profile by ID
	@Override
	public void deleteProfile(int profileId) {
		userRepository.deleteById(profileId);
		
	}

	//get user name mwehod
	@Override
	public List<UserProfile> getByUserName(String fullName) {
		return userRepository.findUserProfileByFullName(fullName);
	}
}
