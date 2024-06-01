package com.core;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 6/1/2024-10:15 PM (>_<)/
 * @note
 */
public class GiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số N: ");
        int n = sc.nextInt();
        while (n <= 0 || n > 10) {
            System.out.println("Số N phải > 0 và <= 10. Vui lòng nhập lại");
            n = sc.nextInt();
        }
        /**
         * Công thức tính giai thừa:
         * N! = 1*2*3*...*(N-1)*N
         */

        int giaiThua = 1;
        for (int i = 0; i < n; i++) {
            giaiThua = giaiThua * (i + 1);
        }
        System.out.println("Kết quả của " + n + "! = " + giaiThua);
    }
}
