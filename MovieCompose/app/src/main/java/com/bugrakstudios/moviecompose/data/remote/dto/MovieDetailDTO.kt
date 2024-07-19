package com.bugrakstudios.moviecompose.data.remote.dto

import com.bugrakstudios.moviecompose.domain.model.MovieDetail

data class MovieDetailDTO(
    val Actors: String,
    val Awards: String,
    val BoxOffice: String,
    val Country: String,
    val DVD: String,
    val Director: String,
    val Genre: String,
    val Language: String,
    val Metascore: String,
    val Plot: String,
    val Poster: String,
    val Production: String,
    val Rated: String,
    val Ratings: List<Rating>,
    val Released: String,
    val Response: String,
    val Runtime: String,
    val Title: String,
    val Type: String,
    val Website: String,
    val Writer: String,
    val Year: String,
    val imdbID: String,
    val imdbRating: String,
    val imdbVotes: String
)

fun MovieDetailDTO.toMovieDetail() : MovieDetail{
    return MovieDetail(
        Actors,
        Awards,
        Country,
        Director,
        Genre,
        Language,
        Poster,
        Rated,
        Released,
        Title,
        Type,
        Year,
        imdbRating
    )
}