
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println();


        System.out.print("Enter your Bill($): ");
        double bill = scan.nextDouble();

        System.out.print("Tip Percent(%): ");
        double tipPercentage = (scan.nextDouble()) / 100;

        System.out.print("Number of People: ");
        int numberOfPeople = scan.nextInt();


        double totalTip = Math.round(bill * tipPercentage * 100.0) / 100.0;
        double tipPerPerson = Math.round((totalTip / numberOfPeople) * 100.0) / 100.0;

        double totalBill = bill + totalTip;
        double totalBillPerPerson = Math.round((totalBill / numberOfPeople) * 100.0) / 100.0;


        DecimalFormat formatter = new DecimalFormat("#,##0.00");

        String formattedTotalTip = formatter.format(totalTip);
        String formattedTipPerPerson = formatter.format(tipPerPerson);
        String formattedTotalBill = formatter.format(totalBill);
        String formattedTotalBillPerPerson = formatter.format(totalBillPerPerson);


        System.out.println();
        System.out.println("--------------------------------------");
        printBoxLine("Total Tip Amount: $" + formattedTotalTip);
        System.out.println("--------------------------------------");
        printBoxLine("Total Bill Cost: $" + formattedTotalBill);
        System.out.println("--------------------------------------");
        printBoxLine("Tip Per Person: $" + formattedTipPerPerson);
        System.out.println("--------------------------------------");
        printBoxLine("Total Bill Per Person: $" + formattedTotalBillPerPerson);
        System.out.println("--------------------------------------");


    }
    public static void printBoxLine(String content) {
        int totalWidth = 36;
        int padding = totalWidth - 2 - content.length();
        if (padding < 0) padding = 0;
        System.out.printf("| %s%" + padding + "s |\n", content, "");
    }
}




