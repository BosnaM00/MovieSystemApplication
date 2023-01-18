package com.visionlibrary.resource;

import com.visionlibrary.model.Review;
import com.visionlibrary.model.enums.Category;
import com.visionlibrary.model.enums.Language;
import com.visionlibrary.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reviews")
@CrossOrigin(origins = "http://localhost:4200")
public class ReviewResource {
    @Autowired
    private final ReviewService reviewService;

    @Autowired
    public ReviewResource(ReviewService reviewService) {
        this.reviewService = reviewService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Review>> getAllReviews () {
        List<Review> reviews = reviewService.findAllReviews();
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }


    @GetMapping("/find/{id}")
    public ResponseEntity<Review> getReviewById (@PathVariable("id") Long id) {
        Review Review = reviewService.findReviewById(id);
        return new ResponseEntity<>(Review, HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<Review> addReview(@RequestBody Review Review) {
        Review newReview = reviewService.addReview(Review);
        return new ResponseEntity<>(newReview, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Review> updateReview(@RequestBody Review Review) {
        Review updateReview = reviewService.updateReview(Review);
        return new ResponseEntity<>(updateReview, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteReview(@PathVariable("id") Long id) {
        reviewService.deleteReview(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
