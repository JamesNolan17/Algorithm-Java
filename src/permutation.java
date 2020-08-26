import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class permutation {
    public static void main(String[] args) {
        for (int num1 = 123; num1 < 329; num1++) {
            int num2 = 2 * num1;
            int num3 = 3 * num1;
            int a = num1 / 100;
            int b = num1 / 10 % 10;
            int c = num1 % 10;
            int d = num2 / 100;
            int e = num2 / 10 % 10;
            int f = num2 % 10;
            int g = num3 / 100;
            int h = num3 / 10 % 10;
            int i = num3 % 10;
            int[] array = {a, b, c, d, e, f, g, h, i};
            /*System.out.println(Arrays.toString(array));*/
            Set<Integer> objectSet = Arrays.stream(array).boxed().collect(Collectors.toSet());
            if (objectSet.size() == 9 && !objectSet.contains(0)) {
                System.out.print('|');
                System.out.print(num1);
                System.out.print(" ");
                System.out.print(num2);
                System.out.print(" ");
                System.out.print(num3);
                System.out.println('|');
            }

        }
    }
}
