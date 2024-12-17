package code.fun;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 12/17/2024-10:17 PM (>_<)/
 * @note
 */
public class DaySo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Result: " + calculateFn(n));
    }

    private static int calculateFn(int n) {
        if(n == 0){
            return 1;
        } else if(n == 1){
            return 1;
        } else {
            return 2 * calculateFn(n - 1) - calculateFn(n - 2);
        }
    }
}
