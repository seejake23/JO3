package J03.weekOne;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3 {

    public static void main (String[]args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int optionSelect;
        String letterToRemove;
        String userInput;
        
        while (flag) {

            System.out.println("Please enter which option from the list below you would like to access: \n1: Remove all instances of a given letter from a word. \n2: Remove a duplicate letter.\n3: Check a how many consonants and vowels there are.\n4: Reorder the letters, sending duplicates to the end of the word. \n5: To quit.");
            optionSelect = sc.nextInt();
            System.out.println("Enter the word you would like to use:");
            sc.nextLine();
            userInput = sc.nextLine();

            switch (optionSelect) {
                case 1: System.out.println("Enter the letter you want removed.   ");
                    letterToRemove = sc.nextLine();
                    removeGivenLetter(letterToRemove, userInput);
                    break;
                case 2: removeDuplicateLetters(userInput);
                    break;
                case 3: countConsonantsAndVowels(userInput);
                    break;
                case 4: addDupesToEnd(userInput);
                    break;
                case 5: flag = false;
                    break;
            }
        }

        //Tests prior to making the while loop and switch
        // removeGivenLetter("a", "AlabAma");
        // removeDuplicateLetters("mississippi");
        // countConsonantsAndVowels("Abra Kadabra");
        // addDupesToEnd("connecticut");

        sc.close();

    }

    public static void removeGivenLetter(String givenLetter, String word) {
        // removes all instances of any letter given, from a given word
        String newWord = "";
        char lowerGivenLetter = givenLetter.toLowerCase().charAt(0);
        char upperGivenLetter = givenLetter.toUpperCase().charAt(0);

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if(letter != lowerGivenLetter && letter != upperGivenLetter) {
            newWord = newWord + letter;
            }
        }
        System.out.println(newWord);
    }

    public static void removeDuplicateLetters (String originalWord) {
        //removes all duplicate letters from a word (the first instance remains)
        String wordNoDupes = "";
        for(int i = 0; i < originalWord.length(); i++) {
            char currentChar = originalWord.charAt(i);

            if (!wordNoDupes.contains("" + currentChar)) {
                wordNoDupes += currentChar;
            }
        }
        System.out.println(wordNoDupes);
    }


    public static void countConsonantsAndVowels (String word) {
        // counts how many consonants and vowels there are in a given word
        int vowels = 0;
        int consonants = 0; 
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowels += 1;
            } else {
                consonants += 1;
            }
        }
        System.out.println(word + " contains " + vowels + " vowels and " + consonants + " consonants.");
    }

    public static void addDupesToEnd(String originalWord) {
        //removes duplicate words, but adds them to the end of the remaining first instantances of letters
        String wordNoDupes = "";
        String dupesForEnd = "";
        for(int i = 0; i < originalWord.length(); i++) {
            char currentChar = originalWord.charAt(i);

            if (!wordNoDupes.contains("" + currentChar)) {
                wordNoDupes += currentChar;
            } else {
                dupesForEnd += currentChar;
            }
        }
        String finalword = wordNoDupes + dupesForEnd;
        System.out.println(wordNoDupes);
        System.out.println(dupesForEnd);
        System.out.println(finalword);

    }
}
