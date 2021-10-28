import java.util.Scanner;

/**
 * @author ManhKM on 10/28/2021
 * @project code-fun
 * Input: A
 * Output: a
 */
public class LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.printf("Input %s --> Output %s", input, input.toLowerCase());
    }
}
