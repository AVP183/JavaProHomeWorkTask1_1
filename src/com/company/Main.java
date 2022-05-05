package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Часть 1

        int size = 10;

        // 1
        int[] arrayInt = new int[size];

        // 2
        int[] arrayIntValues = {1, 2, 3, 4, 5};

        // 3
        Random random = new Random();

        int[] arrayIntEmptyRandom = new int[arrayInt.length];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayIntEmptyRandom[i] = random.nextInt();
        }

        // 4
        double[] arrayDoubleValues = new double[arrayInt.length];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayDoubleValues[i] = random.nextDouble();
        }
        System.out.println(Arrays.toString(arrayDoubleValues));

        // 5
        int[] arrayBeforIncreasing = new int[arrayInt.length];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayBeforIncreasing[i] = random.nextInt();
        }
        int[] arrayIncresing = new int[arrayInt.length + 5];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayIncresing[i] = arrayBeforIncreasing[i];
        }

        //6
        int[] arrayMaxValueIndex = new int[12];
        for (int i = 0; i < arrayMaxValueIndex.length; i++) {
            arrayMaxValueIndex [i] = random.nextInt(-15, 15);
        }
        int maxValue = arrayMaxValueIndex[0];
        int maxValueIndex = 0;
        for (int i = 0; i < arrayMaxValueIndex.length; i++) {
            if (maxValue < arrayMaxValueIndex [i]){
                maxValue = arrayMaxValueIndex [i];
                maxValueIndex = i;
            }
        }
        System.out.printf("Максимальное значение элемента масива %d, индекс максимального значения " +
                "в массиве %d", maxValue, maxValueIndex);
        
    }
}
