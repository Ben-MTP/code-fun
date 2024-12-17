package code.fun;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 12/17/2024-9:47 PM (>_<)/
 * @note
 */
public class DaySo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Result: " + calculateFn(n));
    }

    public static int calculateFn(int n) {
        System.out.println(n);
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }

        return 2 * calculateFn(n - 1) - calculateFn(n - 2);
    }

}
