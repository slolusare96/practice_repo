import java.util.*;
import java.lang.*;

public class numpat6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int count = n;

            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count--;
            }

            System.out.println();
        }
    }
}