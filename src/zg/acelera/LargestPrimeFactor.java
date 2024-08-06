package zg.acelera;

import java.util.ArrayList;
import java.util.List;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600851475143L));
    }

    public static long largestPrimeFactor(long n) {
        // Divide by 2 until n becomes odd
        while (n % 2 == 0) {
            n = n / 2;
        }

        // n must be odd at this point, so a skip of 2 can be used
        long i;
        for (i = 3; i <= Math.sqrt(n); i += 2) {
            // while i divides n, divide n
            while (n % i == 0) {
                n = n / i;
            }
        }

        // This condition is to handle the case when n is a prime number
        // greater than 2
        if (n > 2) {
            return n;
        }

        return i - 2;
    }
}
