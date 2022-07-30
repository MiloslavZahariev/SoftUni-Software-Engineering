package JavaProgramingFundamentals.ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([=/])(?<Destination>[A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destinationList = new ArrayList<>();

        int counter = 0;
        while (matcher.find()) {
           String destination = matcher.group("Destination");
            destinationList.add(destination);
            counter += destination.length();
        }

        System.out.printf("Destinations: %s%n",destinationList.toString().replace("[","").replace("]",""));
        System.out.printf("Travel Points: %d%n",counter);
    }
}
