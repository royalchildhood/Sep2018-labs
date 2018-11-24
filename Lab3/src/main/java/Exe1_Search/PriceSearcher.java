package Exe1_Search;

import Exe1_Search.Util.BinarySearchUtil;
import Exe1_Search.Util.PriceUtil;
import Exe1_Search.Util.SortUtil;

import java.io.IOException;

public class PriceSearcher {


    public static void main(String[] args) throws IOException {
        int numOfLines = 100000;
        int numOfPricePerLine = 1000;
        //PriceUtil.generatePriceList(numOfLines, numOfPricePerLine, 10000, 999900, "resource/pricelist.txt");
        double[] toSearch = PriceUtil.loadPriceList("resource/pricelist.txt", numOfLines*numOfPricePerLine);


        long startTime = System.currentTimeMillis();
        normalSearch(8869.9D, toSearch);
        long endTime = System.currentTimeMillis();
        double second = endTime - startTime;
        System.out.println("Normal Search took: " + second + " milliseconds" + "\n");

        startTime = System.currentTimeMillis();
        findMax(toSearch);
        endTime = System.currentTimeMillis();
        second = endTime - startTime;
        System.out.println("Max Search took: " + second + " milliseconds"+ "\n");

        startTime = System.currentTimeMillis();
        // findRange(223.11, 1119.23, toSearch);
        endTime = System.currentTimeMillis();
        second = endTime - startTime;
        System.out.println("Range Search took: " + second + " milliseconds"+ "\n");

        startTime = System.currentTimeMillis();
        SortUtil.sort(toSearch, 0, toSearch.length - 1);
        endTime = System.currentTimeMillis();
        second = endTime - startTime;
        System.out.println("Sort took: " + second + " milliseconds"+ "\n");

        startTime = System.currentTimeMillis();
        BinarySearchUtil.findNumber(toSearch,8869.9D);
        endTime = System.currentTimeMillis();
        second = endTime - startTime;
        System.out.println("binary search took: " + second + " milliseconds"+ "\n");

    }

    public static void normalSearch(double target, double[] list) {
        for (int i = 0; i < list.length; i++) {
            if (target == list[i]) {
                System.out.println("find target: " + target);
                return;
            }
        }
        System.out.println("Did not find");
    }

    public static void findMax(double[] list) {
        double max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] >= max) {
                max = list[i];
            }
        }
        System.out.println("The max item of the given list is: " + max);
    }

    public static void findRange(double min, double max,  double[] list) {

    }
}
