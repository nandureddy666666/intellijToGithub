import java.util.Scanner;
public class not_div_by_2_3_5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num");
        int num= sc.nextInt();
        int sum=0;
        System.out.println("the number not div by 2 and 3 and 5 are");
       for(int i=0;i<=num;i++)
        {
            if(i % 2 != 0&&i % 3!=0&&i%5!=0)
            {
                System.out.println(i + " is  not divisible");
               sum+=i;
            }
        }
       System.out.println("sum of the numbers is");
       System.out.println(sum);
    }
}
