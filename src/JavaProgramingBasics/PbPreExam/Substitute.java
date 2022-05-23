package JavaProgramingBasics.PbPreExam;

import java.util.Scanner;

public class Substitute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = K; i <= 8; i++) {
            boolean flag3 = false;
            for (int j = 9; j >= L; j--) {
                boolean flag2 = false;
                for (int k = M; k <= 8; k++) {
                    boolean flag = false;
                    for (int l = 9; l >= N; l--) {
                        if (i % 2 == 0 && k % 2 == 0 && j % 2 != 0 && l % 2 != 0) {
                            if (i == k && j == l) {
                                System.out.println("Cannot change the same player.");
                            } else {
                                System.out.printf("%d%d - %d%d%n", i, j, k, l);
                                counter++;
                                if (counter >= 6) {
                                    flag = true;
                                    break;
                                }
                            }

                        }
                    }
                    if (flag) {
                        flag2 = true;
                        break;
                    }
                }
                if (flag2) {
                    flag3 = true;
                    break;
                }

            }
            if (flag3) {
                break;
            }
        }
    }
}