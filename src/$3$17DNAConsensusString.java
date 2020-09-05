import java.util.Arrays;
import java.util.Scanner;

public class $3$17DNAConsensusString {
    public static void main(String[] args) {
        func(5);
    }
    static void func(int m){
        StringBuilder[] array = new StringBuilder[m];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) array[i] = new StringBuilder(scanner.next());
        StringBuilder result = new StringBuilder();
        //Max Letter Box
        for (int i = 0; i < array[0].length(); i++){
            String best = "";
            char[] bestChar = {'A','C','G','T'};
            int[] bestTime = new int[4];
            for (StringBuilder Sequence:array) switch (Sequence.charAt(i)) {
                    case 'A' -> bestTime[0] += 1;
                    case 'C' -> bestTime[1] += 1;
                    case 'G' -> bestTime[2] += 1;
                    case 'T' -> bestTime[3] += 1;
                }
            //System.out.println(Arrays.toString(bestTime));
            char maxChar = 'A';
            int maxInt = 0;
            for (int j = 0; j < bestTime.length; j++){
                if (bestTime[j] > maxInt) { maxInt = bestTime[j]; maxChar = bestChar[j];}
            }
            result.append(maxChar);
        }
        System.out.println(result.toString());
    }
//TATGATAC
//TAAGCTAC
//AAAGATCC    ---> TAAGATAC
//TGAGATAC
//TAAGATGT
}
