import java.util.*;
import java.lang.*;

public class tristar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            if (i != n) {
                for (int k = 1; k <= i; k++) {
                    if (k == 1 || k == i) {
                        System.out.print("* ");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int l = 1; l <= n; l++)
                    System.out.print("* ");

                System.out.println();
            }
        }
    }
}