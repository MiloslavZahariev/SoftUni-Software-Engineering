package JavaProgramingBasics.OldExams.DrawingFiguresWithLoops;

public class RectangleOf10x10Stars {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            if (i != 0) {
                System.out.println();
            }
            for (int j = 0; j < 10; j++) {
                System.out.print("*");

            }

        }
    }
}
