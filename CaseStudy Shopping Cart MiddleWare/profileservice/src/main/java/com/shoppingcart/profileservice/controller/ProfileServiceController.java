package com.shoppingcart.profileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.profileservice.model.Role;
import com.shoppingcart.profileservice.model.UserProfile;
import com.shoppingcart.profileservice.service.UserProfileServiceImpl;

@RestController
public class ProfileServiceController {
	@Autowired
	private UserProfileServiceImpl userProfileServiceImpl;
	
	@PostMapping({"/createNewRole"})
    public Role createNewRole(@RequestBody Role role) {
        return userProfileServiceImpl.createNewRole(role);
    }
	
	@PostMapping({"/registerNewUser"})
    public ResponseEntity<UserProfile> registerNewUser(@RequestBody UserProfile user) {
        UserProfile users =  this.userProfileServiceImpl.registerNewUser(user);
        return new ResponseEntity<UserProfile>(users, HttpStatus.OK);
    }
	
	@GetMapping("/allprofiles")
	public ResponseEntity<List<UserProfile>> getAllProfile(){
		List<UserProfile> users = this.userProfileServiceImpl.getAllProfiles();
		return new ResponseEntity<List<UserProfile>>(users, HttpStatus.OK);
	}
	
	@GetMapping("/{profileId}")
	public ResponseEntity<UserProfile> getByProfileId(@PathVariable("profileId") int profileId){
		UserProfile users = this.userProfileServiceImpl.getByProfileId(profileId);
		return new ResponseEntity<UserProfile>(users, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateProfile(@RequestBody UserProfile userProfile){
		this.userProfileServiceImpl.updateProfile(userProfile);
		return new ResponseEntity<UserProfile>(HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{profileId}")
	public ResponseEntity<?> deleteProfile(@PathVariable("profileId") int profileId){
		this.userProfileServiceImpl.deleteProfile(profileId);
		return new ResponseEntity<UserProfile>(HttpStatus.OK);
	}
	
	@GetMapping("/name/{fullName}")
	public ResponseEntity<List<UserProfile>> getByUserName(@PathVariable("fullName") String fullName){
		List<UserProfile> users = this.userProfileServiceImpl.getByUserName(fullName);
		return new ResponseEntity<List<UserProfile>>(users, HttpStatus.OK);
	}
	
	@GetMapping({"/forAdmin"})
	@PreAuthorize("hasRole('admin')")
    public String forAdmin(){
        return "This URL is only accessible to the admin";
    }

    @GetMapping({"/forUser"})
    @PreAuthorize("hasRole('user')")
    public String forUser(){
        return "This URL is only accessible to the user";
    }
}
