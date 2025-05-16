public class all_two_digitts_div_by_seven {
    public static void main(String[] args) {
        int i;
        int sum=0;
        System.out.println("the numbers are");
        for(i=10;i<=99;i++)
        {

            if(i%7==0)
            {

                System.out.println(i);
                sum+=i;

            }
        }
        System.out.println(" the sum the numbers are");
        System.out.println(sum);
    }
}
