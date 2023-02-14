import java.util.*;

// Print factorial of a number

public class factorial {

    public long factorials(int n) {
        long ans = 1;
        for (int i = n; i >= 1; i--) {
            ans = ans * i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorial f = new factorial();

        System.out.println(f.factorials(n));
    }
}
