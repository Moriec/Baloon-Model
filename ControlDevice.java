package org.example;

import org.example.Fields.Baloon;
import org.example.GraphicOutput.GraphicDisplay;
import org.example.GraphicOutput.GraphicEngine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlDevice {

    private static final String nameMainFrame = "Main";
    private static final int weightSize = 1980, heightSize = 1080;
    private static final int delayTimer = 16; // 60 fps

    public static void main(String[] args){

        // Создаем графический движок
        GraphicEngine graphicEngine = new GraphicEngine(nameMainFrame, weightSize, heightSize);
        graphicEngine.startShowFrame();

        // Обновление кадров
        Timer timer = new Timer(delayTimer, new ActionListener() {
            int countChangeFrame = 1;
            @Override
            public void actionPerformed(ActionEvent e) {

                // GraphicDisplay для обьеденения разных компонентов в одну картинку
                GraphicDisplay graphicDisplay = new GraphicDisplay(weightSize, heightSize);


                Baloon baloon = new Baloon(8, 0, 0, 0, 0, 255, 255, 0);
                graphicDisplay.setPixels(baloon.getPixels());
                /*
                ...
                 */

                graphicEngine.updatePixels(graphicDisplay.getImagePixels()); //Отрисовываем актуальное изображение
                countChangeFrame++;

            }
        });
        timer.start();
    }
}
