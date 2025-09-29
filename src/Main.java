import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------");
        System.out.println("| Note! Do not use any symbols when inputting data! (no $ or %) |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Enter your Bill($): ");                                        //getting user input
        double billTotal = scan.nextDouble();                                              //storing input as variable
        scan.nextLine();
        System.out.println("Tip percent: ");                                               //getting user input
        int tipPercent = scan.nextInt();                                                   //storing input as variable
        scan.nextLine();
        System.out.println("Number of people: ");                                          //getting user input
        int numPeople = scan.nextInt();                                                    //storing input as variable
        scan.nextLine();
        System.out.println();
        System.out.println("-----------------------------------------");
        double tipAmount = (double)((int)(((billTotal * ((double) tipPercent / 100)) * 100) + 0.5)) / 100;
        System.out.print("| Total tip amount: ");                                          //output
        System.out.printf("$%.2f\n", tipAmount);                                           //rounding value to 2 decimal places
        System.out.println("-----------------------------------------");
        double totalWithTip = (billTotal / 100 + tipAmount / 100) * 100;
        System.out.print("| Total bill cost: ");                                           //output
        System.out.printf("$%.2f\n", totalWithTip);                                        //rounding value to 2 decimal places
        System.out.println("-----------------------------------------");
        double tipPerson = (double)((int)(((tipAmount / numPeople) * 100) + 0.5)) / 100;
        double billPerson = (double)((int)(((totalWithTip / numPeople) * 100) + 0.5)) / 100;
        System.out.print("| Tip per person: ");                                            //output
        System.out.printf("$%.2f\n", tipPerson);                                           //rounding value to 2 decimal places
        System.out.println("-----------------------------------------");
        System.out.print("| Total bill per person: ");                                     //output
        System.out.printf("$%.2f\n", billPerson);                                          //rounding value to 2 decimal places
        System.out.println("-----------------------------------------");
    }
}
