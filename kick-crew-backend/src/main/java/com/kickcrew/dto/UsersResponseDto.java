package com.kickcrew.dto;

import java.util.List;

import com.kickcrew.entity.User;

import lombok.Data;

@Data
public class UsersResponseDto extends CommonApiResponse {
	
	private List<User> users;
	
}
