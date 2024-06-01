package com.core;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 6/1/2024-9:57 PM (>_<)/
 * @note
 */
public class HinhChuNhat {
    public static void main(String[] args) {
//        int soHang = Integer.parseInt(args[0]);
//        int soCot = Integer.parseInt(args[1]);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng: ");
        int soHang = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int soCot = sc.nextInt();

        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print('#');
            }
            System.out.print("\n");
        }
    }
}
