import java.util.*;
import java.lang.*;

public class numpat4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++)
                System.out.print(" ");
            for (int k = (n - i) + 1; k >= 1; k--)
                System.out.print(k);
            for (int l = 2; l <= (n - i) + 1; l++)
                System.out.print(l);

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int k = (n - i - 1) + 1; k >= 1; k--)
                System.out.print(k);
            for (int l = 2; l <= (n - i - 1) + 1; l++)
                System.out.print(l);

            System.out.println();
        }
    }
}