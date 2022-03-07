package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {

		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());

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
