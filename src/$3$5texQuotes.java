public class $3$5texQuotes {
    public static void main(String[] args) {
        func("\"To be or not to be,\" quoth the Bard, \"that " +
                "is the question\".");
    }
    public static void func(String n){
        String[] stringArray = n.split("");
        boolean leftquote = true;
        for (int i = 0; i < stringArray.length; i++){
            if (stringArray[i].equals("\"")) {
                if (leftquote) stringArray[i] = "``";
                else stringArray[i] = "''";
                leftquote = !leftquote;
            }
        }
        StringBuilder str5 = new StringBuilder();
        for (String s : stringArray) str5.append(s);
        System.out.println(str5.toString());
    }
}
