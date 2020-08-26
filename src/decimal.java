import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        while(b != 0 && !(a == 0 && b == 0 && c == 0)){

            double d = (double)a/(double)b;

            String s = String.format("%." + c + "f",d);
            System.out.println(s);


            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

        }
    }
}
