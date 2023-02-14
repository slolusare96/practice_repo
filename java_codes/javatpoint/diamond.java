import java.util.*;
import java.lang.*;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter odd number of rows only!");
        int n = sc.nextInt();

        int x = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= i; j--)
                System.out.print(" ");
            for (int k = 1; k <= i + x; k++)
                System.out.print("*");
            System.out.println();
            x++;
        }

        int y = n;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(" ");
            for (int k = 1; k < (y - 1) + (x - 1); k++)
                System.out.print("*");

            System.out.println();
            x--;
            y--;
        }
    }
}