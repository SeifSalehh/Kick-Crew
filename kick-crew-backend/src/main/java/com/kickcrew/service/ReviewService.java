package com.kickcrew.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kickcrew.dao.ReviewDao;
import com.kickcrew.entity.Review;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewDao reviewDao;
	
	public Review addHotelReview(Review review) {
		return reviewDao.save(review);
	}
	
	public List<Review> fetchReviews(int groundId) {
		return reviewDao.findByGroundId(groundId);
	}

}
