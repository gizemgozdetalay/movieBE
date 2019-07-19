package com.gizemgozde.kafka.kafkastreamsorderproject.controller;

import com.gizemgozde.kafka.kafkastreamsorderproject.entity.Movie;
import com.gizemgozde.kafka.kafkastreamsorderproject.entity.OmdbMovieResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author gizem
 */
@RestController
@RequestMapping(value = "/movie")
@Slf4j
public class MovieController {

    public static final String URL = "http://www.omdbapi.com/";
    public static final String API_KEY = "5491a007";

    @GetMapping("/search")
    public List<Movie> searchFilms(String searchTerm) {

        RestTemplate restTemplate = new RestTemplate();

        StringBuffer buffer = new StringBuffer(URL).append("?apikey=").append(API_KEY).append("&s=").append(searchTerm).append("&type=movie");

        ResponseEntity<OmdbMovieResult> result = restTemplate.getForEntity(buffer.toString(), OmdbMovieResult.class);
        OmdbMovieResult body = result.getBody();
        System.out.println("size : " + body.getMovieList().size());
        return body.getMovieList();
    }

}
