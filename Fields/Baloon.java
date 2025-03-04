package org.example.Fields;

import org.example.GraphicOutput.Pixel;

public class Baloon {
    int color, radius, x, y, speedX, speedY;
    int red, green, blue;
    public Baloon(int radius, int x, int y, int speedX, int speedY, int color) {
        this.speedY = speedY;
        this.speedX = speedX;
        this.y = y;
        this.radius = radius;
        this.x = x;
        this.color = color;
    }

    public Baloon(int radius, int x, int y, int speedX, int speedY, int red, int green, int blue) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeedX() {
        return speedX;
    }

    public void setSpeedX(int speedX) {
        this.speedX = speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public void setSpeedY(int speedY) {
        this.speedY = speedY;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Pixel[] getPixels(){
        Pixel[] pixels = new Pixel[4 * (radius + 1) * (radius + 1)];

        int i = 0;
        for(int x1 = x - radius; x1 <= x + radius; x1++){
            for(int y1 = y - radius; y1 <= y + radius; y1++){
                if(Math.round(Math.abs(x1 - x) * Math.abs(x1 - x) + Math.abs(y1 - y) * Math.abs(y1 - y)) < radius * radius){
                    pixels[i] = new Pixel(x1, y1, red, green, blue);
                    i++;
                }
            }
        }

        return pixels;
    }
}
