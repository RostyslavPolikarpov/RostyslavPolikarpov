package ua.polikarpov.hw3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secret = (int) (Math.random() * 200 + 1);
        int guess = 0;
        while (guess != secret) {
            System.out.println("Угадай число от 1 до 200: ");
            guess = scan.nextInt();
            if (guess < secret) {
                System.out.println(guess + " Мало");
            } else if (guess > secret) {
                System.out.println(guess + " Много");
            } else {
                System.out.println(guess + " Угадал");
            }
        }
        scan.close();

    }
}
