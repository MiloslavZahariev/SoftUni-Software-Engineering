package JavaProgramingFundamentals.Lists.MoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine().split("\\.")[0]);

        List<Integer> qualityOfDrums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> initialQuality = new ArrayList<>();
        fillList(qualityOfDrums,initialQuality);

        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int powerOfHit = Integer.parseInt(input);

            for (int i = 0; i < qualityOfDrums.size(); i++) {

                int currentQuality = qualityOfDrums.get(i) - powerOfHit;
                if (currentQuality > 0) {
                    qualityOfDrums.set(i, currentQuality);
                } else {
                    if (savings - initialQuality.get(i) * 3 > 0) {
                        savings -= initialQuality.get(i) * 3;
                        qualityOfDrums.set(i, initialQuality.get(i));
                    } else {
                        qualityOfDrums.remove(i);
                        initialQuality.remove(i);
                        i -= 1;
                    }
                }
            }

            input = scanner.nextLine();
        }

        System.out.println(qualityOfDrums.toString().replaceAll("[\\[\\],]", ""));
        System.out.printf("Gabsy has %.2flv.", savings);
    }

    private static void fillList(List<Integer> qualityOfDrums, List<Integer> initialQuality) {

        initialQuality.addAll(qualityOfDrums);
    }
}
