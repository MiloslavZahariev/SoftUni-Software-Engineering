package JavaProgramingAdvanced.MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class P08TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] chamber = new String[15][15];

        for (int r = 0; r < chamber.length; r++) {
            for (int c = 0; c < chamber[r].length; c++) {
                chamber[r][c] = "S";
            }
        }
        int heroRow = 7;
        int heroCol = 7;

        double heiganHealth = 3000000;
        int heroHealth = 18500;
        double damage = Double.parseDouble(scanner.nextLine());
        int eruptionDMG = 6000;
        int cloudDMG = 3500;

        String dieBySpell = "";

        boolean itIsPoisoned = false;
        while (heiganHealth > 0 && heroHealth > 0) {
            String[] input = scanner.nextLine().split(" ");
            String spell = input[0];
            int attackRow = Integer.parseInt(input[1]);
            int attackCol = Integer.parseInt(input[2]);

            heiganHealth -= damage;

            if (itIsPoisoned) {
                heroHealth -= cloudDMG;
                itIsPoisoned = false;
                if (heroHealth < 0) {
                    dieBySpell = "Plague Cloud";
                    break;
                }
            }
            if (heiganHealth < 0) {
                break;
            }

            switch (spell) {
                case "Cloud":
                    hittingChamber(attackRow, attackCol, chamber, "Cl");
                    break;
                case "Eruption":
                    hittingChamber(attackRow, attackCol, chamber, "Er");
                    break;
            }

            if (chamber[heroRow][heroCol].contains("Cl") ||
                    chamber[heroRow][heroCol].contains("Er")) {
                if (heroRow - 1 >= 0 && chamber[heroRow - 1][heroCol].equals("S")) {
                    heroRow -= 1;
                } else if (heroCol + 1 < 15 && chamber[heroRow][heroCol + 1].equals("S")) {
                    heroCol += 1;
                } else if (heroRow + 1 < 15 && chamber[heroRow + 1][heroCol].equals("S")) {
                    heroRow += 1;
                } else if (heroCol - 1 >= 0 && chamber[heroRow][heroCol - 1].equals("S")) {
                    heroCol -= 1;
                } else {


                    if (chamber[heroRow][heroCol].contains("Cl") && spell.equals("Cloud")) {
                        itIsPoisoned = true;
                        heroHealth -= cloudDMG;
                        if (heroHealth < 0) {
                            dieBySpell = "Plague Cloud";
                            break;
                        }
                    }
                    if (chamber[heroRow][heroCol].contains("Er")) {
                        heroHealth -= eruptionDMG;
                        if (heroHealth < 0) {
                            dieBySpell = "Eruption";
                            break;
                        }
                    }
                }
            }
            endOfTurn(chamber);

        }

        if (heiganHealth > 0) {
            System.out.printf("Heigan: %.2f%n", heiganHealth);
        } else {
            System.out.println("Heigan: Defeated!");
        }
        if (heroHealth > 0) {
            System.out.printf("Player: %d%n", heroHealth);
        } else {
            System.out.println("Player: Killed by " + dieBySpell);
        }

        System.out.println("Final position: " + heroRow + ", " + heroCol);

    }

    private static void endOfTurn(String[][] chamber) {
        for (int r = 0; r < chamber.length; r++) {
            for (int c = 0; c < chamber[r].length; c++) {
                if (chamber[r][c].contains("Cl")) {
                    chamber[r][c] = chamber[r][c].replaceFirst("Cl", "");
                }
                if (chamber[r][c].contains("Er")) {
                    chamber[r][c] = chamber[r][c].replaceFirst("Er", "");
                }

            }
        }
    }

    private static void hittingChamber(int attackRow, int attackCol, String[][] chamber, String spell) {
        if (isValidIndex(attackRow) && isValidIndex(attackCol)) {
            chamber[attackRow][attackCol] += spell;
        }
        if (isValidIndex(attackRow - 1) && isValidIndex(attackCol)) {
            chamber[attackRow - 1][attackCol] += spell;
        }
        if (isValidIndex(attackRow + 1) && isValidIndex(attackCol)) {
            chamber[attackRow + 1][attackCol] += spell;
        }
        if (isValidIndex(attackCol - 1) && isValidIndex(attackRow)) {
            chamber[attackRow][attackCol - 1] += spell;
        }
        if (isValidIndex(attackCol + 1) && isValidIndex(attackRow)) {
            chamber[attackRow][attackCol + 1] += spell;
        }
        if (isValidIndex(attackRow - 1) && isValidIndex(attackCol - 1)) {
            chamber[attackRow - 1][attackCol - 1] += spell;
        }
        if (isValidIndex(attackRow + 1) && isValidIndex(attackCol + 1)) {
            chamber[attackRow + 1][attackCol + 1] += spell;
        }
        if (isValidIndex(attackRow - 1) && isValidIndex(attackCol + 1)) {
            chamber[attackRow - 1][attackCol + 1] += spell;
        }
        if (isValidIndex(attackRow + 1) && isValidIndex(attackCol - 1)) {
            chamber[attackRow + 1][attackCol - 1] += spell;
        }

    }

    private static boolean isValidIndex(int index) {
        return index >= 0 && index < 15;
    }
}
