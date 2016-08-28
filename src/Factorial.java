/**
 * Created by saleh on 8/29/16.
 */
public class Factorial {

    public static int Factorial (int number){
        if (number == 0)
        {
            return 1;
        }
        return number * Factorial(number -1);
    }
}
