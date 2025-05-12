import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class element_search
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element need to be searched");
        int e=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==e)
            {
                System.out.println("element present ion array at the positon of"+i);
                break;
            }
            else {
                System.out.println("element  not present in the arary");
                break;
            }
        }


    }
}
