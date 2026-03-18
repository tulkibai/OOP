package lab_2.problem_2;

public class Rook extends Piece {
    public Rook (int column_, int row_, Color color_) {
        super(column_, row_, color_);
    }

    @Override
    public boolean isLegalMove (Position b) {
        if (!Position.isValid((b))) return false;

        return (position.getColumn() == b.getColumn() && position.getRow() != b.getRow()) ||
                (position.getColumn() != b.getColumn() && position.getRow() == b.getRow());
    }
}
