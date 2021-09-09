package ua.polikarpov.hw3;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        countOfWords();
    }

    public static String countOfWords() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your statement: ");
        String statement = scan.nextLine();
        int numberOfWords = 0;

        if (statement.length() != 0) {
            numberOfWords++;

            for (int i = 0; i < statement.length(); i++) {

                if (statement.charAt(i) == ' ') {
                    numberOfWords++;
                }
            }
        }
        System.out.println("Total words in the statement: " + numberOfWords);
        return ("");
    }

}
