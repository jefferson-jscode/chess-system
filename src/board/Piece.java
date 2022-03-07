package board;

public class Piece {
	protected Position position;
	
	public Piece(Position position) {
		this.position = position;
	}

	public boolean[][] possibleMoves() {
		return new boolean[8][8];
	}
	
	public boolean possibleMove(Position position) {
		return false;
	}
	
	public boolean isThereAnyPossibleMove() {
		return false;
	}

}
