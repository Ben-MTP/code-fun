package com.core;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 6/5/2024-9:04 PM (>_<)/
 * @note Nhập vào các số, khi nào nhập đến số 19 thì in ra số này và dừng chương trình
 * INPUT: Gồm các số nguyên, mỗi số nằm trên một dong, các số nguyên nhỏ hơn 10^15
 * <p>
 * OUTPUT: In ra số 19 nếu có, nếu tất cả số đều không phải là 19 thì in ra "IMPOSSIBLE"
 */
public class So19 {
    public static void main(String[] args) {
        double MAX = Math.pow(10, 15);

        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            count++;
            int input = sc.nextInt();
            while (input > MAX) {
                System.out.println("Số nguyên phải có giá trị <=" + MAX);
                input = sc.nextInt();
            }

            if (input == 19) {
                System.out.println(input);
                System.out.println("Kết quả in ra sau: " + count + " lần nhập liệu");
                break;
            }

        }
    }
}
