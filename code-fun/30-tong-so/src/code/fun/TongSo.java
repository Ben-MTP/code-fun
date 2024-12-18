package code.fun;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 12/18/2024-8:20 PM (>_<)/
 * @note
 */
public class TongSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("OUTPUT: " + sum);

    }

    private static int calculator(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 3;
        } else {
            return calculator(n - 2) + calculator(n - 1);
        }
    }
}
