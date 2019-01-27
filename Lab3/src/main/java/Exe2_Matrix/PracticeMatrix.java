package Exe2_Matrix;

public class PracticeMatrix {


    public static int[][] createMatrix() {
        int[][] matrix = new int[3][3];
        int value = 1;

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                matrix[y][x] = value;
                value++;
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] martix) {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print(martix[y][x] + " ");
            }
            System.out.println();
        }
    }

    public static void flipMartix(int[][] martix) {

        for (int y = 0; y < martix.length; y++) {
            for (int x = 0; x <  martix.length/ 2; x++) {
                // keep swapping the head and tail value
                int temp = martix[y][x];// save the value for the later swap

                // swap
                martix[y][x] = martix[y][martix.length - x - 1];
                martix[y][martix.length - x - 1] = temp;
            }
            // go to next row, y does not really matter in this operation
        }


        printMatrix(martix);
    }

    public static void flipMartixUpSizeDown(int[][] martix) {
        // TODO
    }

    public static void flipMartixSysmertic(int[][] martix) {
        for (int row = 0; row < martix.length; row++) {
            for (int column = 0; column <  martix.length/2; column++) {

                int temp = martix[row][column];
                // swap
                martix[row][column] = martix[column][row];
                martix[column][row] = temp;
            }
        }

        for (int row = 0; row < martix.length; row++) {
            for (int column = 0; column <  martix.length; column++) {

                System.out.print(martix[row][column] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] inputBoard1 =
                       {{1,2,3},
                        {4,5,6},
                        {7,8,9},};
        flipMartixSysmertic(inputBoard1);
    }
}
