package com.hh.app.ws.utils;

import com.hh.app.ws.shared.dto.UserDTO;

public class UserProfileUtils {
	public void validateRequiredFields(UserDTO  userDto ) throws MissingRequiredFieldException
	{
		if(userDto.getFirstName() == null ||
				userDto.getFirstName().isEmpty() ||
				userDto.getLastName() == null ||
				userDto.getEmail() == null ||
				userDto.getEmail().isEmpty() ||
				userDto.getPassword() == null ||
				userDto.getPassword().isEmpty()) {
			throw new MissingRequiredFieldException(
				ErrorMessages.MISSING_REQUIRED_FIELD.getErrorMessage());
			}
			
		}
	}
}
