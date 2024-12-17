package code.fun;

import java.util.Scanner;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 12/17/2024-10:21 PM (>_<)/
 * @note
 */
public class GapDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder(input);
        System.out.println(result.append(" ").append(input));
    }
}
