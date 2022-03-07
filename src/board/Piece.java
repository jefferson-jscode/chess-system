package board;

public abstract class Piece {
	protected Position position;
	protected Board board;

	public Piece(Position position) {
		this.position = position;
	}

	public Piece(Board board) {
		this.board = board;
	}

	public abstract boolean[][] possibleMoves();

	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}

	public boolean isThereAnyPossibleMove() {
		boolean[][] allPossibleMoves = possibleMoves();

		for (int i = 0; i < allPossibleMoves.length; i++) {
			for (int j = 0; j < allPossibleMoves[i].length; j++) {
				if (allPossibleMoves[i][j]) {
					return true;
				}
			}
		}

		return false;
	}

	protected Board getBoard() {
		return board;
	}

}
