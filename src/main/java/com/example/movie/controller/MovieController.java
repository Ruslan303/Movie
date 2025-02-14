package com.example.movie.controller;

import com.example.movie.entity.Movie;
import com.example.movie.services.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/movies")
public class MovieController {

   private final MovieService movieService;

    @PostMapping("/create")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.createMovie(movie);
    }
    @GetMapping("/getAll")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }
    @GetMapping("/{id}")
    public Optional<Movie> getMovieById(@PathVariable Long id) {
        return movieService.getMovie(id);
    }
    @PutMapping("/{id}")
    public Movie updateMovie (@PathVariable Long id,@RequestBody Movie movie) {
        return movieService.updateMovie(id,movie);
    }
    @DeleteMapping("{id}")
    public void deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
    }



}
