import java.util.Scanner;
import java.text.DecimalFormat;

public class NihalTipCaculator {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        System.out.println("Welcome to the tip calculator!");
        System.out.println("How many People are in your group?: ");
        int groupNumber = scan.nextInt();
        scan.nextLine(); //clears out string buffer

        System.out.println("What is the tip percentage? Input a number between 0-100: ");
        int tipPercent = scan.nextInt();
        scan.nextLine(); //clears out string buffer

        double num   = 0.0;
        double total = 0.0;

        while (num != -1) {
            total += num; //adds the previous number
            System.out.print("Enter a cost in dollars and cents (for example, 5.13): ");
            num = scan.nextDouble();
        }

            double totalTip =(tipPercent/100.0)*total; //total tip *unformated*
            double ttb = (1+(tipPercent/100.0))*total; //total bill with tip *unformated*
            String totalFormat = formatter.format(total);
            String totalTipFormat = formatter.format(totalTip);
            String totalBillTip = formatter.format(ttb);
            String costperPerson = formatter.format(total/groupNumber); //per person cost before tip
            String tipperPerson = formatter.format(totalTip/groupNumber); //tip per person
            String totalcostperPerson = formatter.format(ttb/groupNumber); //total cost per person

        System.out.println("------------------------------------");
        System.out.println("Number of People in group: " + groupNumber);
        System.out.println("Tip Percentage: " + tipPercent);
        System.out.println("Total Tip: " + totalTipFormat);
        System.out.println("Total Bill with Tip: "+totalBillTip);
        System.out.println("Per Person Cost Before Tip:  "+ costperPerson);
        System.out.println("Tip Per Person:  "+ tipperPerson);
        System.out.println("Total Cost Per Person: "+ totalcostperPerson);

            scan.close();
    }
}
