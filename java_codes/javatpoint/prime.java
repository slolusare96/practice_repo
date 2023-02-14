
// Writing a program to print first n prime numbers
import java.util.*;

public class prime {

    public boolean primeChecker(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }
        if (count <= 2)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime p = new prime();

        int i = 1;
        int j = 2;
        while (i <= n) {
            boolean flag2 = p.primeChecker(j);
            if (flag2 == true) {
                System.out.print(j + " ");
                i++;
            }
            j++;
        }
    }
}
