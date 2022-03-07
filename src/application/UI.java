package application;

import java.util.List;

import board.Board;
import chess.ChessMatch;
import chess.ChessPiece;

public class UI {
	public static void clearScreen() {
		try {			
			Runtime.getRuntime().exec("clear");
		}
		catch (final Exception e) { }
	}
	
	public static void printBoard(Board board) {
		
	}
	
	public static void printMatch(ChessMatch match, List<ChessPiece> capturedPieces) {
		
	}
}
