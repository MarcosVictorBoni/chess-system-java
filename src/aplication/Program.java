package aplication;

import Chess.ChessMach;

public class Program {

	public static void main(String[] args) {
		
		
		ChessMach chessMach = new ChessMach();
		UI.printBoard(chessMach.getPieces());
		
		
		
	}

}
