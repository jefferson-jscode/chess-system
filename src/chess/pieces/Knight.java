package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		int[][] moveOffsets = { { -2, +1 }, { -1, +2 }, { +1, +2 }, { +2, +1 }, { +2, -1 }, { +1, -2 }, { -1, -2 },
				{ -2, -1 } };

		boolean[][] allPossibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		for (int[] offset : moveOffsets) {
			p.setValues(position.getRow() + offset[0], position.getColumn() + offset[1]);
			if (getBoard().positionExists(p) && canMove(p)) {
				allPossibleMoves[p.getRow()][p.getColumn()] = true;
			}
		}

		return allPossibleMoves;
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public String toString() {
		return "N";
	}

}
