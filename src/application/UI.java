package application;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import chess.Color;

public class UI {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	public static ChessPosition readChessPosition(Scanner sc) {
		try {
			String s = sc.nextLine();
			char column = s.charAt(0);
			int row = Integer.parseInt(s.substring(1));

			return new ChessPosition(column, row);
		} catch (RuntimeException e) {
			throw new InputMismatchException("Error reading ChessPosition! Valid values are from a1 to h8.");
		}

	}

	public static void clearScreen() {
		try {
			Runtime.getRuntime().exec("clear");
		} catch (final Exception e) {
		}
	}

	public static void printBoard(ChessPiece[][] pieces) {
		for (int line = 0; line < 8; line++) {
			System.out.print("\u001B[33m" + (8 - line) + "\u001B[0m");

			for (int column = 0; column < 8; column++) {
				printPiece(pieces[line][column]);
			}

			System.out.println();
		}

		System.out.println(ANSI_YELLOW + "  a b c d e f g h" + ANSI_RESET);
	}

	public static void printMatch(ChessMatch match, List<ChessPiece> capturedPieces) {

	}

	private static void printPiece(ChessPiece piece) {
		System.out.print(" ");

		if (piece == null) {
			System.out.print("-");
			return;
		}

		String color = piece.getColor() == Color.WHITE ? ANSI_CYAN : ANSI_RED;

		System.out.print(color + piece + ANSI_RESET);
	}
}
