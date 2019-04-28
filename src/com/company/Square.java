package com.company;
class Square extends Rectangle {
    private double side;

    public Square(String color, boolean filled, double width, double length, double side){
        super(color, filled, width, length);

        if (side < 0.0) {
            throw new IllegalArgumentException("Side must be >= 0.0");
        }

        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }


    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}