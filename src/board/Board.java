package board;

public class Board {
	private int rows;
	private int columns;
	private Piece pieces[][];

	public Board() {
		rows = 8;
		columns = 8;

		pieces = new Piece[rows][columns];
	}
	
	public Piece piece(int row, int column) {
		// TODO Check if there in this position
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		// TODO Check if there in this position
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		
	}
	
	public Piece removePiece(Position position) {
		Piece removedPiece = pieces[position.getRow()][position.getColumn()];
		pieces[position.getRow()][position.getColumn()] = null;
		return removedPiece;
	}
	
	public boolean positionExists(Position position) {
		if (position.getRow() < 0 || position.getRow() > rows) {
			return false;
		}
		
		if (position.getColumn() < 0 || position.getColumn() > columns) {
			return false;
		}
		
		return true;
	}
	
	public boolean thereIsAPiece(Position position) {
		return pieces[position.getRow()][position.getColumn()] != null;
	}

}
