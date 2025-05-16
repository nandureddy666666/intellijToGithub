import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class harshad_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int sum=0;
        String numstr=String.valueOf(num);
        for(int i=0;i<numstr.length();i++)
        {
            sum+=Character.getNumericValue(numstr.charAt(i));

        }
        if(num%sum==0)
        {
            System.out.println("the number is harshad numer ");
        }
        else
        {
            System.out.println(" the number is not harshad number");
        }
    }
}
