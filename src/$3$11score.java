public class $3$11score {
    public static void main(String[] args) {
        func("OOXXOXXOOO");
    }
    public static void func(String s){
        char[] array = s.toCharArray();
        int counter = 0;
        int score = 0;
        for (char i : array){
            if (i == 'X') counter = 0;
            else if (i == 'O') {
                counter++;
                score += counter;
                System.out.print(counter + "+");
            }
        }
        System.out.println("=" + score);
    }
}
