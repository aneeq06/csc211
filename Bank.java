import java.util.Scanner;
import java.util.ArrayList;

public class Bank {
	
	static ArrayList<Double> moneyTrack = new ArrayList<>();
	
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	   
    double amount = 500.00;
    String action;

    System.out.println("Your current balance is $500.00" + "\nYou may deposit, withdraw, or say \"view\"" 
    + " to view a list of recent activity. What would you like to do?");
    do {
    action = scnr.next();
    
    if (action.equals("deposit")) {
        double depositAmount = deposit();
        amount += depositAmount;
        moneyTrack.add(depositAmount);
    }
    
    else if (action.equals("withdraw")) {
        double withdrawAmount = withdraw();
        amount -= withdrawAmount;
        moneyTrack.add(-withdrawAmount);
    }
    
    else if (action.equals("view")) {
        listInteractions();
    }

    else {
        System.out.println("Invalid action. Please enter \"deposit\", \"withdraw\", or \"view\".");
    }

    System.out.printf("Your new balance is $%,.2f\n",amount);
    System.out.println("What would you like to do now?\n");
    } while (true);

    }

    static double deposit() {
    Scanner scnr = new Scanner(System.in);
    
    System.out.println("How much would you like to deposit?");

    double deposit = scnr.nextDouble();
    return deposit;
    }
    
    static double withdraw() {
    Scanner scnr = new Scanner(System.in);
    
    System.out.println("How much would you like to withdraw?");
    
    double withdrawl = scnr.nextDouble();
    return withdrawl;
    }
    
    static void listInteractions() {

    System.out.println("Recent Transactions:");
    for (double transaction : moneyTrack) {
        if (transaction > 0) {
            System.out.printf("Deposit: $%,.2f\n", transaction);
        }

        else if (transaction < 0) {
            System.out.printf("Withdrawl: -$%,.2f\n", -transaction);
        }
    }
    System.out.println();
    }
}
