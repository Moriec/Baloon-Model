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
            if(pixel != null) {
                setPixel(pixel);
            }
        }
    }

    // Передать один пиксель на фрейм
    public void setPixel(Pixel pixel){
        int x = pixel.getX() + (imagePixels.length / 2);  // Центр сетки смещен
        int y = pixel.getY() + (imagePixels[0].length / 2);
        int red = pixel.getRed();
        int green = pixel.getGreen();
        int blue = pixel.getBlue();

        if((x >= 0 && x < imagePixels.length) && (y >= 0 && y < imagePixels[0].length)){
            imagePixels[x][y] = new int[] {red, green, blue};
        }
    }
}
