package ua.polikarpov.hw3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        palindromeOrNot();
    }

    public static String palindromeOrNot() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your phrase: ");
        String phrase;
        phrase = scan.nextLine();
        String phraseWithoutSpase = phrase.replaceAll("\\W", "");
        StringBuilder newPhrase = new StringBuilder(phraseWithoutSpase);
        newPhrase.reverse();
        String inversedPhrase = newPhrase.toString();
        if (phrase.equals(inversedPhrase)) {
            System.out.println("Given string is palindrome.");
        } else {
            System.out.println("Given string is not palindrome.");
        }
        return ("");
    }
}
