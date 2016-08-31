/**
 * Created by saleh on 8/31/16.
 */
public class isPalindrome {
    public boolean palindrome (int number)
    {
        int reverse =0;
        int a =0;
        int n = number;
        while (number>0)
        {
            a = number%10;
            reverse = (reverse*10) + a;
            number = (number/10);
        }
        if (n == reverse) {
            return true;
        }
        else {
            return false;
        }
    }
}
