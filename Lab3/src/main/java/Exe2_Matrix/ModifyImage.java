package Exe2_Matrix;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class ModifyImage {

    public static void main(String[] args) {
        // input path
        String targetPath = "resource/overwatch.jpg";
        // output path
        String outputPath = "resource/reverse_overwatch.jpg";

        BufferedImage targetBuffer = null;
        try {
            targetBuffer = ImageIO.read(new File(targetPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeImage(targetBuffer, outputPath);
    }


    /**
     * Exercises
     */
    public static void modifyImagePractice(BufferedImage copy, ImageRGB[] rgbValues) {

    }

    /**
     * Helper Functions
     */
    private static void writeImage(BufferedImage target, String outputPath) {
        BufferedImage copy = copyImage(target);
        ImageRGB[] rgbValues = new ImageRGB[copy.getWidth() * copy.getHeight()];
        int index = 0;
        for (int i = 0; i < copy.getWidth(); i++) {
            for (int j = 0; j < copy.getHeight(); j++) {
                Color color = new Color(copy.getRGB(i, j));
                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();
                rgbValues[index] = new ImageRGB(red, blue, green);
                index++;
            }
        }

        try {
            modifyImagePractice(copy, rgbValues);
            OutputStream out = new FileOutputStream(outputPath);
            ImageIO.write(copy, "jpg", out);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static BufferedImage copyImage(BufferedImage source) {
        BufferedImage image = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
        Graphics g = image.getGraphics();
        g.drawImage(source, 0, 0, null);
        g.dispose();
        return image;
    }
}
