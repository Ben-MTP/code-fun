import java.util.Scanner;

/**
 * @author ManhKM on 11/26/2021
 * @project code-fun
 * input: manhkm
 * output: MANHKM
 * -----------------------------------
 * Đếm số ký tự hoa, thường, khác, số trong chuỗi input.
 */
public class UpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value (text): ");
        String input = scanner.nextLine();

//        System.out.println(function1(input));
        function2(input);

    }

    /**
     * Sử dụng function có sẵn.
     * @param input
     * @return
     */
    public static String function1(String input){
        return input.toUpperCase();
    }

    /**
     * Hàm sử dụng bảng mã ASCII
     */
    public static void function2 (String input){
        // step: convert array varchar.
        char arrayChar[] = input.toCharArray();
        int arrayCharLength = arrayChar.length;

        // uppercase full array:
        for(int i = 0; i < arrayCharLength; i++){
            if(arrayChar[i] >= 'a' && arrayChar[i] <= 'z'){
                arrayChar[i] = (char)((int)arrayChar[i] - 32);
            }
        }

        // show string:
        for(int i = 0; i < arrayCharLength; i++){
            System.out.print(arrayChar[i]);
        }
    }

    /**
     * Method 3
     */
}
