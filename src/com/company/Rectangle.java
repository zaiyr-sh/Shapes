package com.company;
class Rectangle extends Main {
    private double width;
    private double length;

    public Rectangle(String color, boolean filled, double width, double length){
        super(color, filled);

        if (width < 0.0) {
            throw new IllegalArgumentException("Width must be >= 0.0");
        }

        if (length < 0.0) {
            throw new IllegalArgumentException("Length must be >= 0.0");
        }

        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}