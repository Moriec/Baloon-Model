package org.example.GraphicOutput;

public class Pixel {
    private int x, y, red, green, blue;

    public Pixel(int x, int blue, int green, int red, int y) {
        this.x = x;
        this.blue = blue;
        this.green = green;
        this.red = red;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
