package JavaProgramingBasics.ForLoop.Exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String browserTab = scanner.nextLine();
            if (browserTab.equals("Facebook")) {
                salary -= 150;
            } else if (browserTab.equals("Instagram")) {
                salary -= 100;
            } else if (browserTab.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.printf("%.0f", salary);
        }
    }
}
