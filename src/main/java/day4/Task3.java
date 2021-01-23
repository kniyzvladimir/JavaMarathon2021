package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int elemArray = random.nextInt(50);
                array[i][j] = elemArray;
            }
        }
        int result = 0;
        int sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            int sum2 = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum2 += array[i][j];
            }
            if(sum2 > sum1){
                sum1 = sum2;
                result = i;
            }
        }
        System.out.println("Ответ: " + result);
    }
}

