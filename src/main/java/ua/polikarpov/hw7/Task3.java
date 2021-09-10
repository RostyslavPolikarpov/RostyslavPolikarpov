package ua.polikarpov.hw7;

import java.util.Arrays;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(5, 7, -1);
        System.out.println("Length of vector1: " + vector1.vectorLength());
        Vector vector2 = new Vector(7, 2, 9);
        System.out.println("Length of vector2: " + vector2.vectorLength());
        System.out.println("Cosine between vectors: " + vector1.cosineBetweenVectors(vector2));
        System.out.println("Sum of vectors: " + vector1.sumOfVectors(vector2));
        System.out.println("Subtraction of vectors: " + vector1.subtractionOfVectors(vector2));
        System.out.println("Product of vectors: " + vector1.productOfVectors(vector2));
        System.out.println(Arrays.toString(getRandomVectors(5)));
    }

    // метод, принимающий число N и возвращающий массив случайных векторов
    public static Vector[] getRandomVectors(int size) {
        Vector[] vectors = new Vector[size];
        Random random = new Random();
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(random.nextInt(5), random.nextInt(5), random.nextInt(5));
        }
        return vectors;
    }
}

record Vector(double x, double y, double z) {

    // длина вектора
    public double vectorLength() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    private double scalarProduct(Vector vector) {
        return (this.x * vector.x + this.y * vector.y + this.z * vector.z);
    }

    // косинус угла между векторами
    public double cosineBetweenVectors(Vector vector) {
        return scalarProduct(vector) / (this.vectorLength() * vector.vectorLength());
    }

    // сумма векторов
    public Vector sumOfVectors(Vector vector) {
        return new Vector(this.x + vector.x, this.y + vector.y, this.z + vector.z);
    }

    // разность векторов
    public Vector subtractionOfVectors(Vector vector) {
        return new Vector(this.x - vector.x, this.y - vector.y, this.z - vector.z);
    }

    // векторное произведение
    public Vector productOfVectors(Vector vector) {
        return new Vector(this.y * vector.z - this.z * vector.y, this.z * vector.x - this.x * vector.z, this.x * vector.y - this.y * vector.x);
    }
}
