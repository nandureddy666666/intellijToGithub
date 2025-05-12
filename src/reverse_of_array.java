
public class reverse_of_array {
    public static void main(String[] args) {
        int [] marks={20,22,30,66,99,88,66,};
        System.out.println("original array");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("reversed array is ");
        for(int i= marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }
    }
}
