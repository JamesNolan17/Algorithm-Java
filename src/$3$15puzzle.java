import java.util.Scanner;

public class $3$15puzzle {
    public static void main(String[] args) {
        func("ARRBBL0");
    }

    static void func(String order) {
        String[][] initial = new String[5][5];
        int[] emptyPosition = new int[2];
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                initial[row][col] = scanner.next();
                if (initial[row][col].equals("0")) {
                    emptyPosition = new int[]{row, col};
                }
            }
        }
        char[] orderArray = order.toCharArray();
        for (char simpleOrder : orderArray) {
            switch (simpleOrder) {
                case 'A':
                    initial[emptyPosition[0]][emptyPosition[1]] = initial[emptyPosition[0] - 1][emptyPosition[1]];
                    initial[emptyPosition[0] - 1][emptyPosition[1]] = "0";
                    emptyPosition[0] -= 1;
                    break;
                case 'B':
                    initial[emptyPosition[0]][emptyPosition[1]] = initial[emptyPosition[0] + 1][emptyPosition[1]];
                    initial[emptyPosition[0] + 1][emptyPosition[1]] = "0";
                    emptyPosition[0] += 1;
                    break;
                case 'L':
                    initial[emptyPosition[0]][emptyPosition[1]] = initial[emptyPosition[0]][emptyPosition[1] - 1];
                    initial[emptyPosition[0]][emptyPosition[1] - 1] = "0";
                    emptyPosition[1] -= 1;
                    break;
                case 'R':
                    initial[emptyPosition[0]][emptyPosition[1]] = initial[emptyPosition[0]][emptyPosition[1] + 1];
                    initial[emptyPosition[0]][emptyPosition[1] + 1] = "0";
                    emptyPosition[1] += 1;
                    break;
                case '0':
                    break;
            }
        }
        for (String[] row : initial) {
            for (String num : row) {
                System.out.printf("%4s", num);
            }
            System.out.println("");
            System.out.println();
        }
    }
}