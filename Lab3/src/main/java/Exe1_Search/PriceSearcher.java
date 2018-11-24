package Exe1_Search;

import Exe1_Search.Util.BinarySearchUtil;
import Exe1_Search.Util.PriceUtil;
import Exe1_Search.Util.SortUtil;

import java.io.IOException;

public class PriceSearcher {


    public static void main(String[] args) throws IOException {
        /**=======================================================================
         * Initial
         * =======================================================================
         */
        int numOfLines = 100000;
        int numOfPricePerLine = 1000;
        //PriceUtil.generatePriceList(numOfLines, numOfPricePerLine, 10000, 999900, "resource/pricelist.txt");
        double[] toSearch = PriceUtil.loadPriceList("resource/pricelist.txt", numOfLines*numOfPricePerLine);

        /**=======================================================================
         * search target
         * =======================================================================
         */
        double searchTarget = 1234.01;
        double lowerRange = 1111;
        double upperRange = 9999;

        /**=======================================================================
         * Performance
         * =======================================================================
         */
        long startTime = System.currentTimeMillis();
        normalSearch(searchTarget, toSearch);
        long endTime = System.currentTimeMillis();
        double second = endTime - startTime;
        System.out.println("Normal Search took: " + second + " milliseconds to finish" + "\n");

        startTime = System.currentTimeMillis();
        findMax(toSearch);
        endTime = System.currentTimeMillis();
        second = endTime - startTime;
        System.out.println("Max Search took: " + second + " milliseconds to finish"+ "\n");

        startTime = System.currentTimeMillis();
        findRange(lowerRange, upperRange, toSearch);
        endTime = System.currentTimeMillis();
        second = endTime - startTime;
        System.out.println("Range Search took: " + second + " milliseconds  to finish"+ "\n");
    }

    public static void normalSearch(double target, double[] list) {
        // TODO
    }

    public static void findMax(double[] list) {
        // TODO
    }

    public static void findRange(double min, double max, double[] list) {
        // TODO
    }
}
