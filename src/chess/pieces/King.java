package chess.pieces;

import board.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "K";
	}
}
