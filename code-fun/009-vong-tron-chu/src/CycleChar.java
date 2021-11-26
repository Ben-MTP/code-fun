import java.util.Scanner;

/**
 * @author ManhKM on 11/26/2021
 * @project code-fun
 */
public class CycleChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character: ");
        String input = scanner.nextLine();

        // convert String to char:
        char arrayChar[] = input.toCharArray();
        char charValue = arrayChar[0];
        int nextValue = Integer.parseInt(String.valueOf(arrayChar[2]));

        char i = 'a';
        while (i >= 'a' && i <= 'z'){
            i = (char)(charValue + nextValue);
            if(i > 'z'){
                /**
                 * Chưa logic chỗ này
                 */
                int a = 'z' - charValue;
                int step = (nextValue - a) - 1;
                i = (char)('a' + step);
            }
            break;
        }
        System.out.println(i);
    }
}
