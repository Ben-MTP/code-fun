package com.core;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 6/5/2024-8:54 PM (>_<)/
 * @note Nhập vào N số, in ra số đầu tiên, số cuối cùng
 * INPUT: Dòng đầu tiên là số N <= 1000
 * N dòng sau mỗi dòng là 1 số nguyên <= 1_000_000
 * <p>
 * OUTPUT: In ra gồm 2 dong, dòng đâu tiên là số đầu tiên, dòng sau là số cuối cùng
 */
public class ChanDauChanCuoi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào N: ");
        int N = sc.nextInt();
        while (N <= 0 || N > 1_000) {
            System.out.println("Số N phải 0 < N <= 1_000. Vui lòng nhập lại!");
            N = sc.nextInt();
        }

        // Khởi tạo một mảng int:
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[0]);
        System.out.println(arr[N - 1]);

    }

}
