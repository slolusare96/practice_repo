import java.util.*;
import java.lang.*;

public class downtristar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            if (i == n) {
                for (int k = 1; k <= n; k++)
                    System.out.print("* ");
            } else {
                for (int l = 1; l <= i; l++) {
                    if (l == 1 || l == i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }
}