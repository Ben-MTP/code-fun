/**
 * @author ManhKM on 12/2/2021
 * @project code-fun
 * Nhập vào 3 số a,b,c in ra diện tích tam giác có 3 cạnh a, b, c
 * Với các giá trị a, b, c <= 100
 *
 * Nhập 3 số cánh nhau dấu: cách.
 */
public class STamGiac {
    public static void main(String[] args) {
        /**
         * Công thức tính:
         * S = pr
         * p -> nửa chu vi
         * công thức:
         *
         */
        float a = Integer.parseInt(args[0]);
        float b = Integer.parseInt(args[1]);
        float c = Integer.parseInt(args[2]);
        float p = (a + b + c)/2;

        float sTamGiac = (float) Math.sqrt(p*(a - p)*(b - p)*(c - p));
        System.out.println(sTamGiac);
    }
}
