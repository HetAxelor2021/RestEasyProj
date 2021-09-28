package com.hh.app.ws.service.impl;

import com.hh.app.ws.service.UserService;
import com.hh.app.ws.shared.dto.UserDTO;
import com.hh.app.ws.utils.UserProfileUtils;

public class UserServiceImpl implements UserService {
	
	UserProfileUtils userProfileUtils = new UserProfileUtils();
	
	public UserDTO createUser(UserDTO user) {
		UserDTO returnValue = new UserDTO();
		
		//validate the required fields
		userProfileUtils.validateRequiredFields(user);
		
		//check if user already exists
		
		//create an Entity object
		
		//generate secure public user id
		
		//generate salt
		
		//generate secure password
		
		//record data into a database
		
		//return back the user profile
		
		
		
		
		
		return returnValue;
	}
}
