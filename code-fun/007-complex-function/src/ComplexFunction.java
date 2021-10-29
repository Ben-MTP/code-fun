/**
 * @author ManhKM on 10/29/2021
 * @project code-fun
 * input: a, b with: a<= 1000, b<= 1000
 * output: f() = a + b + a x b
 */
public class ComplexFunction {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int result = a + b + (a*b);
        System.out.println(result);
    }
}
