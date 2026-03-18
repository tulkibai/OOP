package lab_2.problem_2;

public class Queen extends Piece {
    public Queen (int column_, int row_, Color color_) {
        super(column_, row_, color_);
    }

    @Override
    public boolean isLegalMove (Position b) {
        if (!Position.isValid((b))) return false;

        int dx = Math.abs(b.getColumn() - position.getColumn());
        int dy = Math.abs(b.getRow() - position.getRow());

        boolean sameColumn = position.getColumn() == b.getColumn() && position.getRow() != b.getRow();
        boolean sameRow = position.getRow() == b.getRow() && position.getColumn() != b.getColumn();
        boolean diagonal = dx == dy && dx != 0;

        return sameColumn || sameRow || diagonal;
    }
}
