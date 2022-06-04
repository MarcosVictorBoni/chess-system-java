package aplication;

import java.util.Scanner;

import Chess.ChessMach;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		ChessMach chessMach = new ChessMach();
		UI.printBoard(chessMach.getPieces());
		
		while(true) {
			UI.printBoard(chessMach.getPieces());
			System.out.println();
			System.out.print("Source ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.println("Target ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMach.performeChessMove(source, target);
		}
		
		
		
	}

}
