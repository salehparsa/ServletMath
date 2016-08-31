/**
 * Created by saleh on 8/31/16.
 */
public class isPrime {
    /**
     *
     * @param number
     * in this loop, if the number is even, return false since even numbers can't be prime (except 2)
     * from 3 until number greater than i*i (to speed up the loop) check if number % i is 0 or not.
     * @return if prime
     */
    public boolean isPrime (int number){
        if ((number%2)==0 && number != 2) {
            return false;
        }
        else {
            for (int i =3; i*i<number; i++ )
            {
                if (number%i ==0)
                    return false;
            }
            return true;
        }
    }
}
