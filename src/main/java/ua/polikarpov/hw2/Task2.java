package ua.polikarpov.hw2;

public class Task2 {

    public static void main(String[] args) {
        triangleArea(2,5,6,8,10,14);
    }

    public static double triangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double triangleArea = Math.abs(((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2);
        System.out.println("Area of the triangle equals: " + triangleArea);
        return (double) triangleArea;
    }
}

