package com.First;

import java.util.Random;

public class Funny {


    public static void main(String[] args) {
        String[] jokes = {
                "Why don't scientists trust atoms? Because they make up everything!",
                "Why did the computer go to the doctor? Because it had a virus!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "Why couldn't the bicycle find its way home? It lost its bearings!",
                "Why did the scarecrow win an award? Because he was outstanding in his field!",
                "Devansh is a good guy"
        };

        Random random = new Random();
        int randomIndex = random.nextInt(jokes.length);
        String randomJoke = jokes[randomIndex];

        System.out.println("Random Joke: " + randomJoke);
    }
}
