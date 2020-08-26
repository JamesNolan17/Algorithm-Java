public class Hanxin {
    public static void main(String[] args) {
        hanxin(2, 1, 6);
        hanxin(2, 1, 3);
    }

    public static void hanxin(int a, int b, int c) {
        if (a >= 3 || b >= 5 || c >= 7) {
            System.out.println("Invalid");
        } else {
            for (int total = 10; total <= 100; total++) {
                int A = total % 3;
                int B = total % 5;
                int C = total % 7;
                if (A==a && B==b && C==c) System.out.println(total);
            }
        }
        System.out.println("End 0ne Set");
    }
}
