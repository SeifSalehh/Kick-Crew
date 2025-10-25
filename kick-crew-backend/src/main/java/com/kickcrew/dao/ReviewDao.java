package com.kickcrew.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kickcrew.entity.Review;

@Repository
public interface ReviewDao extends JpaRepository<Review, Integer> {

	List<Review> findByGroundId(int groundId);
	
}
