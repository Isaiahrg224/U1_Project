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
                // Code to get input values for the calculation

                
                double totalTip = Math.round(bill * tipPercentage * 100.0) / 100.0; 
                // calculation to find to total tip
                double tipPerPerson = Math.round((totalTip / numberOfPeople) * 100.0) / 100.0;
                //calculation to find the total tip per person
                double totalBill = bill + totalTip;
                // calculation to find the total bill including the tip 
                double totalBillPerPerson = Math.round((totalBill / numberOfPeople) * 100.0) / 100.0;
                // calculation to find the total each person has to pay including tip

                DecimalFormat formatter = new DecimalFormat("#,##0.00"); 
                //code to make outputs end in 2 decimal places even if blank, e.g. 17.20
                
                String formattedTotalTip = formatter.format(totalTip);
                String formattedTipPerPerson = formatter.format(tipPerPerson);
                String formattedTotalBill = formatter.format(totalBill);
                String formattedTotalBillPerPerson = formatter.format(totalBillPerPerson);
                // code that implements the two decimal places into the output.
                
                System.out.println();
                System.out.println("--------------------------------------");
                alignedBoxes("Total Tip Amount: $" + formattedTotalTip);
                System.out.println("--------------------------------------");
                alignedBoxes("Total Bill Cost: $" + formattedTotalBill);
                System.out.println("--------------------------------------");
                alignedBoxes("Tip Per Person: $" + formattedTipPerPerson);
                System.out.println("--------------------------------------");
                alignedBoxes("Total Bill Per Person: $" + formattedTotalBillPerPerson);
                System.out.println("--------------------------------------");
                // Code that actually prints out response


            }
            public static void alignedBoxes(String content) {
                int totalWidth = 36;
                int padding = totalWidth - 2 - content.length();
                if (padding < 0) padding = 0;
                System.out.printf("| %s%" + padding + "s |\n", content, "");
                //Code to print out each line inside aligned lines, e.g. |random words   |
            }
        }
