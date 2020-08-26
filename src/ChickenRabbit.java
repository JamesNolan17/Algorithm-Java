import java.util.Arrays;

public class ChickenRabbit {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(CR(-1, 9)));
        System.out.println(Arrays.toString(CR(3, 8)));
        System.out.println(Arrays.toString(CR(8, 3)));
    }
    public static int[] CR(int n, int m){
        if (n < 0 || m < 0 || m % 2 == 1) return new int[]{-1};
        int a = (4*n - m) / 2;
        int b = n - a;
        return new int[]{a,b};
    }
}
