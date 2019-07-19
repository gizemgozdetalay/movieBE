package com.gizemgozde.kafka.kafkastreamsorderproject.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author gizem
 */
@Getter
@Setter
public class OmdbMovieResult {

    private String totalResults;
    @JsonProperty(value = "Response")
    private String response;
    @JsonProperty(value = "Search")
    private List<Movie> movieList;
}
