import java.util.Scanner;


public class userinput {
    public static void main(String[] args)
    {
        System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(a);
        int n= sc.nextInt();
        int i=0;
        if (a < 2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        while (i<n)
        {
            System.out.println(i);
            i++;
        }

    }
}
