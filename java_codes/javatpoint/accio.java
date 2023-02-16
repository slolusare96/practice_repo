import java.util.*;

public class accio {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
            arr2[i] = arr[i];
        }

        int ans = ArrayProblem1(n, arr, arr2);
        System.out.println(ans);
    }

    public static int ArrayProblem1(int n, int[] arr, int[] arr2) {
        Arrays.sort(arr2);
        // System.out.println(Arrays.toString(arr2));

        int index = 0;
        for (int i = 0; i <= (n - 1); i++) {
            // System.out.println(arr[i] + " " + arr2[n - 1]);
            if (arr[i] == arr2[n - 1]) {
                // System.out.println(i);
                index = i;
                break;
            }
        }
        return index;
    }
}