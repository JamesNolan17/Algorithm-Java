public class $3$3snakeNum {
    public static void main(String[] args) {
        func(20);
    }

    public static void func(int n) {
        int[][] array = new int[n][n];
        array[0][n - 1] = 1;
        int pointerX = 0;
        int pointerY = n - 1;
        int currentNum = 2;
        while (currentNum <= n * n) {
            for (int x = pointerX + 1; x <= n - 1; x++) {
                if (array[x][pointerY] == 0) {
                    pointerX = x;
                    array[pointerX][pointerY] = currentNum;
                    currentNum++;
                }
            }
            for (int y = pointerY - 1; y >= 0; y--) {
                if (array[pointerX][y] == 0) {
                    pointerY = y;
                    array[pointerX][pointerY] = currentNum;
                    currentNum++;
                }
            }
            for (int x = pointerX - 1; x >= 0; x--) {
                if (array[x][pointerY] == 0) {
                    pointerX = x;
                    array[pointerX][pointerY] = currentNum;
                    currentNum++;
                }
            }
            for (int y = pointerY + 1; y <= n - 1; y++) {
                if (array[pointerX][y] == 0) {
                    pointerY = y;
                    array[pointerX][pointerY] = currentNum;
                    currentNum++;
                }
            }
        }
        //Display
        int SPACE = (int) (java.lang.Math.log10(n * n)) + 2;
        for (int[] row : array) {
            for (int num : row) {
                System.out.printf("% " + SPACE + "d", num);
            }
            System.out.println("");

        }
    }
}
