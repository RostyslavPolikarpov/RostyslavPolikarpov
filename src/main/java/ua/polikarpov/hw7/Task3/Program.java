package ua.polikarpov.hw7.Task3;

public class Program {
    public static void main(String[] args) {
        Vector vector = new Vector(10.0, 5.0, 7.0);
        System.out.println("Length of vector: " + vector.vectorLength());
        System.out.println("Scalar product of vectors: " + vector.scalarProduct(vector));
        System.out.println("Cosine between vectors: " + vector.cosineBetweenVectors(vector));
        System.out.println("Sum of vectors: " + vector.sumOfVectors(vector));
        System.out.println("Subtraction of vectors: " + vector.subtractionOfVectors(vector));
        System.out.println("Product of vectors: " + vector.productOfVectors(vector));
    }
}
