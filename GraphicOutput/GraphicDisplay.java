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

    //Передать пиксели фигуры на фрейм
    public void setPixels(Pixel[] pixels){
        for(Pixel pixel : pixels){
            setPixel(pixel);
        }
    }

    // Передать один пиксель на фрейм
    public void setPixel(Pixel pixel){
        int x = pixel.getX() + (imagePixels[0].length / 2);  // Центр сетки смещен
        int y = pixel.getY() + (imagePixels.length / 2);
        int red = pixel.getRed();
        int green = pixel.getGreen();
        int blue = pixel.getBlue();

        if((x >= 0 && x < imagePixels[0].length) && (y >= 0 && y < imagePixels.length)){
            imagePixels[y][x] = new int[] {red, green, blue};
        }
    }
}
