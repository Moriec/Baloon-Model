package org.example.GraphicOutput;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class GraphicEngine {
    private BufferedImage image;
    private JLabel label;
    private int time;

    private int wightSize, heightSize;
    private String nameFrame;

    public GraphicEngine(String nameFrame, int wightSize, int heightSize){
        this.nameFrame = nameFrame;
        this.wightSize = wightSize;
        this.heightSize = heightSize;
    }

    // Задать начальные параметры фрейма и показать его на экране
    public void startShowFrame() {
        // Создаем окно
        JFrame frame = new JFrame(nameFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(wightSize, heightSize);

        // Создаем изображение
        image = new BufferedImage(wightSize, heightSize, BufferedImage.TYPE_INT_RGB);
        label = new JLabel(new ImageIcon(image));
        frame.add(label);

        frame.setVisible(true);
    }

    // Обновить кадр
    public void updatePixels(int [][][] imagePixels) {

        // Проставляем пиксели
        for (int y = 0; y < imagePixels.length; y++) {
            for (int x = 0; x < imagePixels[0].length; x++) {
                int red = imagePixels[y][x][0];
                int green = imagePixels[y][x][1];
                int blue = imagePixels[y][x][2];
                int color = (red << 16) | (green << 8) | blue;
                image.setRGB(x, y, color);
            }
        }

        label.repaint(); // Перерисовываем изображение
    }
}