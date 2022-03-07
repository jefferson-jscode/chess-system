package chess;

import java.awt.Color;

import board.Board;

public class ChessMatch {
	private int turn;
	private Color currentPlayer;
	private boolean checkMate;
	private ChessPiece enPassantVulnerable;
	private ChessPiece promoted;
	
	private Board board;
	
	public ChessPiece[][] getPieces() {
		return null;
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
	
	
}
