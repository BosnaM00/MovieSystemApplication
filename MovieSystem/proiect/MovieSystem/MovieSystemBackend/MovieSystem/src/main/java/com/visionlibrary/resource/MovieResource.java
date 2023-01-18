package com.visionlibrary.resource;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.visionlibrary.model.Movie;
import com.visionlibrary.model.enums.Category;
import com.visionlibrary.model.enums.Language;
import com.visionlibrary.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Column;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("Movies")
@CrossOrigin(origins = "http://localhost:4200")
public class MovieResource {
    private final MovieService MovieService;
    private final FileStorage fileStorage;

//    @Autowired
//    public MovieResource(MovieService MovieService) {
//        this.MovieService = MovieService;
//    }


//    @GetMapping("/all")
//    @CrossOrigin(origins = "http://localhost:4200")
//    public List<Movie> getAllMovies () {
//        List<Movie> Movies = MovieService.findAllMovies();
//        return Movies;
//    }

    @GetMapping("/all")
    @CrossOrigin(origins = "http://localhost:4200")
    public Page<Movie> getAllMovies(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "1") int size) {
        Pageable paging = PageRequest.of(page, size);
        Page<Movie> result = MovieService.findAllMovies(paging);
        return result;
    }


    @GetMapping("/find/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Movie> getMovieById (@PathVariable("id") Long id) {
        Movie Movie = MovieService.findMovieById(id);
        return new ResponseEntity<>(Movie, HttpStatus.OK);
    }

    @PostMapping("/add")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity addMovie(@RequestParam MultipartFile file,@RequestParam Map<String,Object> Movie) {
        try {
            Gson gson = new Gson();
            Movie objMovie = (Movie)gson.fromJson(Movie.get("Movie").toString(),Movie.class);
            if (file != null) {
                String fileName = fileStorage.saveFile(file);
                objMovie.setUploadedFileName(fileName);
            }
            Movie newMovie = MovieService.addMovie(objMovie);
            return new ResponseEntity<>(newMovie, HttpStatus.CREATED);
        }
        catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie Movie) {
        Movie updateMovie = MovieService.updateMovie(Movie);
        return new ResponseEntity<>(updateMovie, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<?> deleteMovie(@PathVariable("id") Long id) {
        MovieService.deleteMovie(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findByAuthors")
    public ResponseEntity<List<Movie>> getMoviesByAuthors(@RequestParam String author){
        return new ResponseEntity<>(MovieService.findByAuthor(author), HttpStatus.OK);
    }

    @GetMapping("/findByTitles")
    public ResponseEntity<List<Movie>> getMoviesByTitles(@RequestParam String title){
        return new ResponseEntity<>(MovieService.findByTitle(title), HttpStatus.OK);
    }

    @GetMapping("/findByPublishingHouses")
    public ResponseEntity<List<Movie>> getMoviesByPublishingHouses(@RequestParam String publishingHouse){
        return new ResponseEntity<>(MovieService.findByPublishingHouse(publishingHouse), HttpStatus.OK);
    }

    @GetMapping("/findByCollections")
    public ResponseEntity<List<Movie>> getMoviesByCollections(@RequestParam String collection){
        return new ResponseEntity<>(MovieService.findByCollection(collection), HttpStatus.OK);
    }

    @GetMapping("/findByYearOfLaunch")
    public ResponseEntity<List<Movie>> getMoviesByYearOfLaunch(@RequestParam int yearOfLaunch){
        return new ResponseEntity<>(MovieService.findByYearOfLaunch(yearOfLaunch), HttpStatus.OK);
    }

    @GetMapping("/findByLanguages")
    public Page<Movie> getMoviesByLanguages(@RequestParam int page, @RequestParam int size, @RequestParam Language language) {
        Pageable paging = PageRequest.of(page, size);
        Page<Movie> result = MovieService.findByLanguage(paging,language);
        return result;
    }

    @GetMapping("/findByCategories")
    public Page<Movie> getMoviesByCategories(@RequestParam int page, @RequestParam int size,@RequestParam Category category){
        Pageable paging = PageRequest.of(page, size);
        Page<Movie> result = MovieService.findByCategory(paging, category);
        return result;
    }

    @GetMapping("/sortAuthorAsc")
    public Page<Movie> getAuthorMoviesAsc(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size, Sort.by("author"));
        Page<Movie> Movies = MovieService.findByOrderByAuthorAsc(paging);
        return Movies;
    }

    @GetMapping("/sortAuthorDesc")
    public Page<Movie> getAuthorMoviesDesc(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "author"));
        Page<Movie> Movies = MovieService.findByOrderByAuthorDesc(paging);
        return Movies;
    }

    @GetMapping("/sortTitleAsc")
    public Page<Movie> getTitleMoviesAsc(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size, Sort.by("title"));
        Page<Movie> Movies = MovieService.findByOrderByTitleAsc(paging);
        return Movies;
    }
    @GetMapping("/sortPublishingHouseAsc")
    public Page<Movie> getPublishingHouseAsc(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size, Sort.by("publishingHouse"));
        Page<Movie> Movies = MovieService.findByOrderByPublishingHouseAsc(paging);
        return Movies;
    }


    @GetMapping("/sortPublishingHouseDesc")
    public Page<Movie> findByOrderByPublishingHouseDesc(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "publishingHouse"));
        Page<Movie> Movies = MovieService.findByOrderByPublishingHouseDesc(paging);
        return Movies;
    }

    @GetMapping("/sortCollectionAsc")
    public Page<Movie> getAuthorByCollectionAsc(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size, Sort.by("collection"));
        Page<Movie> Movies = MovieService.findByOrderByCollectionAsc(paging);
        return Movies;
    }

    @GetMapping("/sortCollectionDesc")
    public Page<Movie> findByOrderByCollectionDesc(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC,"collection"));
        Page<Movie> Movies = MovieService.findByOrderByCollectionDesc(paging);
        return Movies;
    }


    @GetMapping("/sortNumberOfPagesAsc")
    public Page<Movie> getNumberOfPagesMoviesAsc(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size, Sort.by("numberOfPages"));
        Page<Movie> Movies = MovieService.findByOrderByNumberOfPagesAsc(paging);
        return Movies;
    }


    @GetMapping("/sortNumberOfPagesDesc")
    public Page<Movie> getNumberOfPagesMoviesDesc(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC,"numberOfPages"));
        Page<Movie> Movies = MovieService.findByOrderByNumberOfPagesDesc(paging);
        return Movies;
    }

    @GetMapping("/sortYearOfLaunchAsc")
    public Page<Movie> getMoviesByYearOfLaunchAsc(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size, Sort.by("yearOfLaunch"));
        Page<Movie> Movies = MovieService.findByOrderByYearOfLaunchAsc(paging);
        return Movies;
    }


    @GetMapping("/sortYearOfLaunchDesc")
    public Page<Movie> getMoviesByYearOfLaunchDesc(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC,"yearOfLaunch"));
        Page<Movie> Movies = MovieService.findByOrderByYearOfLaunchDesc(paging);
        return Movies;
    }

    @GetMapping("/sortTitleDesc")
    public Page<Movie> getTitleMoviesDesc(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "title"));
        Page<Movie> Movies = MovieService.findByOrderByTitleDesc(paging);
        return Movies;
    }

    @GetMapping("/findAvailableMovies")
    public Page<Movie> getAvailableMovies(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size);
        Page<Movie> Movies = MovieService.findAvailableMovies(paging);
        return Movies;
    }

    @GetMapping("/findUnavailableMovies")
    public Page<Movie> getUnavailableMovies(@RequestParam int page, @RequestParam int size){
        Pageable paging = PageRequest.of(page, size);
        Page<Movie> Movies = MovieService.findUnvailableMovies(paging);
        return Movies;
    }


    @GetMapping("/findByMovieCode")
    public ResponseEntity<List<Movie>> getMoviesByMovieCode(@RequestParam String MovieCode){
        return new ResponseEntity<>(MovieService.findByMovieCode(MovieCode), HttpStatus.OK);
    }


//    @GetMapping("/all")
//    @CrossOrigin(origins = "http://localhost:4200")
//    public Page<Movie> getAllMovies(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "1") int size) {
//        Pageable paging = PageRequest.of(page, size);
//        Page<Movie> result = MovieService.findAllMovies(paging);
//        return result;
//    }

    /*@GetMapping("/getFile/{fileName}")
    public ResponseEntity<Resource> getFile(@PathVariable("fileName") String fileName ){
        try {
            Resource res = fileStorage.getFile(fileName);
            return new ResponseEntity<>(res, HttpStatus.OK);
        }
        catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }*/

    @GetMapping("/getFile/{fileName}")
    public void getFile(@PathVariable("fileName") String fileName, HttpServletRequest request, HttpServletResponse response){
        try {
            String path  = "files/" + fileName;
            File file = new File(path);
            if(file.exists()) {
                String mimeType = URLConnection.guessContentTypeFromName(file.getName());
                if(mimeType == null) {
                    mimeType = "application/octet-stream";
                }
                response.setContentType(mimeType);
                response.setHeader("Content-Disposition",String.format("inline; filename=\"" + file.getName() + "\""));
                response.setContentLength((int)file.length());
                InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
                FileCopyUtils.copy(inputStream,response.getOutputStream());
            }
        }
        catch (Exception e) {
            e.printStackTrace();

        }

    }


}
