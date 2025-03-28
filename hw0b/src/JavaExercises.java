import java.util.ArrayList;
import java.util.List;

public class JavaExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        // TODO: Fill in this function.
        int[] array = new int[6];
        for (int i = 0; i < 6; i++)
        {
            array[i] = i + 1;
        }
        return array;
        return null;
    }

    /** Returns the order depending on the customer.
     *  If the customer is Ergun, return ["beyti", "pizza", "hamburger", "tea"].
     *  If the customer is Erik, return ["sushi", "pasta", "avocado", "coffee"].
     *  In any other case, return an empty String[] of size 3. */
    public static String[] takeOrder(String customer) {
        // TODO: Fill in this function.
        if ( customer.equals("Ergun")){
            return ["beyti", "pizza", "hamburger", "tea"];
        }
        else if (customer.equals.("Erik")){
            return ["sushi", "pasta", "avocado", "coffee"];
        }
        else{
            String[] empty = new String[3];
            return empty;
        }
        return null;
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        // TODO: Fill in this function.

        int min = array[0];
        int max = array[0];
        for (int num : array){
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
        }
        return max - min;
        return 0;
    }

    /**
      * Uses recursion to compute the hailstone sequence as a list of integers starting from an input number n.
      * Hailstone sequence is described as:
      *    - Pick a positive integer n as the start
      *        - If n is even, divide n by 2
      *        - If n is odd, multiply n by 3 and add 1
      *    - Continue this process until n is 1
      */
    public static List<Integer> hailstone(int n) {
        return hailstoneHelper(n, new ArrayList<>());
    }

    private static List<Integer> hailstoneHelper(int x, List<Integer> list) {
        // TODO: Fill in this function.
        list.add(x);
        if (list.get(list.size() - 1) == 1){
            return list;
        }
        if ( list.get(list.size() - 1) % 2 == 0){
            int res = list.get(list.size() - 1) / 2;
            return hailstoneHelper(res , list);
        }
        else{
            res = list.get(list.size() - 1) * 3 + 1;
            return hailstoneHelper(res , list);
        }

        return null;
    }

}
