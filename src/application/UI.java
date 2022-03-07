package application;

import java.util.List;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class UI {
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

		System.out.println("\u001B[33m  a b c d e f g h\u001B[0m");
	}

	public static void printMatch(ChessMatch match, List<ChessPiece> capturedPieces) {

	}

	private static void printPiece(ChessPiece piece) {
		System.out.print(" ");

		if (piece == null) {
			System.out.print("-");
			return;
		}

		String color = piece.getColor() == Color.WHITE ? "\u001B[36m" : "\u001B[31m";
		String reset = "\u001B[0m";

		System.out.print(color + piece + reset);
	}
}
