import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int i=1;
        System.out.println("enter the number");
        int n= sc.nextInt();
        if(n<0)
        {
            System.out.println("factorial not possible");

        }
        else {


            for (i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println(" the factorial of give number is");
            System.out.println(fact);
        }

    }

}
