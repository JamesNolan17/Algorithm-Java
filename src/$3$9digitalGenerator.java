import java.util.Arrays;

public class $3$9digitalGenerator {
    public static int[] stringToInt(String[] arrs) {
        int[] ints = new int[arrs.length];
        for (int i = 0; i < arrs.length; i++) ints[i] = Integer.parseInt(arrs[i]);
        return ints;
    }

    public static void main(String[] args) {
        func(new int[]{216,121,2005});
    }

    public static void func(int[] yArray) {
        int maxY = 100000;
        int[] table = new int[maxY+1];
        for (int X = 1; X <= maxY; X++) {
            int Y = X;
            for (int digital : stringToInt((X + "").split(""))) Y += digital;
            if(Y<=maxY && table[Y]==0) table[Y] = X;
        }
        for (int y:yArray) System.out.println(table[y]);
    }
}
