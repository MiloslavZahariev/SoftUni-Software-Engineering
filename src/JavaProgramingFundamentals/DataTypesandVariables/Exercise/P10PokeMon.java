package JavaProgramingFundamentals.DataTypesandVariables.Exercise;

        import java.util.Scanner;

public class P10PokeMon {
    public P10PokeMon() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        int startPower = power;
        int pokeCounter = 0;

        while(power >= distance) {
            power -= distance;
            ++pokeCounter;
            if ((double)power == (double)startPower * 0.5D && exhaustionFactor > 0) {
                power /= exhaustionFactor;
            }
        }

        System.out.println(power);
        System.out.println(pokeCounter);
    }
}
