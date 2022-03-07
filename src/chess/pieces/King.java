package chess.pieces;

import board.Position;
import chess.ChessPiece;

public class King extends ChessPiece {
	public King(Position position) {
		super(position);
	}

	public String toString() {
		return "K";
	}
}
