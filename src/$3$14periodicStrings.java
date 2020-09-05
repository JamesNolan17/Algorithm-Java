public class $3$14periodicStrings {
    public static void main(String[] args) {
        func("abcabcdabcabcd");
        func("fihnwduewafihnwduewafihnwduewafihnwduewafihnwduewafihnwduewafihnwduewa");
    }
    static void func(String input) {
        int[] factors = factor(input.length());
        StringBuilder sb = new StringBuilder(input);
        for (int i: factors) if (i != 0){
            boolean minCycle = true;
            String iniString = (String) sb.subSequence(0,i);
            for (int k = i ; k < factors.length - i; k += i) if (!sb.subSequence(k,k+i).equals(iniString)) minCycle = false;
            if (minCycle) {System.out.println(i); return;}
        }
    }

    static int[] factor(int input) {
        int[] factors = new int[input + 1];
        for (int i = 1; i <= Math.sqrt(input); i++) if (input % i == 0) {
                factors[i] = i;
                factors[input / i] = input / i;
            }
        return factors;
    }
}
