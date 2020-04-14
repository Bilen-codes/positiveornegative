/*Gets a number from the user and print whether it is positive or negative.*/
import java.util.Scanner;
public class positiveornegative {
    public static void main (String args []){
        Scanner s = new Scanner(System.in);
        int number = 0;
        while (true) {
            System.out.println("Enter a number:");
            number = s.nextInt();
            if (number >= 0) {
                System.out.println(number + " is positive.");
            } else {
                System.out.println(number + " is negative.");
            }
        }


    }
}
