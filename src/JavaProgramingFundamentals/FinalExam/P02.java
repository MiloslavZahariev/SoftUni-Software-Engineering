package JavaProgramingFundamentals.FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfInputs = Integer.parseInt(scanner.nextLine());

        String regex = "([\\|])(?<name>[A-Z]{4,})\\1[:]([#])(?<title>[A-Za-z]+ [A-Za-z]+)\\3";
        Pattern pattern = Pattern.compile(regex);


        for (int i = 0; i < numberOfInputs; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String bossName = matcher.group("name");
                String title = matcher.group("title");

                System.out.printf("%s, The %s%n",bossName,title);
                System.out.printf(">> Strength: %d%n",bossName.length());
                System.out.printf(">> Armor: %d%n",title.length());
            }else{
                System.out.println("Access denied!");
            }


        }

    }
}
