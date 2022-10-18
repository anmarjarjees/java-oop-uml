package p05_inheritance1;

import java.util.Random;

/*
 * We are extending all the members of Java built-in super-class "Random"
 * and adding to them in our subclass "Rand"
 * 
 * The Rand class is a child of Random
 * OR
 * The Rand class inherits from Random
 * OR
 * The Rand class extends from Random
 */
public class Rand extends Random {
    // Adding our custom method
    public char nextSmallLetter() {
        /*
         * In Java, we can take the integer value
         * which is the same as the decimal value in ASCII table
         * for any character through casting it to int:
         */

        /*
         * int aIntValue = (int) 'a';
         * System.out.println(aIntValue);
         */

        /*
         * We cannot use random with letter only with numbers,
         * so we can convert the letter to its Decimal Code (numeric value)
         * in the ASCII Table
         * 
         * Link: https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
         * 
         * For example:
         * - small "a" has a decimal value of 97
         * - small "z" has a decimal value of 122
         * The range of random numbers should be between 97 and 122
         * 
         * So we can get the int value an convert it to char
         * and this will be the random character
         * 
         * We cannot use .nextInt() as it will give us random for any negative or
         * positive number in all the integer range
         * 
         * we need to limit it to be between 27 to 122
         * 
         * we have 26 character
         * 
         * using .nextInt(26);
         * Returns a pseudorandom, uniformly distributed int value
         * between 0 (inclusive) and the specified value (exclusive),
         * drawn from this random number generator's sequence.
         * 
         * so in such case it will be between 0 and 26
         * since we know that the minimum is "a" that has the decimal value of 97
         * so we can add 97 to the generated random value
         */

        int randomInt = new Random().nextInt(26) + 97;
        // testing: casting the integer value to a character:
        System.out.println((char) randomInt);

        // return null;
        return ((char) randomInt);
    }
}
