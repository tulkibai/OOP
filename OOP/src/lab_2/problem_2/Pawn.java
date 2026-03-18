package lab_2.problem_2;

public class Pawn extends Piece {
    public Pawn (int column_, int row_, Color color_) {
        super(column_, row_, color_);
    }

    @Override
    public boolean isLegalMove (Position b) {
        if (!Position.isValid((b))) return false;

        int dx = b.getColumn() - position.getColumn();
        int dy = b.getRow() - position.getRow();

        int dir = (color == Color.WHITE) ? 1 : -1;

        if (dx == 0 && dy == dir) {
            return true;
        }

        if (Math.abs(dx) == 1 && dy == dir) {
            return true;
        }

        return false;
    }
}