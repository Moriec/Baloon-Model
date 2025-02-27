package org.example;

import org.example.GraphicOutput.GraphicEngine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlDevice {

    public static void main(String[] args){
        GraphicEngine.main();
        Timer timer = new Timer(16, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GraphicEngine.updatePixels();

            }
        });
        timer.start();
    }
}
