import java.util.*;
import java.lang.*;

public class numpat1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= i; j++)
                System.out.print(count++ + " ");

            System.out.println();
        }
    }
}