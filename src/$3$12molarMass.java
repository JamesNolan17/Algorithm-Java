import java.util.Arrays;

public class $3$12molarMass {
    public static void main(String[] args) {
        func("C6H5OH");
    }

    public static void func(String expression) {
        char[] array = expression.toCharArray();
        double[] value = {12.01, 1.008, 16.00, 14.01};
        char[] list = {'C', 'H', 'O', 'N'};
        double result = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (Character.isDigit(array[i])) result += value[Arrays.binarySearch(list, array[i - 1])] * ((int) array[i--] - (int)'0');
            else result += value[Arrays.binarySearch(list, array[i])];
        }
        System.out.println(expression + ": "+result);
    }
}