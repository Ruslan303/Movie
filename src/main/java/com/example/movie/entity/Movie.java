package com.example.movie.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="movie")
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    Long id;
    String title;
    String genre;
    int releaseYear;
    double imdbRating;
    String director;

}
