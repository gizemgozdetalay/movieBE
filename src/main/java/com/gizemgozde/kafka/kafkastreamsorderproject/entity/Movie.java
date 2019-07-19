package com.gizemgozde.kafka.kafkastreamsorderproject.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author gizem
 */
@Getter
@Setter
public class Movie {

    @JsonProperty(value = "Title")
    private String title;

    @JsonProperty(value = "Year")
    private String year;

    private String rated;

    private String released;

    private String runtime;

    private String genre;

    private String director;

    private String writer;

    private String actors;

    private String plot;

    private String language;

    private String country;

    private String awards;

    @JsonProperty(value = "Poster")
    private String poster;

    private Map<String,String> ratings;

    private String metascore;

    private String imdbRating;

    private String imdbVotes;

    @JsonProperty(value = "imdbID")
    private String imdbId;

    @JsonProperty(value = "Type")
    private String type;

    private String dvd;

    private String boxOffice;

    private String production;

    private String website;

}
