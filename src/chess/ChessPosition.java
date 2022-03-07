package chess;

import board.Position;

public class ChessPosition {
	private int row;
	private char column;
	
	public char getColumn() {
		return column;
	}

	public void setColumn(char column) {
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public ChessPosition() {
		
	}
	
	public ChessPosition(int row, char column) {
		this.row = row;
		this.column = column;
	}
	
	protected Position toPosition() {
		int columnNumber = (column - '0') - 97;
		return new Position(row, columnNumber);
	}
	
//	protected ChessPosition fromPosition(Position position) {
//		// TODO Throw ChessException if position is invalid
//		
//		char column = Character.forDigit(position.getColumn() + 97, 10);
//		this.row = position.getRow();
//		this.column = column;
//		return new ChessPosition(position.getRow(), column);
//	}
	
	
	public static ChessPosition fromPosition(Position position) {
		char column = Character.forDigit(position.getColumn() + 97, 10);
		return new ChessPosition(position.getRow(), column);
	}

}
