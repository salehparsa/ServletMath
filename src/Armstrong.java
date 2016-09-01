/**
 * Created by saleh on 9/1/16.
 */
public class Armstrong {
    /**
     * An Armstrong number of 3 digit is a number for which sum of cube of its digits are equal to number
     * e.g. 371 is an Armstrong number because 3*3*3 + 7*7*7 + 1*1*1 = 371).
     */
    public boolean isArmstrong(int number){
        int sum = 0;
        int mod= 0;
        int checker = number;
        while (number >0)
        {
            mod = (number%10);
            number = number /10;
            sum = sum + (mod*mod*mod);
        }
        if (checker == sum) {
            return true;
        }
        else {
            return false;
        }
    }
}
