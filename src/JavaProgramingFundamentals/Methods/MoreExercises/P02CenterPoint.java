package JavaProgramingFundamentals.Methods.MoreExercises;

import java.util.Scanner;

public class P02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        double result1 = getClosestPoint(x1,y1);
        double result2 = getClosestPoint(x2,y2);

        if(result1<= result2){
            System.out.printf("(%d, %d)",x1,y1);
        }else{
            System.out.printf("(%d, %d)",x2,y2);
        }
    }

    public static double getClosestPoint (int x, int y){
        double result = Math.pow(x,2) + Math.pow(y,2);
        result = Math.sqrt(result);

        return result;
    }
}
