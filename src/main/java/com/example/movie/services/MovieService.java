package com.example.movie.services;

import com.example.movie.entity.Movie;
import com.example.movie.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieRepository movieRepository;
    private final ModelMapper modelMapper;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> getMovie (long id){
        return movieRepository.findById(id);
    }
    public Movie createMovie(Movie movie){
        return movieRepository.save(movie);
    }
    public void deleteMovie(Long id){
        movieRepository.deleteById(id);
    }
    public Movie updateMovie(Long id,Movie movieDetails){
      Movie movie = movieRepository.findById(id).orElseThrow(()-> new RuntimeException("Movie not found"));
      modelMapper.map(movieDetails, movie);
      return movieRepository.save(movie);

    }

}
