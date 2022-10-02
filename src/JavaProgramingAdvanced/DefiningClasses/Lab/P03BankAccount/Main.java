package JavaProgramingAdvanced.DefiningClasses.Lab.P03BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        Map<Integer, BankAccount> bankAccounts = new HashMap<>();

        while (!input.equals("End")) {

            String[] data = input.split(" +");
            String command = data[0];

            if (command.equals("Create")) {
                BankAccount bankAccount = new BankAccount();
                bankAccounts.put(bankAccount.getId(), bankAccount);
                System.out.printf("Account ID%d created%n", bankAccount.getId());

            } else if (command.equals("Deposit")) {
                int id = Integer.parseInt(data[1]);
                double amount = Double.parseDouble(data[2]);
                if (isValidAccount(id, bankAccounts)) {
                    bankAccounts.get(id).deposit(amount);
                    System.out.printf("Deposited %d to ID%d%n", (int) amount, id);
                } else {
                    System.out.println("Account does not exist");
                }

            } else if (command.equals("GetInterest")) {
                int id = Integer.parseInt(data[1]);
                int year = Integer.parseInt(data[2]);
                if (isValidAccount(id, bankAccounts)) {
                    double interest = bankAccounts.get(id).getInterest(year);
                    System.out.printf("%.2f%n", interest);
                } else {
                    System.out.println("Account does not exist");
                }

            } else if (command.equals("SetInterest")) {
                double interestRate = Double.parseDouble(data[1]);
                BankAccount.setInterestRate(interestRate);

            }


            input = scanner.nextLine();
        }


    }

    private static boolean isValidAccount(int id, Map<Integer, BankAccount> bankAccounts) {
        return bankAccounts.containsKey(id);
    }
}
