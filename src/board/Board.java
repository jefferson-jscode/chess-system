package board;

public class Board {

	private int rows;
	private int columns;
	private Piece pieces[][];

	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column!");
		}

		this.rows = rows;
		this.columns = columns;

		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		// TODO Check if there in this position
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board!");
		}

		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece in this position!");
		}

		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board!");
		}

		if (piece(position) == null) {
			return null;
		}

		Piece removedPiece = pieces[position.getRow()][position.getColumn()];
		removedPiece.position = null;
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
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board!");
		}

		return pieces[position.getRow()][position.getColumn()] != null;
	}

}
