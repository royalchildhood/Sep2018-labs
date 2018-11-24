package Lab1_search;

import java.io.*;

public class PriceUtil {

    public static double[] loadPriceList(String filePath, int arraySize) throws IOException {
        // The name of the file to open.
        String fileName = filePath;
        // This will reference one line at a time
        String line = null;
        double[] result = new double[arraySize+1];

        BufferedReader bufferedReader = null;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            bufferedReader = new BufferedReader(fileReader);

            int index = 0;
            while((line = bufferedReader.readLine()) != null) {
                String[] pricelist = line.split(" ");
                for (int i = 0; i < pricelist.length; i++) {
                    if (index < arraySize) {
                        result[index] = Double.valueOf(pricelist[i]);
                        index++;
                    }
                }
            }

            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch(IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        } finally {
            bufferedReader.close();
        }
        return result;
    }

    public static void generatePriceList(int lines, int number, int min, int max, String filePath) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

        for (int line = 1; line <= lines; line++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= number; i++) {
                int price = min + (int)(Math.random()*(max - min) + 1);
                double pricedigit = ((double)price) / 100;
                sb.append(pricedigit).append(" ");
                writer.write(sb.toString());
            }
            writer.write("\n");
        }
        writer.close();
    }
}
