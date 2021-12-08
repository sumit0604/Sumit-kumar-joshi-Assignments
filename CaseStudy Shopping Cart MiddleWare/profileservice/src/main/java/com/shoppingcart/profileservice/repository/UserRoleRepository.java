package com.shoppingcart.profileservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shoppingcart.profileservice.model.Role;

public interface UserRoleRepository extends MongoRepository<Role, String>{

}
