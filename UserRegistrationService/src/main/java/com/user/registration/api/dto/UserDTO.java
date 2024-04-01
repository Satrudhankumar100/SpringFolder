package com.user.registration.api.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
	@NotNull(message="first name must be not empty")
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	
	

}
