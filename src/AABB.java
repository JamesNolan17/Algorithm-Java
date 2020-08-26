public class AABB {
    public static void main(String[] args) {
        aabb();
    }


    public static void aabb(){
        for (int i = 1; i <= 9; i++){
            for (int j = 0; j <= 9; j++){
                int number = i*1100 + j*11;
                double sqrtNumber = Math.sqrt(((double)number));
                if (((int)sqrtNumber - sqrtNumber) <= 0.000001
                && ((int)sqrtNumber - sqrtNumber) >= -0.000001){
                    System.out.println(number);
                }
            }
        }
    }
}
