import java.util.Scanner;

/**
 * @author ManhKM on 12/2/2021
 * @project code-fun
 * input: C
 * output: b
 * Nhập vào chữ cái hoa, in ra chữ cái thường liên trước chữ hoa đó.
 */
public class Main {
    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        input = sc.nextLine();

        char[] inputChar = input.toCharArray();
        char inputValue = inputChar[0];
        int inputValueConvert = inputValue + 31;

        System.out.println(inputValue);
        System.out.println((char) inputValueConvert);
    }
}
