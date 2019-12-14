package com.springframework.joke.config;

import com.springframework.joke.controllers.Jokes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileNotFoundException;

@Configuration
public class JokeConfiguration {

    @Bean
    public Jokes jokes() throws FileNotFoundException {
        return new Jokes();
    }
}
