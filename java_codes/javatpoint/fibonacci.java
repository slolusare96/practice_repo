// Print first n fibonacci numbers

import java.util.*;
import java.lang.*;

class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long x = 0;
        long y = 1;

        System.out.print(x + " " + y + " ");
        for (long i = 2; i <= n; i++) {
            long z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;
        }
    }
}