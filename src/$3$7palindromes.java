public class $3$7palindromes {
    public static void main(String[] args) {
        func("NOTAPALINDROME");
        func("ISAPALINILAPASI");
        func("2A3MEAS");
        func("ATOYOTA");
    }

    public static void func(String n) {
        boolean isMirrorStr = true; //A-Z1-9 65-90 49-57
        String reverseTable = "A   3  HIL JM O   2TUVWXY51SE Z  8 ";
        char[] reverseCharTable = reverseTable.toCharArray();
        char[] inputChar = n.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(n);
        for (char i : inputChar) {
            for (int t = 0; t < reverseCharTable.length; t++)
                if (i == reverseCharTable[t])
                    sb.append((t <= 25) ? (char) ((int) 'A' + t) : (char) ((int) '1' + t - 26));
        }
        System.out.print(n + " " + ((sb.reverse().toString().equals(n)) ? "" : "不") + "是镜像数");
        System.out.println(" " + ((sb2.reverse().toString().equals(n)) ? "" : "不") + "是回文数");
    }

}
