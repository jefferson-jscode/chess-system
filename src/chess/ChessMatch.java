package chess;

import board.Board;
import board.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private int turn;
	private Color currentPlayer;
	private boolean checkMate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()];

		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				matrix[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return matrix;
	}

	public boolean[][] possibleMoves(ChessPosition sourcePosition, ChessPosition targetPosition) {
		return null;
	}

	public ChessPosition performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		return null;
	}

	public ChessPiece replacePromotedPiece(String type) {
		return null;
	}

	public int getTurn() {
		return turn;
	}

	public Color getCurrentPlayer() {
		return currentPlayer;
	}

	public boolean isCheckMate() {
		return checkMate;
	}

	public Board getBoard() {
		return board;
	}

	private void initialSetup() {
		board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));

		board.placePiece(new Rook(board, Color.BLACK), new Position(0, 0));
		board.placePiece(new Rook(board, Color.BLACK), new Position(0, 7));

		board.placePiece(new Rook(board, Color.WHITE), new Position(7, 0));
		board.placePiece(new Rook(board, Color.WHITE), new Position(7, 7));
	}

}
