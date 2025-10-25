package com.kickcrew.dto;

import java.util.List;

import com.kickcrew.entity.Ground;

import lombok.Data;

@Data
public class GroundResponseDto extends CommonApiResponse {
	
	private List<Ground> grounds;

}
