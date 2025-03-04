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
        for (int x = 0; x < imagePixels.length; x++) {
            for (int y = 0; y < imagePixels[0].length; y++) {
                int red = imagePixels[x][y][0];
                int green = imagePixels[x][y][1];
                int blue = imagePixels[x][y][2];
                int color = (red << 16) | (green << 8) | blue;
                try {
                    image.setRGB(x, y, color);
                }
                catch (Exception e){
                    System.out.println(y + " " + x);
                }
            }
        }

        label.repaint(); // Перерисовываем изображение
    }
}