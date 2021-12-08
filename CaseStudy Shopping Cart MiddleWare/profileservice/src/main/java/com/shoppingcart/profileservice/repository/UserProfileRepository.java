package com.shoppingcart.profileservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shoppingcart.profileservice.model.UserProfile;

public interface UserProfileRepository extends MongoRepository<UserProfile, Integer>{


	Optional<UserProfile> findUserByUserName(String userName);
	
	Optional<UserProfile> findUserProfileByProfileId(int profileId);
	
	List<UserProfile> findUserProfileByFullName(String fullName);

}
