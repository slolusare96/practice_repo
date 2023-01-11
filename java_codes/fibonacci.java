import java.lang.*;
import java.util.*;

//Writing a fibonacci code
public class fibonacci {
    int n1 = 0;
    int n2 = 1;
    int sum = 0;

    // Recursive approach
    public void fiboRecur(int num, int count) {
        if (num < count)
            return;

        else if (count == 1) {
            System.out.print(n1 + " ");
            fiboRecur(num, count + 1);
        }

        else if (count == 2) {
            System.out.print(n2 + " ");
            fiboRecur(num, count + 1);
        }

        else {
            sum = n1 + n2;
            System.out.print(sum + " ");
            n1 = n2;
            n2 = sum;
            fiboRecur(num, count + 1);
        }
    }

    // Iterative approach
    public void fiboPrinter(int num) {
        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i == 1)
                System.out.print(n1 + " ");
            else if (i == 2)
                System.out.print(n2 + " ");
            else {
                sum = n1 + n2;
                System.out.print(sum + " ");
                n1 = n2;
                n2 = sum;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fibonacci a = new fibonacci();
        a.fiboPrinter(n);
        System.out.println();
        a.fiboRecur(n, 1);
    }
}
