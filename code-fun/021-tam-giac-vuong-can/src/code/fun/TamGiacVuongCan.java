package code.fun;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 12/17/2024-9:28 PM (>_<)/
 * @note
 */
public class TamGiacVuongCan {
    public static void main(String[] args) {
        // B1: Nhap vao so nguyen duong N:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        // B2: In ra tam giac vuong can voi 2 canh bang N nhu:
        int len = n;
        for (int i = 0; i < n; i++) {
            for (int j = len; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
            len--;
        }
    }
}
