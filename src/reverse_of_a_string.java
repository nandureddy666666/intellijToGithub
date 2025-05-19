import java.util.Scanner;
public class reverse_of_a_string {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string to reverse: ");
                String input = sc.nextLine();

                char[] chars = input.toCharArray();
                String reversed = "";
                for (int i = chars.length - 1; i >= 0; i--) {
                    reversed += chars[i]; // Append character one by one in reverse
                }

                System.out.println("Reversed string: " + reversed);

                sc.close();
            }
        }





