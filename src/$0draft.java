public class $0draft {
    public static int[] stringToInt(String[] arrs) {
        int[] ints = new int[arrs.length];
        for (int i = 0; i < arrs.length; i++) ints[i] = Integer.parseInt(arrs[i]);
        return ints;
    }
    public static void main(String[] args) {
        int X = 198;
        for (int digital : stringToInt((X + "").split(""))) X += digital;
        System.out.println(X);
    }
}
