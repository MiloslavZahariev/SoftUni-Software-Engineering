package JavaProgramingBasics.WhileLoop.MoreExersices;

import java.util.Scanner;

public class NumbersDividedBy3WithoutReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 3; i <= 99; i += 3) {
            System.out.println(i);

        }
    }
}
