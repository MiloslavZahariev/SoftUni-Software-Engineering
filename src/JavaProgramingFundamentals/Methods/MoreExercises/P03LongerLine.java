package JavaProgramingFundamentals.Methods.MoreExercises;

import java.util.Scanner;

public class P03LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());
        int x3 = Integer.parseInt(scanner.nextLine());
        int y3 = Integer.parseInt(scanner.nextLine());
        int x4 = Integer.parseInt(scanner.nextLine());
        int y4 = Integer.parseInt(scanner.nextLine());

        double firstLineLength = getLongestLineBetweenToPoints(x1, y1, x2, y2);
        double secondLineLength = getLongestLineBetweenToPoints(x3, y3, x4, y4);

        if (firstLineLength >= secondLineLength) {
          double firstClosestPoint = getClosestPoint(x1,y1);
          double secondClosestPoint = getClosestPoint(x2,y2);
          if(firstClosestPoint<=secondClosestPoint){
              System.out.printf("(%d, %d)(%d, %d)",x1,y1,x2,y2);
          }else{
              System.out.printf("(%d, %d)(%d, %d)",x2,y2,x1,y1);
            }

        } else {
            double firstClosestPoint = getClosestPoint(x3,y3);
            double secondClosestPoint = getClosestPoint(x4,y4);
            if(firstClosestPoint<=secondClosestPoint){
                System.out.printf("(%d, %d)(%d, %d)",x3,y3,x4,y4);
            }else{
                System.out.printf("(%d, %d)(%d, %d)",x4,y4,x3,y3);
            }
        }
    }


    private static double getLongestLineBetweenToPoints(int x1, int y1, int x2, int y2) {
        int distanceX = x1 + (-x2);
        int distanceY = y1 + (-y2);

        double result = Math.pow(distanceX, 2) + Math.pow(distanceY, 2);
        result = Math.sqrt(result);
        return result;
    }

    public static double getClosestPoint (int x, int y){
        double result = Math.pow(x,2) + Math.pow(y,2);
        result = Math.sqrt(result);

        return result;
    }
}
