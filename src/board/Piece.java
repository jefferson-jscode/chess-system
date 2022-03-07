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
		return false;
	}

	public boolean isThereAnyPossibleMove() {
		// TODO Check inner arrays
		return possibleMoves().length > 0;
	}

	protected Board getBoard() {
		return board;
	}

}
