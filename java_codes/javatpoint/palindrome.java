// Print first n palindrome numbers

import java.util.*;

public class palindrome {

    public boolean palChecker(long n) {
        long temp = n;
        long sum = 0;

        while (temp != 0) {
            long rem = temp % 10;
            sum = (sum * 10) + rem;
            temp = temp / 10;
        }

        if (sum == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        palindrome p = new palindrome();

        long a = 1;
        long b = 0;
        while (a <= n) {
            boolean flag = p.palChecker(b);
            if (flag == true) {
                System.out.print(b + " ");
                a++;
                if (a % 10 == 0)
                    System.out.println();
            }
            b++;
        }
    }
}
