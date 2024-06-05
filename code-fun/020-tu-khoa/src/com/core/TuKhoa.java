package com.core;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 6/5/2024-9:13 PM (>_<)/
 * @note Nhập vào 1 xâu Z độ dài >=20 gồm các chữ cái thường, in ra chữ cái thứ 5 và thứ 9 của xây này dưới dạng chữ in HOA.
 * INPUT: Gồm 1 xây ký tự các chữ cái thường, viết liền không dấu
 * <p>
 * OUTPUT: Gồm 2 ký tự thảo mãn đề bài, hai ký tự này cách nhau bởi dấu cách.
 */
public class TuKhoa {

    public static void main(String[] args) {
        int index1 = 5;
        int index2 = 9;
        int minLength = 20;

        Scanner sc = new Scanner(System.in);
        String line = "";
        while ((line = sc.nextLine()).length() > 0) {
            while (line.length() < minLength) {
                System.out.println("Vui lòng nhập chuỗi với độ dài >= 20 ký tự!");
                line = sc.nextLine();
            }

            System.out.println(valueOfIndex(line, index1) + " " + valueOfIndex(line, index2));
            break;
        }
    }

    private static char valueOfIndex(String line, int index) {
        char[] chars = line.toCharArray();
        return chars[index - 1];
    }
}
