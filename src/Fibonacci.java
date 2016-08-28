/**
 * Calss to calculater Fibonacci
 * Created by saleh on 8/28/16.
 */
public class Fibonacci {

    /**
     * @param number
     * Recursive function for calculation fibonacci
     * If you want to show the complete series:
     * int result;
     * for (int i=1; i<=number; i++) {
     * result =(fibonacci.Fibonacci(i));
     * }
     * In this application, it streams the series via Servlet Writer.
     * @return Fibonacci
     */
    public static int Fibonacci(int number)
    {
        if (number ==1 || number == 2)
        {
            return 1;
        }
        return Fibonacci(number-1) + Fibonacci(number-2);
    }

}
