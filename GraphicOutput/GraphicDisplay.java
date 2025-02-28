package org.example.GraphicOutput;

public class GraphicDisplay implements IGraphicDisplay{
    int [][][] imagePixels;

    public GraphicDisplay(int weightSize, int heightSize){
        imagePixels = new int[weightSize][heightSize][3];
    }

    @Override
    public int[][][] getImagePixels() {
        return imagePixels;
    }
}
