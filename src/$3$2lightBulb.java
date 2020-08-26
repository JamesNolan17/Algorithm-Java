public class $3$2lightBulb {
    public static void main(String[] args) {
        func(7, 3);
    }

    public static void func(int n, int k) {
        int[] light = new int[n];
        /*for (int i: light) System.out.println(i);*/
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                int index = j - 1;
                if (j % i == 0) light[index] = 1 - light[index];
            }
        }
        for (int j = 1; j <= n; j++) {
            int index = j - 1;
            if (light[index] == 1) System.out.println(j);
        }
    }
}
