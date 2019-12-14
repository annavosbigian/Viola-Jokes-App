package com.springframework.joke.controllers;


import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Jokes {
    private ArrayList<String> quotes = new ArrayList<>();

    public Jokes() {
        this.quotes.add("How is lightning like a violist's fingers?\n" +
                "Neither one strikes in the same place twice.");
        this.quotes.add("How do you keep your violin from getting stolen?\n" + "Put it in a viola case.");

        this.quotes.add("How do you get a violin to sound like a viola? Sit in the back and don't play.");
        this.quotes.add("If you throw a violist and a soprano off a cliff, which one would hit the ground first? The violist. The soprano would have to stop halfway down to ask directions.");
        this.quotes.add("A conductor and a violist are standing in the middle of the road. which one do you run over first, and why? The conductor. Business before pleasure.");
        this.quotes.add("What's the most popular recording of the William Walton viola concerto? Music Minus One");
        this.quotes.add("What do a viola and a lawsuit have in common? Everyone is happy when the case is closed.");
        this.quotes.add("What's another name for viola auditions? Scratch lottery.");
        this.quotes.add("What do a SCUD missile and a viola player have in common? They're both offensive and inaccurate.");
    }

    public String getRandomQuote() {
        return (String)this.quotes.get(ThreadLocalRandom.current().nextInt(1, this.quotes.size()));
    }

}


