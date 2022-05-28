package JavaProgramingFundamentals.DataTypesandVariables.Lab;

        import java.util.Scanner;

public class P09CenturiesToMinutes {
    public P09CenturiesToMinutes() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
        int years = centuries * 100;
        double days = (double)years * 365.2422D;
        double hours = days * 24.0D;
        double minutes = hours * 60.0D;
        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);
    }
}
