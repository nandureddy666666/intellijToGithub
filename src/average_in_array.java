import java.util.Scanner;

public class average_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("enter the size");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.println((float) sum/n);

    }
}






