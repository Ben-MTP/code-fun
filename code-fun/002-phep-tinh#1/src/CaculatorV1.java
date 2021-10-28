/**
 * @author ManhKM on 10/28/2021
 * @project code-fun
 *
 * Logic:
 * Enter A, B, C
 * Return: (A-B)xC with (A, B, C <= 100)
 * Cánh nhau bởi dấu cách.
 */
public class CaculatorV1 {
    public static void main(String[] args) {
        int result = (Integer.parseInt(args[0]) - Integer.parseInt(args[1])) * Integer.parseInt(args[2]);
        System.out.println("The result of (A-B)xC: " + result);
    }
}
