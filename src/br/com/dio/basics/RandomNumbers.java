/*
 * This program fills an int[20] array with random numbers, then prints the numbers
 * and their successors.
 */

package br.com.dio.basics;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();
        int[] randomNumbers = new int[20];
        for (int i = 0; i < randomNumbers.length; i++) {
            int number = random.nextInt(100);
            randomNumbers[i] = number;
        }

        System.out.print("Random Numbers: ");
        for (int number: randomNumbers ) {
            System.out.print(number + " ");
        }

        // Example of foreach.
        System.out.print("\nSuccessors: ");
        for (int number: randomNumbers ) {
            System.out.print(number + 1 + " ");
        }
    }
}