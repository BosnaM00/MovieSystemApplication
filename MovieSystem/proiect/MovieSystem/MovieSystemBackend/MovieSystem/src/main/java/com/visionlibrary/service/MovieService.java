package com.visionlibrary.service;

import com.visionlibrary.model.Movie;
import com.visionlibrary.model.enums.Category;
import com.visionlibrary.model.enums.Language;
import com.visionlibrary.repository.MovieRepository;
import com.visionlibrary.service.exceptions.MovieNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class MovieService {

    private final MovieRepository MovieRepository;

    @PersistenceContext
    private EntityManager entityManager;


    public Movie addMovie(Movie Movie){
        Movie.setMovieCode(UUID.randomUUID().toString());
        return MovieRepository.save(Movie);
    }

    public Page<Movie> findAllMovies(Pageable pageable) {
        Page<Movie> result = MovieRepository.findAll(pageable);
        return result;
    }

    public Movie updateMovie(Movie Movie) {
        return MovieRepository.save(Movie);
    }

    public Movie findMovieById(Long id) {
        return MovieRepository.findMovieById(id)
                .orElseThrow(() -> new MovieNotFoundException("Movie by id " + id + " was not found"));
    }

    public void deleteMovie(Long id){
        MovieRepository.deleteMovieById(id);
    }

    public Page<Movie> findAvailableMovies(Pageable pageable) {
        Page<Movie> result = MovieRepository.findAll(pageable);
        List<Movie> Movies = new ArrayList<Movie>();
        for (Movie Movie : result) {
            if(Movie.isAvailable() == true){
                Movies.add(Movie);
            }
        }
        Page<Movie> availableMovies = new PageImpl(Movies);
        return availableMovies;
    }


    public List<Movie> findByAuthor(String author) {
        return MovieRepository.findMovieByAuthor(author);
    }

    public List<Movie> findByTitle(String title) {
        return MovieRepository.findMovieByTitle(title);
    }

    public List<Movie> findByPublishingHouse(String publishingHouse) {
        return MovieRepository.findMovieByPublishingHouse(publishingHouse);
    }



    public List<Movie> findByCollection(String collection) {
        return MovieRepository.findMovieByCollection(collection);
    }

    public List<Movie> findByYearOfLaunch(int yearOfLaunch) {
        return MovieRepository.findMovieByYearOfLaunch(yearOfLaunch);
    }

    public Page<Movie> findByLanguage(Pageable pageable, Language language) {
        Page<Movie> result = MovieRepository.findMovieByLanguage(language,pageable);
        return result;
    }

    public Page<Movie> findByCategory(Pageable pageable, Category category) {
        Page<Movie> result = MovieRepository.findMovieByCategory(category, pageable);
        return result;
    }

    public Page<Movie> findByOrderByAuthorAsc(Pageable pageable) {
        /*Query query =  entityManager.createQuery("SELECT p FROM Movie p ORDER BY p.author",Movie.class);
        query.setFirstResult(pageable.getPageNumber());
        query.setMaxResults(query.getS());
        Page<Movie> page = new PageImpl<>(result);*/
        Page<Movie> result = MovieRepository.findAll(pageable);
        return result;
        /*List<Movie> result =  entityManager.createQuery("SELECT p FROM Movie p ORDER BY p.author",
                Movie.class).getResultList();
        Page<Movie> page = new PageImpl<>(result);*/
        //return page;
//        return entityManager.createQuery("SELECT p FROM Movie p ORDER BY p.author",
//                Movie.class).getResultList();
    }

    public Page<Movie> findByOrderByAuthorDesc(Pageable pageable) {
        Page<Movie> result = MovieRepository.findAll(pageable);
        return result;
    }


    public Page<Movie> findByOrderByTitleAsc(Pageable pageable) {
        Page<Movie> result = MovieRepository.findAll(pageable);
        return result;
    }

    public Page<Movie> findByOrderByTitleDesc(Pageable pageable) {
        Page<Movie> result = MovieRepository.findAll(pageable);
        return result;
    }

    public Page<Movie> findByOrderByPublishingHouseAsc(Pageable pageable) {
        Page<Movie> result = MovieRepository.findAll(pageable);
        return result;
    }

    public Page<Movie> findByOrderByPublishingHouseDesc(Pageable pageable) {
        Page<Movie> result = MovieRepository.findAll(pageable);
        return result;
    }

    public Page<Movie> findByOrderByCollectionAsc(Pageable pageable) {
        Page<Movie> result = MovieRepository.findAll(pageable);
        return result;
    }

    public Page<Movie> findByOrderByCollectionDesc(Pageable pageable) {
        Page<Movie> result = MovieRepository.findAll(pageable);
        return result;
    }

    public Page<Movie> findByOrderByNumberOfPagesAsc(Pageable pageable) {
        Page<Movie> result = MovieRepository.findAll(pageable);
        return result;
    }

    public Page<Movie> findByOrderByNumberOfPagesDesc(Pageable pageable) {
        Page<Movie> result = MovieRepository.findAll(pageable);
        return result;
    }

    public Page<Movie> findByOrderByYearOfLaunchAsc(Pageable pageable) {
        Page<Movie> result = MovieRepository.findAll(pageable);
        return result;
    }


    public Page<Movie> findByOrderByYearOfLaunchDesc(Pageable pageable) {
        Page<Movie> result = MovieRepository.findAll(pageable);
        return result;
    }


    public List<Movie> findByMovieCode(String MovieCode) {
        return MovieRepository.findMovieByMovieCode(MovieCode);
    }

    public Page<Movie> findUnvailableMovies(Pageable pageable) {
        Page<Movie> resultList = MovieRepository.findAll(pageable);
        List<Movie> Movies = new ArrayList<Movie>();
        for (Movie Movie : resultList) {
            if(Movie.isAvailable() == false){
                Movies.add(Movie);
            }
        }
        Page<Movie> availableMovies = new PageImpl(Movies);
        return availableMovies;
    }

}
