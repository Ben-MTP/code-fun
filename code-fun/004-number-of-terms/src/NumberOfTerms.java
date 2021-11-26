import java.util.Scanner;

/**
 * @author ManhKM on 10/28/2021
 * @project code-fun
 * input: N (N<=50)
 * output: f = (N-1)/2
 * In ra các số dương nhỏ hơn hoặc bằng chặn trên của f
 * -----
 * input: 9
 * output: 4
 */
public class NumberOfTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        while(number > 50 || number < 0){
            System.out.println("Try again - Enter the number: ");
            number = sc.nextInt();
        }

        int result = (number - 1) / 2;

        for(int i = 0; i <= result ; i++){
            if(i == 0){
                continue;
            }
            System.out.print(i + ", ");
        }
    }
}
