import java.util.*;

public class Gugudan {
    public static  int[] calculate(int first, int second) {
        int[] result = new int[second];
        for(int i = 0; i < second; i++) {
            result[i] = first*(i+1);
        }
        return result;
    }

    public static void print(int first, int[] result) {
        for(int i = 0; i < result.length; i++) {
            System.out.printf("%d * %d = %d\n", first, i+1, result[i]);
        }
    }
}
