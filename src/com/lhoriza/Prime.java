package com.lhoriza;
import java.util.ArrayList;

/*
The rule of prime number is it can be divided evenly only by itself and 1.
 */
public class Prime {

    public boolean isPrime(int number) {

        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(ArrayList<Integer> numbers) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }
}