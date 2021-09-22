//Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
//Найти максимальный отрицательный и минимальный положительный элементы массива.
// Поменять их местами.

import java.util.Random;

public class Base {
    public static void main(String[] args) {
        int[] myarray = new int[20];
        for (int i = 0; i < myarray.length; i++) {
            Random random = new Random();
            int x = random.nextInt(21);
            myarray[i] = x - 10;
        }
        int maxNegativeNum = myarray[0];
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] < 0 && myarray[i] < maxNegativeNum) maxNegativeNum = myarray[i];
            System.out.printf("%4d", myarray[i]);
        }
        System.out.println("Максимальное отрицательное число в массиве: " + maxNegativeNum);

        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] < 0) myarray[i] = 0;
        }
        int minPositiveNum = myarray[0];
        for (int i = 0; i < myarray.length; i++) {
            if (myarray[i] != 0) minPositiveNum = myarray[i];
            System.out.printf("%4d", myarray[i]);
            for (int j = 0; j < myarray.length; j++) {
                if (myarray[j] > 0 && myarray[j] < minPositiveNum) minPositiveNum = myarray[j];
            }
        }

        System.out.println("Минимальное положительное число в массиве: " + minPositiveNum);


    }
}
    

