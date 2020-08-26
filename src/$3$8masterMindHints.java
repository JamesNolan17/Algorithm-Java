//Slightly different from book

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class $3$8masterMindHints {
    public static int[] stringToInt(String[] arrs) {
        int[] ints = new int[arrs.length];
        for (int i = 0; i < arrs.length; i++) ints[i] = Integer.parseInt(arrs[i]);
        return ints;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stopBigLoop = false;
        while (!stopBigLoop) {
            String Terminate = scanner.nextLine();
            if (Terminate.equals("0")) stopBigLoop = true;
            else {
                int[] answerArray = stringToInt(scanner.nextLine().split(" "));

                boolean stopSmallLoop = false;
                while (!stopSmallLoop) {
                    int A = 0, B = 0;
                    int[] guessArray = stringToInt(scanner.nextLine().split(" "));
                    Set<Integer> guessSet = Arrays.stream(guessArray).boxed().collect(Collectors.toSet());
                    if (guessSet.size() == 1 && guessSet.contains(0)) stopSmallLoop = true;
                    else {
                        for (int i = 0; i < answerArray.length; i++)
                            if (guessArray[i] == answerArray[i]) {
                                A++;
                            }
                        for (int d = 0; d <= 9; d++) {
                            int c1 = 0, c2 = 0;
                            for (int i = 0; i < answerArray.length; i++) {
                                if (answerArray[i] == d) c1++;
                                if (guessArray[i] == d) c2++;
                            }
                            B += Math.min(c1, c2);
                        }
                        System.out.println("(" + A + "," + (B - A) + ")");
                    }
                }
            }
        }
    }
}
