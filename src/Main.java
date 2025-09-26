import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------");
        System.out.println("| Note! Do not use any symbols when inputting data! (no $ or %) |");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Enter your Bill($): ");
        double billTotal = scan.nextDouble();
        scan.nextLine();
        System.out.println("Tip percent: ");
        int tipPercent = scan.nextInt();
        scan.nextLine();
        System.out.println("Number of people: ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.println();
        System.out.println("-----------------------------------------");
        double tipAmount = (double)((int)(((billTotal * ((double) tipPercent / 100)) * 100) + 0.5)) / 100;
        System.out.println("| Total tip amount: $" + tipAmount + "             |");
        System.out.println("-----------------------------------------");
        double totalWithTip = billTotal + tipAmount;
        System.out.println("| Total bill cost: $" + totalWithTip + "            |");
        System.out.println("-----------------------------------------");
        double tipPerson = (double)((int)(((tipAmount / numPeople) * 100) + 0.5)) / 100;
        double billPerson = (double)((int)(((totalWithTip / numPeople) * 100) + 0.5)) / 100;
        System.out.println("| Tip per person: $" + tipPerson + "                |");
        System.out.println("-----------------------------------------");
        System.out.println("| Total bill per person: $" + billPerson + "        |");
        System.out.println("-----------------------------------------");
    }
}