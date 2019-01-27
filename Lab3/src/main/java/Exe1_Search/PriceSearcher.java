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
        int numOfLines = 50000;
        int numOfPricePerLine = 1000;

        // generate price
        // PriceUtil.generatePriceList(numOfLines, numOfPricePerLine, 10000, 999900, "resource/pricelist.txt");
        // load price in to array
        double[] toSearch = PriceUtil.loadPriceList("resource/pricelist.txt", numOfLines*numOfPricePerLine);

        /**=======================================================================
         * search target
         * =======================================================================
         */
        double searchTarget = 1234.01;
        double lowerRange = 5555;
        double upperRange = 6000;

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

        startTime = System.currentTimeMillis();
        SortUtil.sort(toSearch, 0, toSearch.length - 1);
        endTime = System.currentTimeMillis();
        second = endTime - startTime;
        System.out.println("Sorting took: " + second + " milliseconds  to finish"+ "\n");


        startTime = System.currentTimeMillis();
        BinarySearchUtil.findNumber(toSearch, searchTarget);
        endTime = System.currentTimeMillis();
        second = endTime - startTime;
        System.out.println("binary search took: " + second + " milliseconds  to finish"+ "\n");
    }

    public static void normalSearch(double target, double[] list) {
        for (int i = 0; i < list.length; i++) {
            if (target == list[i]) {
                System.out.println(target);
                return;
            }
        }

        System.out.println("not find");
    }

    public static void findMax(double[] list) {
        double max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }

        System.out.println(max);
    }

    public static void findRange(double min, double max, double[] list) {
        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] >= min && list[i] <= max ) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
