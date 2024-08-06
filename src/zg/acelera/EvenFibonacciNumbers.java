package zg.acelera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenFibonacciNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int previous = 1;
        int current = 2;

        while (current <= 4000000) {
            if (current % 2 == 0) {
                sum += current;
            }

            int next = previous + current;
            previous = current;
            current = next;
        }

        System.out.println(sum);
    }
}
