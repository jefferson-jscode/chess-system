package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	private ChessMatch chessMatch;

	public King(Board board, Color color, ChessMatch chessMatch) {
		super(board, color);
		this.chessMatch = chessMatch;
	}

	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] allPossibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// above
		p.setValues(position.getRow() - 1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)) {
			allPossibleMoves[p.getRow()][p.getColumn()] = true;
		}

		// below
		p.setValues(position.getRow() + 1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)) {
			allPossibleMoves[p.getRow()][p.getColumn()] = true;
		}

		// left
		p.setValues(position.getRow(), position.getColumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			allPossibleMoves[p.getRow()][p.getColumn()] = true;
		}

		// right
		p.setValues(position.getRow(), position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			allPossibleMoves[p.getRow()][p.getColumn()] = true;
		}

		// nw
		p.setValues(position.getRow() - 1, position.getColumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			allPossibleMoves[p.getRow()][p.getColumn()] = true;
		}

		// ne
		p.setValues(position.getRow() - 1, position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			allPossibleMoves[p.getRow()][p.getColumn()] = true;
		}

		// se
		p.setValues(position.getRow() + 1, position.getColumn() + 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			allPossibleMoves[p.getRow()][p.getColumn()] = true;
		}

		// sw
		p.setValues(position.getRow() + 1, position.getColumn() - 1);
		if (getBoard().positionExists(p) && canMove(p)) {
			allPossibleMoves[p.getRow()][p.getColumn()] = true;
		}

		// castling
		if (getMoveCount() == 0 && !chessMatch.getCheck()) {
			// king side
			Position kingRookPosition = new Position(position.getRow(), position.getColumn() + 3);
			if (testRookCastling(kingRookPosition)) {
				Position right1 = new Position(position.getRow(), position.getColumn() + 1);
				Position right2 = new Position(position.getRow(), position.getColumn() + 2);

				if (getBoard().piece(right1) == null && getBoard().piece(right2) == null) {
					// TODO Check if it's safe
					allPossibleMoves[right2.getRow()][right2.getColumn()] = true;
				}
			}

			// queen side
			Position queenRookPosition = new Position(position.getRow(), position.getColumn() - 4);
			if (testRookCastling(queenRookPosition)) {
				Position right1 = new Position(position.getRow(), position.getColumn() - 1);
				Position right2 = new Position(position.getRow(), position.getColumn() - 2);
				Position right3 = new Position(position.getRow(), position.getColumn() - 3);

				if (getBoard().piece(right1) == null && getBoard().piece(right2) == null
						&& getBoard().piece(right3) == null) {
					// TODO Check if it's safe
					allPossibleMoves[right3.getRow()][right3.getColumn()] = true;
				}
			}
		}

		return allPossibleMoves;
	}

	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	private boolean testRookCastling(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p instanceof Rook && p.getColor() == getColor() && p.getMoveCount() == 0;
	}
}
