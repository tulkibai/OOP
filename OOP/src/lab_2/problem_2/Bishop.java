package lab_2.problem_2;

public class Bishop extends Piece {
    public Bishop(int column_, int row_, Color color_) {
        super(column_, row_, color_);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (!Position.isValid((b))) return false;

        int dx = Math.abs(b.getColumn() - position.getColumn());
        int dy = Math.abs(b.getRow() - position.getRow());

        return dx == dy && dx != 0;
    }
}
