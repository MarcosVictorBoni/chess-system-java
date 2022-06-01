package aplication;

import Chess.ChessMach;
import boardgame.Piece;

public class Program {

	public static void main(String[] args) {
		
		
		ChessMach chessMach = new ChessMach();
		UI.printBoard(chessMach.getPieces());
		
		
		
	}

}
