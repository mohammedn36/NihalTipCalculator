import java.util.Scanner;
import java.text.DecimalFormat;

public class NihalTipCaculator {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many People are in your group?: ");
        int groupNumber = scan.nextInt();
        scan.nextLine(); //clears out string buffer

        System.out.println("What is the tip percentage? Input a number between 0-100: ");
        int tipPercent = scan.nextInt();
        scan.nextLine(); //clears out string buffer

        System.out.println("Apples: " + groupNumber);
        System.out.println("Cost: " + tipPercent);
    }
}
