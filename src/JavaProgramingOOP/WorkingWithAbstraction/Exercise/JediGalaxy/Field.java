package JavaProgramingOOP.WorkingWithAbstraction.Exercise.JediGalaxy;

public class Field {
    private long[][] starField;

    public Field(int rows, int cols) {
        this.starField = new long[rows][cols];
        fillInGalaxy(rows, cols, starField);
    }

    public void fillInGalaxy(int rows, int cols, long[][] galaxy) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                galaxy[row][col] = value++;
            }
        }
    }

    public boolean isInBounds(int row, int col) {
        return row >= 0 && col >= 0 && row < starField.length && col < starField[row].length;
    }

    public long getValue(int row, int col) {
        return this.starField[row][col];
    }

    public void setValue(int row, int col, int newValue) {
        starField[row][col] = newValue;
    }

    public int getColLength(){
        return starField[1].length;
    }

}
