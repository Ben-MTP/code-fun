package com.core;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 6/5/2024-8:36 PM (>_<)/
 * @note Nhập vào ba số A, B, C kiểm tra xem 3 số có phải là 3 cạnh của 1 tam giác hay không?
 */
public class LaiLaTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] triangle = new int[3];
        System.out.println("Nhập vào giá trị cạnh AB/cm: ");
        triangle[0] = sc.nextInt();

        System.out.println("Nhập vào giá trị cạnh BC/cm: ");
        triangle[1] = sc.nextInt();

        System.out.println("Nhập vào giá trị cạnh CA/cm: ");
        triangle[2] = sc.nextInt();

        boolean isTriangle = checkTriangle(triangle[0], triangle[1], triangle[2]);

        System.out.println(isTriangle ? "YES" : "NO");
    }

    private static boolean checkTriangle(int i, int i1, int i2) {
        if (i + i1 > i2 && i1 + i2 > i && i + i2 > i1) {
            return true;
        }

        return false;
    }
}
