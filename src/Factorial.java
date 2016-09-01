/**
 * Created by saleh on 8/29/16.
 */
public class Factorial {
    /**
     * This class calculates the result of Factorial base on reclusive function.
     */
    public static long Factorial (int number){
        if (number == 0)
        {
            return 1;
        }
        return number * Factorial(number -1);
    }
}
