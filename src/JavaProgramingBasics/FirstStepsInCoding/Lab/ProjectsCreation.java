package JavaProgramingBasics.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String architect = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());
        int neededHours = projects * 3;


        System.out.printf("The architect %s will need %d hours to complete %d project/s.",architect,neededHours,projects);



    }
}
