/*
 *  Just a sample of how to use the Scanner.
 */

package br.com.dio.basics;
import java.util.Locale;

public class Scanner {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        java.util.Scanner scanner = new java.util.Scanner(System.in).useLocale(Locale.US);

        System.out.println("Enter your name: ");
        String name = scanner.next();

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Enter your height: ");
        double height = scanner.nextDouble();

        System.out.println("Your data:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
    }
}