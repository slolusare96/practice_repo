import java.util.*;

public class prime {
    // commit results checking

    // changes done in github

    // testing merge

    // prime checker
    public void primeChecker(int n) {
        if (n == 1 || n == 0)
            System.out.println("No");
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        prime p = new prime();
        p.primeChecker(n);
    }
}
