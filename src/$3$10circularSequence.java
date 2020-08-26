import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class $3$10circularSequence {
    public static void main(String[] args) {
        func("CTCC");
        func("CGAGTCAGCT");
    }

    static void func(String s) {
        StringBuilder sb = new StringBuilder(s), min = new StringBuilder(s);
        for (int i = 1; i < s.length() - 1; i++) {
            StringBuilder current = new StringBuilder(sb.substring(i, s.length()) + sb.substring(0, i));
            for (int j = 0; j < min.length(); j++) {
                if (current.charAt(j) < min.charAt(j)) min = current;
                if (current.charAt(j) != min.charAt(j)) break;
            }
        }
        System.out.println(min);
    }
}