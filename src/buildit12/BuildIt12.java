/*
 * Copyright 2016 Len Payne <len.payne@lambtoncollege.ca>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package buildit12;

/**
 *
 * @author Len Payne <len.payne@lambtoncollege.ca>
 */
public class BuildIt12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(fibonacci(0, 1, 10));
        System.out.println(fibonacci_2(10));
        System.out.println(gcd(132, 24));
        int[] array = {1, 3, 5, 6, 8, 9, 12, 14, 15, 20};
        System.out.println(binarySearch(6, array, 0, array.length - 1));
        System.out.println(binarySearch(4, array, 0, array.length - 1));
    }

    /**
     * Find the factorial calculation of a given integer
     *
     * @param num the requested integer
     * @return the factorial calculation
     */
    public static int factorial(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    /**
     * Find the sum of positive integers up to a given integer
     *
     * @param num the top bound
     * @return the sum
     */
    public static int sum(int num) {
        if (num <= 0) {
            return 0;
        } else {
            return num + sum(num - 1);
        }
    }

    /**
     * Find the desired number in the Fibonacci sequence (zero-indexed)
     *
     * @param x the first number
     * @param y the second number
     * @param count how many numbers deeper
     * @return the number in the Fibonacci sequence at the given position
     */
    public static int fibonacci(int x, int y, int count) {
        if (count >= 1) {
            return fibonacci(y, x + y, count - 1);
        } else {
            return x;
        }
    }

    /**
     * Alternate solution for finding the desired number in the fibonacci
     * sequence
     *
     * @param n the index of the desired number
     * @return the value
     */
    public static int fibonacci_2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci_2(n - 1) + fibonacci_2(n - 2);
        }
    }

    /**
     * Return the greatest common divisor of two integers
     *
     * @param x the first integer
     * @param y the second integer
     * @return their greatest common divisor
     */
    public static int gcd(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return gcd(y, x % y);
        }
    }

    /**
     * Recursive solution for a Binary Search
     * @param needle the value you're searching for
     * @param haystack the array you're searching through
     * @param first the start of the search area
     * @param last the end of the search area
     * @return the position of the value
     */
    public static int binarySearch(int needle, int[] haystack, int first, int last) {
        if (first > last) {
            return -1;
        }
        int mid = (first + last) / 2;
        if (needle == haystack[mid]) {
            return mid;
        } else if (haystack[mid] < needle) {
            return binarySearch(needle, haystack, mid + 1, last);
        } else {
            return binarySearch(needle, haystack, first, mid - 1);
        }
    }
}
