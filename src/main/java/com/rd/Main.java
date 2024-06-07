package com.rd;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Sena", "Sema", "Seda", "Enes", "Sene","Senet"};
        //repeatWords = "Words with at least 2 letters the same"
        //repeatLetters = "Repeating Letters in a Word"
        HashSet<String> repeatWords = new HashSet<>();
        HashSet<Character> repeatLetters = new HashSet<>();


        for (String word : words) {
            if (IsThereAnySameLetter(word)) {
                repeatWords.add(word);
                if (repeatWords.size() >= 2) {
                    break;
                }
            }
        }

        if (repeatWords.size() >= 2) {
            StringBuilder randomText = new StringBuilder();
            for (String word : repeatWords) {
                for (char letter : word.toLowerCase().toCharArray()) {
                    if (!repeatLetters.contains(letter)) {
                        randomText.append(letter);
                        repeatLetters.add(letter);

                    }
                }
            }
            System.out.println("List of 2 words containing repeating letters: " + repeatWords);
            System.out.println("Random text with or without meaning: " + randomText.toString());
        } else {
            System.out.println("No words containing repeating letters were found.");
        }
    }

    public static boolean IsThereAnySameLetter(String word) {
        Set<Character> letters = new HashSet<>();

        for (char letter : word.toLowerCase().toCharArray()) {
            if (letters.contains(letter)) {
                return true;
            }
            letters.add(letter);
        }

        return false;
    }
}

