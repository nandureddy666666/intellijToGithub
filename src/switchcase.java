import java.util.Scanner;
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter thhe a,b values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter the operator");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case'*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("invalid operator");
                break;
        }
    }
}
