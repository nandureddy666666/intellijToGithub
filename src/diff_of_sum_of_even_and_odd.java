import java.util.Scanner;
public class diff_of_sum_of_even_and_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum_even=0;
        int sum_odd=0;
        int diff;
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(arr[j]%2==0)
            {
                (sum_even)+=arr[j];

            }
            else
            {
                sum_odd+=arr[j];
            }
        }
        diff=sum_odd-sum_even;
        System.out.println("the difference is   "+ diff);

    }
}
