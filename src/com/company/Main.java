package com.company;

public abstract class Main {
    private String color;
    private boolean filled;

    public Main(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter() ;

    @Override
    public String toString() {
        return "Main{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}


