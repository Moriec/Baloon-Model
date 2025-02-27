package org.example.GraphicOutput;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class GraphicEngine {
    private static BufferedImage image;
    private static JLabel label;
    private static int time = 0;

    public static void main() {
        // Создаем окно
        JFrame frame = new JFrame("Main");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920, 1080);

        // Создаем изображение
        image = new BufferedImage(1920, 1080, BufferedImage.TYPE_INT_RGB);
        label = new JLabel(new ImageIcon(image));
        frame.add(label);

        frame.setVisible(true);
    }

    public static void updatePixels() {
        IGraphicDisplay graphicDisplay = new GraphicDisplay();
        int [][] imagePixels = graphicDisplay.getImagePixels(time);
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                // Динамический паттерн (волны)
                int r = (int) (time % 255);
                int g = (int) (100);
                int b = (int) (0);
                int color = (r << 16) | (g << 8) | b;
                image.setRGB(x, y, color);
            }
        }
        label.repaint(); // Перерисовываем изображение
        time ++;
    }
}