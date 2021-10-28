import java.util.Scanner;

/**
 * @author ManhKM on 10/28/2021
 * @project code-fun
 */
public class DoubleValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1 = sc.nextInt();
        while (value1 > 100 || value1 < 0){
            System.out.println("So khong thoa man dieu kien:  0 < x <= 100");
            value1 = sc.nextInt();
        }
        System.out.println("The Result: " + (value1 * 2));
    }
}
