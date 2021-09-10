package ua.polikarpov.hw6;

public class Task2 {
    // В ходе использования отладчика, мною была обнаружена ошибка во ВТОРОМ двойном цикле, где индекс 1 выходил за пределы
// длинны 1. Для того, что бы "уравновесить" условие в данном цикле, выражение (по моему мнению) следует изменить с
// for (int j = 0; i < triangle[i].length; j++) на for (int j = 0; i < triangle[i].length - 1; j++). После правки
// условия, ошибка исчезла. А так же, был слегка видоизменён алгоритм в ПЕРВОМ двойном цикле(как я понял, в
// консоль должен выводиться результат в виде "ёлочки").
    public static void main(String[] args) {
        int[][] triangle = new int[5][];

        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
        triangle[4] = new int[5];

        for (int i = 0; i < triangle.length; i++) {
            System.out.println();
            System.out.println(triangle[i].length + "! " + " i = " + i);
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i].length);
                triangle[i][j] = 0;
            }
        }

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; i < triangle[i].length - 1; j++) {
                System.out.print(triangle[i][j] + " ");
            }
        }

    }
}
