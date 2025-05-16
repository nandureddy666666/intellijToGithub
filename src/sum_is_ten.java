import  java.util.Scanner;
public class sum_is_ten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // System.out.println("enter a b c values");
      //  int a= sc.nextInt();
      //  int b=sc.nextInt();
       // int c=sc.nextInt();
        int i;
        int sum;
        for(i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
            {
                for(int k=0;k<10;k++)
                {
                    sum=i+j+k;
                    if(sum==10)
                    {
                        System.out.println(" the numbers are  "+i +"   and  "+j+"   and  "+k );
                    }
                }
            }
        }
    }
}
