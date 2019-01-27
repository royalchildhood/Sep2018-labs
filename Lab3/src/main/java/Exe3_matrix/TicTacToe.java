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
				 {"X","O","X"},};

		validBoard(inputBoard1);
		validBoard(inputBoard2);
		validBoard(inputBoard3);
	}


	public static void validBoard(String[][] board) {
		// horizontal check
		for (int row = 0; row < board.length; row++) {
			boolean win = true;

			String check = board[row][1];

			if (check != board[row][0] || check != board[row][2])
				win = false;

			if (win) {
				System.out.println(check + " win");
				return;
			}
		}

		// Vertical check
		for (int column = 0; column < board.length; column++) {
			boolean win = true;
			String check = board[1][column];
			if (check != board[0][column] || check != board[2][column])
				win = false;

			if (win) {
				System.out.println(check + " win");
				return;
			}
		}

		// cross check
		String check = board[1][1];
		if ((check == board[0][0] && check == board[2][2]) || (check == board[2][0] && check == board[0][2])) {
			System.out.println(check + " win");
			return;
		}


		System.out.println("tie");
	}
}
