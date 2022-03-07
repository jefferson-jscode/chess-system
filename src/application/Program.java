package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			UI.printBoard(chessMatch.getPieces());

			System.out.println();

			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);

			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}

//		System.out.println("Starting Chess Game");
//
//		Scanner sc = new Scanner(System.in);
//
//		ChessMatch chessMatch = new ChessMatch();
//		List<ChessPiece> captured = new ArrayList<>();
//
//		// draw, stale-mate
//		while (!chessMatch.isCheckMate()) {
//			// display board
//			UI.clearScreen();
//			UI.printBoard(chessMatch.getBoard());
//
//			System.out.println("Captured pieces:");
//			System.out.println("White: []");
//			System.out.println("Black: []");
//
//			System.out.println("Turn: 1");
//			System.out.println("Waiting player: WHITE");
//
//			// asks for new move from current player
//			System.out.println("Source:");
//			// input source position
//
//			System.out.println("Target:");
//			// input target position
//
//			break;
//		}
//
//		sc.close();
//
//		System.out.println("Finishing Chess Game");
	}

}
