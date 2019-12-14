package com.springframework.joke.services;

import com.springframework.joke.controllers.Jokes;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;

@Service
public class JokeServiceImpl implements JokeService {

    public final Jokes jokes;

    public JokeServiceImpl(Jokes jokes) throws FileNotFoundException {
        this.jokes = jokes;
    }

    @Override
    public String getJoke() {
        return jokes.getRandomQuote();
    }
}
