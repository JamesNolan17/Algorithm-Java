import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import static java.lang.Character.getNumericValue;

public class $3$4abcXde {
    public static void main(String[] args) {
        func(new int[]{2,3,5,7,9});
    }
    public static void func(int[] num){
        Set<Integer> objectSet = Arrays.stream(num).boxed().collect(Collectors.toSet());
        for (int a:num){
            for (int b:num){
                for (int c:num){
                    for (int d:num){
                        for (int e:num){
                            boolean satisfied = true;
                            int abc = a*100+b*10+c;
                            int de = d*10+e;
                            //Need to judge
                            int abce = abc*e;
                            int abcd = abc*d;
                            int abcde = abc*de;
                            String numPool = abce + "" + abcd + "" + abcde + "";
                            char[] charPool =numPool.toCharArray();
                            for(char digitalChar:charPool){
                                if (!objectSet.contains(getNumericValue((int)digitalChar))) satisfied = false;
                            }
                            if (satisfied){
                                System.out.println(abc+"x"+de);
                            }

                        }
                    }
                }
            }
        }
    }
}
