//Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
//Найти максимальный отрицательный и минимальный положительный элементы массива.
// Поменять их местами.

import java.util.Random;

public class Base {
    public static void main(String[] args) {
        int[] myarray = new int[20];
        System.out.println("Массив со случайными числами:");
        for (int i = 0; i < myarray.length; i++) {
            Random random = new Random();
            int x = random.nextInt(21);
            myarray[i] = x - 10;
            System.out.printf("%4d", myarray[i]);
        }
        int[] negativearray = new int[20];
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] > 0) negativearray[i] = 0;
            else negativearray[i] = myarray[i];
        }
        int maxNegativeNum = negativearray[0];
        for (int i = 0; i < negativearray.length; i++) {
            if (negativearray[i] != 0) maxNegativeNum = negativearray[i];
            for (int j = 0; j < negativearray.length; j++) {
                if (negativearray[j] < 0 && negativearray[j] > maxNegativeNum) maxNegativeNum = negativearray[j];
            }
        }
        System.out.printf("%nМаксимальное отрицательное число в массиве: %s%n", maxNegativeNum);
        int[] positivearray = new int[20];
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] < 0) positivearray[i] = 0;
            else positivearray[i] = myarray[i];
        }
        int minPositiveNum = positivearray[0];
        for (int i = 0; i < positivearray.length; i++) {
            if (positivearray[i] != 0) minPositiveNum = positivearray[i];
            for (int j = 0; j < positivearray.length; j++) {
                if (positivearray[j] > 0 && positivearray[j] < minPositiveNum) minPositiveNum = positivearray[j];
            }
        }
        System.out.printf("Минимальное положительное число в массиве: %s%n", minPositiveNum);
        System.out.println("Массив, где поменяли местами минимальный положительный элементс с максимально отрицательным:");
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] == maxNegativeNum) myarray[i] = minPositiveNum;
            else if (myarray[i] == minPositiveNum) myarray[i] = maxNegativeNum;
            System.out.printf("%4d", myarray[i]);
        }



    }
}
    

