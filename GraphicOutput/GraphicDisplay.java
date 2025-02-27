package org.example.GraphicOutput;

public class GraphicDisplay implements IGraphicDisplay{
    int [][] imagePixels;

    @Override
    public int[][] getImagePixels(int time) {
        return imagePixels;
    }
}
