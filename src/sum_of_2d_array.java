import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class sum_of_2d_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("enter the rows of first matrix");
        r=sc.nextInt();
        System.out.println("enter the columns of first array");
        c=sc.nextInt();

        int [][] arr1=new int[r][c];
        int [][]arr2=new int[r][c];
        int [][]sum=new int[c][r];
        System.out.println("enter the elements of first matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements of second matrix");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int i=0;i<r;i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(" "+sum[i][j]);
            }
            System.out.println(" ");
        }
    }
}
