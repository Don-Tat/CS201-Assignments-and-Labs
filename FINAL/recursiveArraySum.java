import java.util.Arrays;

public class recursiveArraySum {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(arraySum(array, 0)));
    }

    public static int[] arraySum(int[] array, int i) {
        if (i == array.length) {
            return array;
        }
        if (i != 0) {
            array[i] = array[i - 1] + array[i]; 
        }
        return arraySum(array, i + 1);
    }
}