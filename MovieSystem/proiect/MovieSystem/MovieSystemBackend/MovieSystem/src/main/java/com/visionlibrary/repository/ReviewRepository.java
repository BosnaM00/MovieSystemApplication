package com.visionlibrary.repository;

import com.visionlibrary.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    Optional<Review> findReviewById(Long id);
    void deleteReviewById(Long id);
}
