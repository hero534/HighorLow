import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int compInt = rnd.nextInt(10)+1;
        int humanInt = 0;
            do {
                System.out.println("Enter a number between 1 and 10: ");
                humanInt = in.nextInt();
                    if (humanInt < compInt)
                        System.out.println("Your guess was low!");
                    else if (humanInt > compInt)
                        System.out.println("Your guess was high!");
                    else System.out.println("Your guess was on the money!");
            }while(humanInt >= 1 && humanInt <= 10);
    }
}