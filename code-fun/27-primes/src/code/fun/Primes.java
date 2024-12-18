package code.fun;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 12/18/2024-7:57 PM (>_<)/
 * @note Kiểm tra một số có là số nguyên hay không?
 * INPUT: Một số n
 * OUTPUT: Nếu n là số nguyên tố thì in ra YES, nếu không thì in ra ước nguyên tố nguyên dương nhỏ nhất
 */
public class Primes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int uocMin = 0;
        boolean isNguyenTo = false;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                uocMin = i;
                System.out.println(uocMin);
                break;
            } else {
                isNguyenTo = true;
            }
        }
        System.out.println(isNguyenTo ? "YES" : "");

    }
}
