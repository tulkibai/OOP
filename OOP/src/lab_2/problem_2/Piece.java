package lab_2.problem_2;

public abstract class Piece {
    protected Position position;
    protected Color color;

    public Piece (int column_, int row_, Color color_) {
        this.position = new Position (column_, row_);
        this.color = color_;
    }

    public abstract boolean isLegalMove (Position b);
}
