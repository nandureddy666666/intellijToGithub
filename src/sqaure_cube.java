import java.util.Scanner;
public class sqaure_cube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter ther number");
        int num= sc.nextInt();
        int square=num*num;
        int cube=square*num;
        System.out.println("the square of the "+num+ "  is  " +square);
        System.out.println("the cube of the "+num+ "  is  " +cube);
    }
}
