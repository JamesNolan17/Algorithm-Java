public class triangle {
    public static void main(String[] args) {
        func(20);
    }

    public static void func(int n){
        for(int i = 0; i <= n; i++){
            int a = 1+2*(n-i);
            int b = i;
            for (int A = 1; A <= b; A++){
                System.out.print(" ");
            }
            for (int B = 1; B <= a; B++){
                System.out.print("#");
            }
            for (int A = 1; A <= b; A++){
                System.out.print(" ");
            }
            System.out.println("");

        }
    }

}
