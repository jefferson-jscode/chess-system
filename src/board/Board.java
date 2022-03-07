package board;

public class Board {

	private int rows;
	private int columns;
	private Piece pieces[][];

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;

		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
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
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
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
