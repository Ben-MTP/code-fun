import java.util.Scanner;

/**
 * @author ManhKM on 10/29/2021
 * @project code-fun
 * input: N (N <= 15)
 * output: in ra số các số nhỏ hơn hoặc bằng N mũ 2 và lớn hơn N + 1.
 * VD:
 * input: 3
 * output: 6
 */
public class NumberOfTerm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n + 1;
        int count = 0;
        while(i <= Math.pow(n, 2)){
            //System.out.println(i + ", ");
            i++;
            count++;
        }
        System.out.println(count);
    }
}
