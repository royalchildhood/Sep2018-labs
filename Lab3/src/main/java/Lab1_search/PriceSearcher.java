package Lab1_search;

import java.io.IOException;

public class PriceSearcher {


    public static void main(String[] args) throws IOException {
        int numOfLines = 1;
        int numOfPricePerLine = 1;
        PriceUtil.generatePriceList(numOfLines, numOfPricePerLine, 10000, 999900, "resource/pricelist.txt");
        double[] toSearch = PriceUtil.loadPriceList("resource/pricelist.txt", numOfLines*numOfPricePerLine);

        long startTime = System.currentTimeMillis();
        normalSearch(1119.23, toSearch);
        long endTime = System.currentTimeMillis();
        double second = endTime - startTime;
        System.out.println("Normal Search took: " + second + " milliseconds");

        startTime = System.currentTimeMillis();
        // findMax(1119.23, toSearch);
        endTime = System.currentTimeMillis();
        second = endTime - startTime;
        System.out.println("Max Search took: " + second + " milliseconds");

        startTime = System.currentTimeMillis();
        // findRange(223.11, 1119.23, toSearch);
        endTime = System.currentTimeMillis();
        second = endTime - startTime;
        System.out.println("Range Search took: " + second + " milliseconds");
    }

    public static void normalSearch(double target, double[] list) {

    }

    public static void findMax(double target, double[] list) {

    }

    public static void findRange(double min, double max,  double[] list) {

    }
}
