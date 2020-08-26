public class daffodil {
    public static void main(String[] args) {
        Daf();
    }
    public static void Daf(){
        for (int i = 100; i <= 999; i++){
            int A = i/100;
            int B = (i - 100*A)/10;
            int C = (i - 100*A - 10*B);
            int result = (int) (Math.pow(A,3)+Math.pow(B,3)+Math.pow(C,3));
            if (result == i){
                System.out.println(i);
            }
        }
    }
}
