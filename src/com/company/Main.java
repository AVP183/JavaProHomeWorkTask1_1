package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Часть 1

        int size = 10;

        // 1.   Создайте массив интов без указания значений элементов при создании объекта.
        int[] arrayInt = new int[size];

        // 2.   Создайте массив интов с указанием значений элементов при создании объекта.
        int[] arrayIntValues = {1, 2, 3, 4, 5};

        // 3.   Создайте пустой массив интов. Заполните его любыми значениями.
        Random random = new Random();

        int[] arrayIntEmptyRandom = new int[arrayInt.length];
        for (int i = 0; i < arrayIntEmptyRandom.length; i++) {
            arrayIntEmptyRandom[i] = random.nextInt();
        }

        // 4.   Создайте пустой массив даблов. Заполните его любыми значениями и выведите в
        // консоль содержимое.
        double[] arrayDoubleValues = new double[arrayInt.length];
        for (int i = 0; i < arrayDoubleValues.length; i++) {
            arrayDoubleValues[i] = random.nextDouble();
        }
        System.out.println("Task 4");
        System.out.println(Arrays.toString(arrayDoubleValues));

        // 5.   Создайте пустой массив на 10 элементов. Заполните значения элементов.
        // Расширьте массив на 5 элементов.
        int[] arrayBeforIncreasing = new int[arrayInt.length];
        for (int i = 0; i < arrayBeforIncreasing.length; i++) {
            arrayBeforIncreasing[i] = random.nextInt();
        }
        int[] arrayIncresing = new int[arrayBeforIncreasing.length + 5];
        for (int i = 0; i < arrayBeforIncreasing.length; i++) {
            arrayIncresing[i] = arrayBeforIncreasing[i];
        }

        //6.   Создайте массив из 12 случайных целых чисел из отрезка `[-15;15]`.
        // Определите какой элемент является в этом массиве максимальным и сообщите индекс
        // его последнего вхождения в массив.
        int[] arrayMaxValueIndex = new int[12];
        for (int i = 0; i < arrayMaxValueIndex.length; i++) {
            arrayMaxValueIndex[i] = random.nextInt(-15, 15);
        }
        int maxValue = arrayMaxValueIndex[0];
        int maxValueIndex = 0;
        for (int i = 0; i < arrayMaxValueIndex.length; i++) {
            if (maxValue < arrayMaxValueIndex[i]) {
                maxValue = arrayMaxValueIndex[i];
                maxValueIndex = i;
            }
        }
        System.out.println("Task 6");
        System.out.printf("Максимальное значение элемента масива %d, индекс максимального значения " +
                "в массиве %d %n", maxValue, maxValueIndex);

        //7.   Создайте массив из 8 случайных целых чисел из отрезка `[1;10]`.
        // Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом
        // на ноль. Снова выведете массив на экран на отдельной строке.
        int[] arrayOddZerro = new int[8];
        for (int i = 0; i < arrayOddZerro.length; i++) {
            arrayOddZerro[i] = random.nextInt(1, 10);
        }
        System.out.println("Task 7");
        System.out.println(Arrays.toString(arrayOddZerro));
        for (int i = 1; i < arrayOddZerro.length; i = i + 2) {
            arrayOddZerro[i] = 0;
        }
        System.out.println(Arrays.toString(arrayOddZerro));

        //8.   Создайте массив из 4 случайных целых чисел из отрезка `[10;99]`.
        // Выведите его на экран в строку. Далее определите и выведите на экран сообщение о
        // том, является ли массив строго возрастающей последовательностью.
        System.out.println("Task 8");
        int[] arrayIncreasingSequences = new int[4];
        for (int i = 0; i < arrayIncreasingSequences.length; i++) {
            arrayIncreasingSequences[i] = random.nextInt(10, 99);
        }
        System.out.println(Arrays.toString(arrayIncreasingSequences));
        boolean flagIncreasingSequences = true;
        for (int i = 0; i < arrayIncreasingSequences.length; i++) {
            if (arrayIncreasingSequences[i] < arrayBeforIncreasing[i + 1]) {
                flagIncreasingSequences = true;
            } else {
                flagIncreasingSequences = false;
            }
        }
        if (flagIncreasingSequences == true) {
            System.out.println("Масив представлен возвростающей последовательностью");
        } else {
            System.out.println("Масив представлен не возвростающей последовательностью");
        }

        //9.   Создайте 2 массива из 5 случайных целых чисел из отрезка `[0;5]` каждый.
        // Выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое
        // элементов каждого массива и сообщите, для какого из массивов это значение оказалось
        // больше (либо сообщите, что их средние арифметические равны).
        System.out.println("Task 9");
        int avgSize = 5;
        int sumArrayFirst = 0;
        int sumArraySecond = 0;
        int[] arrayAvgFirst = new int[avgSize];
        int[] arrayAvgSecond = new int[avgSize];
        for (int i = 0; i < avgSize; i++) {
            arrayAvgFirst[i] = random.nextInt(0, 5);
            arrayAvgSecond[i] = random.nextInt(0, 5);
        }
        System.out.println(Arrays.toString(arrayAvgFirst));
        System.out.println(Arrays.toString(arrayAvgSecond));
        for (int i = 0; i < avgSize; i++) {
            sumArrayFirst += arrayAvgFirst[i];
            sumArraySecond += arrayAvgSecond[i];
        }
        System.out.println(sumArrayFirst);
        System.out.println(sumArraySecond);
        boolean flagAvg = false;
        if (sumArrayFirst > sumArraySecond) {
            System.out.println("Среднее арифметическое элементов 1-го массива больше среднего арифметического " +
                    "элементов 2-го массива");
        } else if (sumArrayFirst < sumArraySecond) {
            System.out.println("Среднее арифметическое элементов 1-го массива меньше среднего арифметического " +
                    "элементов 2-го массива");
        } else {
            System.out.println("Среднее арифметическое элементов 1-го и 2-го массивов равны");
        }

        //10.   Создать массив из 50 случайных целых чисел из отрезка `[0;1000]` и вывести его
        // на экран. Создать второй массив только из чётных элементов первого массива, если они
        // там есть, и вывести его на экран.
        int leftBorderValues = 0;
        int rightBorderValues = 1000;
        System.out.println("Task 10");
        int[] arrayFiftyElements = new int[50];
        for (int i = 0; i < arrayFiftyElements.length; i++) {
            arrayFiftyElements[i] = random.nextInt(leftBorderValues, rightBorderValues);
        }
        System.out.println(Arrays.toString(arrayFiftyElements));
        int[] arrayEvenElements = new int[arrayFiftyElements.length / 2];
        int evenElementarray = 0;
        for (int i = 0; i < arrayFiftyElements.length / 2; i++) {
            if (arrayFiftyElements.length / 2 >= 0) {
                arrayEvenElements[i] = arrayFiftyElements[evenElementarray];
                evenElementarray += 2;
            }
        }
        System.out.println(Arrays.toString(arrayEvenElements));

        //11.   Создайте массив a, заполните его. Создайте массив b, заполните его. Создайте
        // массив c, размер которого будет равен размер массива a + размер массива b. Заполнить
        // массив c следующим образом: взять элемент с массива a, следом элемент из массива b и т.д.
        System.out.println("Task 11");
        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt();
        }
        int[] c = new int[a.length + b.length];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int elementAtoC = 0;
        int elementBtoC = 0;
        for (int i = 0; i < c.length; i++) {
            if (i % 2 == 0 && elementAtoC <= a.length - 1) {
                c[i] = a[elementAtoC];
                elementAtoC++;
            } else if (i % 2 == 1 && elementBtoC <= b.length - 1) {
                c[i] = b[elementBtoC];
                elementBtoC++;
            }

        }
        System.out.println(Arrays.toString(c));
    }
}
