import java.util.Scanner;
public class perfect_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int i,sum=0;
        for(i=1;i<n;i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if(n==sum)
        {
            System.out.println(n+  "  is a perfect number");
        }
        else
        {
            System.out.println(n+"   is not a perfect number");
        }

    }
}
