package chess;

import board.Piece;
import board.Position;

public class ChessPiece extends Piece {
	private Color color;
	private int moveCount;
	
	public ChessPiece(Position position) {
		super(position);
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		return false;
	}
	
	protected void increaseMoveCount() {
		moveCount++;
	}
	
	protected void decreaseMoveCount() {
		moveCount--;
	}

	public Color getColor() {
		return color;
	}

	public int getMoveCount() {
		return moveCount;
	}
	
}
