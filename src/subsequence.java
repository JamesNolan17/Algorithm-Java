import java.text.DecimalFormat;
import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        while (m != 0 && n != 0){
            double sum = 0;
            for (int t = n; t <= m; t++){
                sum += 1/((double)t*(double)t);
            }
            DecimalFormat df = new DecimalFormat("0.00000");
            System.out.println(df.format(sum));
            n = scanner.nextInt();
            m = scanner.nextInt();
        }
    }
}
