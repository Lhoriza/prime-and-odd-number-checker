package com.lhoriza;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Prime Number
        int prime;
        Prime primeNumber = new Prime();
        Scanner appScanner = new Scanner(System.in);
        System.out.println("Prime Number Checker");
        System.out.println("Enter number: ");
        prime = appScanner.nextInt();
        System.out.println("The given number " + prime + " a prime number? " + primeNumber.isPrime(prime));

        ArrayList<Integer> primeArr = new ArrayList<>();
        System.out.println("Prime Numbers Checker (input 5 numbers)");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number: ");
            primeArr.add(appScanner.nextInt());
        }
        System.out.println("Given numbers: " + primeArr + " the prime number/s is/are: " + primeNumber.onlyPrimes(primeArr) + " only.");

        // Odd Number
        Odd oddNumber = new Odd();
        ArrayList<Integer> oddArr = new ArrayList<>();
        System.out.println("Odd Numbers Checker (input 5 numbers)");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number: ");
            oddArr.add(appScanner.nextInt());
        }
        System.out.println("Given numbers: " + oddArr + " the odd number/s is/are: " + oddNumber.onlyOdds(oddArr) + " only.");
    }
}