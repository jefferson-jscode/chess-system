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
		boolean[][] allPossibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return allPossibleMoves;
	}

	@Override
	public String toString() {
		return "K";
	}
}
