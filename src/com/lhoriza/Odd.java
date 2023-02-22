package com.lhoriza;
import java.util.ArrayList;

/*
The rule of odd number is an odd number is a number that is not divisible by 2.
 */
public class Odd {

    public boolean isOdd(int number) {
        if (number % 2 == 0 ) {
            return false;
        }
        return true;
    }

    public ArrayList<Integer> onlyOdds(ArrayList<Integer> numbers) {
        ArrayList<Integer> odds = new ArrayList<>();
        for (int number : numbers) {
            if (isOdd(number)) {
                odds.add(number);
            }
        }
        return odds;
    }
}