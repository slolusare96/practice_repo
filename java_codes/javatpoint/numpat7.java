import java.util.*;
import java.lang.*;

public class numpat7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = 1;

        for (int i = 1; i <= n; i++) {
            int y = x;
            for (int j = 1; j <= i; j++) {
                System.out.print(y + " ");
                y--;
            }
            x++;
            System.out.println();
        }
    }
}