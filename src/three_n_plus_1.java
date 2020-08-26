public class three_n_plus_1 {
    public static void main(String[] args) {
        func(46957);
    }
    public static void func(int n){
        if (n <= 1 || n >1000000000){
            System.out.print("Invalid");
        }
        while (n != 1){
            System.out.print(" "+ n + " ->");
            if (n%2 == 1) n=3*n+1;
            else          n=n/2;
        }
        System.out.print(" 1");
    }
}
