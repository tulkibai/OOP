package lab_2.problem_2;

public class Position {
    private int row;
    private int column;

    public Position (int column_, int row_) {
        this.row = row_;
        this.column = column_;
    }

    public int getColumn () {
        return column;
    }
    public void setColumn (int column_) {
        this.column = column_;
    }

    public int getRow () {
        return row;
    }
    public void setRow (int row_) {
        this.row = row_;
    }

    public static boolean isValid (Position b) {
        return (b.getColumn() > 0 && b.getColumn() <= 8 && b.getRow() > 0 && b.getRow() <= 8);
    }
}
