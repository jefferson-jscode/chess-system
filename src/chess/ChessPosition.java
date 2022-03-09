package chess;

import board.Position;

public class ChessPosition {

	private int row;
	private char column;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition! Valid valures are from a1 to h8.");
		}

		this.row = row;
		this.column = column;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	public static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	@Override
	public String toString() {
		return "" + column + row;
	}

}
