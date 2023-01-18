package com.visionlibrary.repository;

import com.visionlibrary.model.Movie;

import com.visionlibrary.model.Movie;
import com.visionlibrary.model.enums.Category;
import com.visionlibrary.model.enums.Language;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>, PagingAndSortingRepository<Movie,Long>{

    Optional<Movie> findMovieById(Long id);
    void deleteMovieById(Long id);
    List<Movie> findMovieByTitle(String title);
    List<Movie> findMovieByPublishingHouse(String publishingHouse);
    Page<Movie> findMovieByCategory(Category category, Pageable pageable);
    List<Movie> findMovieByAuthor(String name);
    List<Movie> findMovieByCollection(String collection);
    List<Movie> findMovieByYearOfLaunch(int yearOfLaunch);
    Page<Movie> findMovieByLanguage(Language language, Pageable pageable);
    List<Movie> findMovieByMovieCode(String MovieCode);


}
