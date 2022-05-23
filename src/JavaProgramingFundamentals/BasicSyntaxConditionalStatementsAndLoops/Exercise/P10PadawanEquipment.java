package JavaProgramingFundamentals.BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class P10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double sabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        int freeBelts = studentsCount / 6;
        double sabers = Math.ceil(studentsCount * 1.1);

        double totalPrice = (sabers * sabersPrice) + (studentsCount * robesPrice) + ((studentsCount - freeBelts) * beltsPrice);

        if ( budget >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        }else{
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(budget-totalPrice));
        }
    }
}
