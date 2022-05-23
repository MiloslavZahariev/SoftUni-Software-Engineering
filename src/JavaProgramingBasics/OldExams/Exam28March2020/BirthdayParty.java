package JavaProgramingBasics.OldExams.Exam28March2020;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cakePrice = rent * 0.2;
        double drinks = cakePrice * 0.55;
        double animatorPrice = rent / 3;

        System.out.println(cakePrice + drinks + animatorPrice + rent);
    }
}
