package JavaProgramingFundamentals.DataTypesandVariables.Exercise;

        import java.util.Scanner;

public class P07WaterOverflow {
    public P07WaterOverflow() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterTankCapacity = 255;
        int n = Integer.parseInt(scanner.nextLine());
        int totalLiters = 0;

        for(int i = 0; i < n; ++i) {
            int litters = Integer.parseInt(scanner.nextLine());
            if (totalLiters + litters <= waterTankCapacity) {
                totalLiters += litters;
            } else {
                System.out.printf("Insufficient capacity!%n");
            }
        }

        System.out.println(totalLiters);
    }
}
