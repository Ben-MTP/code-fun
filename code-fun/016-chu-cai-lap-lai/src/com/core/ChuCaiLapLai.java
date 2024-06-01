package com.core;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 6/1/2024-10:51 PM (>_<)/
 * @note
 */
public class ChuCaiLapLai {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chữ cái in thường: ");
        String str1 = sc.next();

        while (str1.length() > 2) {
            System.out.println("Chữ cái chỉ có 1 ký tự, vui lòng nhập lại!");
            str1 = sc.next();
        }

        int numOfLoop = 10;
        for (int i = 0; i < numOfLoop; i++) {
            System.out.print(str1);
        }
    }
}
