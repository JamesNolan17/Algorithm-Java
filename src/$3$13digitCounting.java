import java.util.Arrays;
public class $3$13digitCounting {
    public static void main(String[] args) {
        func(12);
        func(100);
    }
    static void func(int number){
        int[] count = new int[10];
        for (int n = 1; n <= number; n++) for (char digit : Integer.toString(n).toCharArray()) count[(int)digit - (int)'0']++;
        System.out.println(Arrays.toString(count));
    }
}
