package com.core;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 6/1/2024-10:23 PM (>_<)/
 * @note Nhập vào 2 chữ cái A và B in ra số các chữ đừng giữa A và B:
 * input: d a
 * output: 2
 * giải thích: b và c
 */
public class ChuCaiNamGiua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chữ cái 1: ");
        String str1 = sc.next();
        while (str1.length() >= 2) {
            System.out.println("Chữ cái chỉ có 1 ký tự. Vui lòng nhập lại");
            str1 = sc.next();
        }

        System.out.println("Nhập chữ cái 2: ");
        String str2 = sc.next();
        while (str2.length() >= 2) {
            System.out.println("Chữ cái chỉ có 1 ký tự. Vui lòng nhập lại");
            str2 = sc.next();
        }

        char c1 = str1.charAt(0);
        char c2 = str2.charAt(0);

        System.out.println("Số ký tự trong khoảng: " + c1 + " và " + c2 + " là " + counterBetween(c1, c2) + " ký tự");

        System.out.println("Danh sách ký tự gồm: ");
        printCharBetween(c1, c2);
    }

    private static void printCharBetween(char c1, char c2) {
        int firstPos = c1 - 'a';
        int secondPos = c2 - 'a';

        if (firstPos < secondPos) {
            for (int i = firstPos + 1; i < secondPos; i++) {
                System.out.print((char) ('a' + i) + " ");
            }
        } else {
            for (int i = secondPos + 1; i < firstPos; i++) {
                System.out.print((char) ('a' + i) + " ");
            }
        }
    }

    private static int counterBetween(char c1, char c2) {
        int result = 0;
        int firstPos = c1 - 'a';
        int secondPos = c2 - 'a';

        return Math.abs(firstPos - secondPos) - 1;
    }
}
