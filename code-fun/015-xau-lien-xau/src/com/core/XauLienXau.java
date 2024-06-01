package com.core;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 6/1/2024-10:40 PM (>_<)/
 * @note Nhập vào một xâu Z và in ra xâu Z và xâu đảo ngược của Z (liền nhau)
 * intput: abc
 * output: abccba
 */
public class XauLienXau {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mỗi xâu liền nhau: ");
        String str = sc.next();

        System.out.println("Chuỗi gốc: " + str);

        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = str.length() - 1; i >= 0; i--) {
            String str2 = String.valueOf(str.charAt(i));
            stringBuilder.append(str2);
        }

        System.out.println("Kết quả sau khi đảo ngược: " + (str + stringBuilder));
    }
}
