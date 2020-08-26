public class $3$1arrayEndToStart {
    public static void main(String[] args) {
        for (int value : function(new int[]{1, 2, 3, 4, 5})) {
            System.out.println(value);
        }
    }

    public static int[] function(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[array.length - 1 - i];
        }

        return result;
    }
}
