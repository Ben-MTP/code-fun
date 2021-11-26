import java.util.Scanner;

/**
 * @author ManhKM on 10/29/2021
 * @project code-fun
 * input: oahcnix
 * output: xinchao
 */
public class XinChao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int maxLength = input.length();

        for(int i = maxLength -1 ; i >= 0; i--){
            System.out.print(input.charAt(i));
        }
    }
}
