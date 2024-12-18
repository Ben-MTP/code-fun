package code.fun;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 12/18/2024-8:08 PM (>_<)/
 * @note Tinh mot tong:
 */
public class TongTinhTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter k: ");
        int k = sc.nextInt();

        long sum = 0L;
        for (int i = 1; i <= n; i++) {
            sum = sum + calculator(i, k);
        }
        System.out.println("Output: " + sum);

    }

    public static long calculator(int n, int k) {
        return (long) n * (n + k);
    }
}
