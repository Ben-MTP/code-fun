package code.fun;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 12/18/2024-8:16 PM (>_<)/
 * @note
 */
public class ToHop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Output: " + calculator(n));

    }

    public static int calculator(int n) {
        return (n * (n - 1) * (n - 2)) / 6;
    }
}
