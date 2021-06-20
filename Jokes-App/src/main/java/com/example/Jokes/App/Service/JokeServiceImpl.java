package com.example.Jokes.App.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokesService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    JokeServiceImpl(){
        this.chuckNorrisQuotes= new ChuckNorrisQuotes();
    }
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
