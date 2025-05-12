import java.util.Scanner;
public class _2d_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  rows of array");
        int r = sc.nextInt();
        System.out.println("enter the coloumns of array");
        int c = sc.nextInt();
        int[][] arr;
        arr = new int[r][c];
        System.out.println("enter the  elements of the atrray");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(" display the array elements");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(" " + arr[i][j]);
            }System.out.println(" ");
        }
    }
}
