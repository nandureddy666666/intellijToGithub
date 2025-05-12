public class palindrome
{
    public static void main(String[] args) {
        int n=133;
        int reverse=0,remainder,original;
        original=n;
        while(n!=0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n /= 10;
        }
        if(original==reverse)
        {
            System.out.println("it is a palindrome");
        }
        else {
            System.out.println("it is not a palinderome");
        }

        }
    }
