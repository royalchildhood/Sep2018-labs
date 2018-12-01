package Exe3_matrix;

import java.util.ArrayList;

public class TicTacToe {

	public static void main(String[] args) {
		String[][] inputBoard1 =
				{{"X","X","O"},
				 {"O","X","O"},
				 {"O","O","X"},};

		String[][] inputBoard2 =
				{{"O","X","O"},
				 {"O","X","X"},
				 {"O","O","X"},};

		String[][] inputBoard3 =
				{{"O","X","O"},
				 {"X","O","X"},
				 {"O","O","X"},};

		validBoard(inputBoard1);
		validBoard(inputBoard2);
		validBoard(inputBoard3);
	}


	public static void validBoard(String[][] board) {
		// TODO
	}
}
