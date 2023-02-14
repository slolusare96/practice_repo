import java.util.*;
import java.lang.*;

public class revpryamid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = i + 1; j <= n; j++)
                System.out.print(" ");
            for (int k = i; k >= 1; k--)
                System.out.print("* ");
            System.out.println();
        }
    }
}