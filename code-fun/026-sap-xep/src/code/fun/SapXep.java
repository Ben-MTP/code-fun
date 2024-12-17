package code.fun;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ManhKM as [ADMIN]
 * @project code-fun on 12/17/2024-10:24 PM (>_<)/
 * @note
 *
 */
public class SapXep {
    public static void main(String[] args) {
        Integer n1 = Integer.parseInt(args[0]);
        Integer n2 = Integer.parseInt(args[1]);
        Integer n3 = Integer.parseInt(args[2]);

        List<Integer> list = new ArrayList<>();
        list.add(n1);
        list.add(n2);
        list.add(n3);

        // Sort list theo gia tri tang dan:
        list.sort((a, b) -> a - b);
        System.out.println(list);
    }
}
