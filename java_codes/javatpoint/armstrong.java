import java.util.*;

public class armstrong {

    public long power(long sub, int sup) {
        long temp3 = 1;
        for (int i = 1; i <= sup; i++) {
            temp3 = temp3 * sub;
        }
        return temp3;
    }

    public int countDigits(long n1) {
        long temp1 = n1;
        int count = 0;

        while (temp1 != 0) {
            count++;
            temp1 = temp1 / 10;
        }

        return count;
    }

    public boolean armChecker(long n) {
        long temp = n;
        armstrong a1 = new armstrong();
        int d = a1.countDigits(temp);

        long sum = 0;

        while (temp != 0) {
            long rem = temp % 10;
            sum = sum + a1.power(rem, d);
            temp = temp / 10;
        }

        if (sum == n)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        armstrong a = new armstrong();

        long x = 1;
        long y = 0;

        while (x <= n) {
            if (a.armChecker(y) == true) {
                System.out.print(y + " ");
                x++;

                if (x % 10 == 0)
                    System.out.println();
            }
            y++;
        }

    }
}
