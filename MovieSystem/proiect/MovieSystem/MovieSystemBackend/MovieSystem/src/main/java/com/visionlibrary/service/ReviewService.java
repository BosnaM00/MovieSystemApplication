package com.visionlibrary.service;

import com.visionlibrary.model.Review;
import com.visionlibrary.model.enums.Category;
import com.visionlibrary.model.enums.Language;
import com.visionlibrary.repository.ReviewRepository;
import com.visionlibrary.service.exceptions.ReviewNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class ReviewService {

    @Autowired
    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }


    public Review addReview(Review review){
        review.setReviewCode(UUID.randomUUID().toString());
        review.setReviewDescription(review.getDescription());
        return reviewRepository.save(review);
    }

    public List<Review> findAllReviews() {
        return reviewRepository.findAll();
    }

    public Review updateReview(Review review) {
        return reviewRepository.save(review);
    }

    public Review findReviewById(Long id) {
        return reviewRepository.findReviewById(id)
                .orElseThrow(() -> new ReviewNotFoundException("Review by id " + id + " was not found"));
    }

    public void deleteReview(Long id){
        reviewRepository.deleteReviewById(id);
    }


}
