public class $3$6WERTYU {
    public static void main(String[] args) {
        func("O S, GOMR YPFSU/");
    }

    public static void func(String n) {
        String table = "`1234567890-=QWERTYUIOP[]\\\\ASDFGHJKL;'ZXCVBNM,./";
        char[] charArray = table.toCharArray();
        char[] wrongCharArray = n.toCharArray();
        for (int wrongChar = 0; wrongChar < wrongCharArray.length; wrongChar++)
            for (int character = 1; character < charArray.length; character++)
                if (wrongCharArray[wrongChar] == charArray[character])
                    wrongCharArray[wrongChar] = charArray[character - 1];
        System.out.println(new String(wrongCharArray));
    }
}
