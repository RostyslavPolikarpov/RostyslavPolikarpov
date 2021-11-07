package ua.polikarpov.hw7.Task3;

import java.util.concurrent.ThreadLocalRandom;


record Vector(double x, double y, double z) {

    public static Vector random() {
        double x = ThreadLocalRandom.current().nextDouble(-1000, 1000);
        double y = ThreadLocalRandom.current().nextDouble(-1000, 1000);
        double z = ThreadLocalRandom.current().nextDouble(-1000, 1000);
        return new Vector(x, y, z);
    }

    public static Vector[] randomArray(int arrayLength) {
        Vector[] array = new Vector[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = Vector.random();
        }
        return array;
    }

    // длина вектора
    public double vectorLength() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double scalarProduct(Vector vector) {
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
