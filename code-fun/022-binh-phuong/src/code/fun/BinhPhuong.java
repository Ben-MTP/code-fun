package code.fun;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 12/17/2024-9:37 PM (>_<)/
 * @note
 */
public class BinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        Integer n = 0;
        try {
            n = sc.nextInt();

            // 1. Kiem tra so nguyen duong:
            while ((Math.abs(n) > Math.pow(10, 9)) || n < 0) {
                System.out.println("Vui long kiem tra lai: ");
                n = sc.nextInt();
            }

            // 2. Binh phuong cua so n:
            System.out.println("Result: " + (n * n));
        } catch (RuntimeException e) {
            System.out.println("Exception, please check again!!!");
        }
    }
}
