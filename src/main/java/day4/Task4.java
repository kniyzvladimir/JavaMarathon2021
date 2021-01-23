package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int [] array = new int[100];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            int elemArray = random.nextInt(10000);
            array[i] = elemArray;
        }

        int sumRes = 0;
        int index = 0;
        for(int i = 0; i < array.length - 2; i++){
            int sumTeh = 0;
            sumTeh = array[i] + array[i+1] + array[i + 2];
            if(sumTeh > sumRes){
                sumRes = sumTeh;
                index = i;
            }
        }
        System.out.println(sumRes);
        System.out.println(index);

    }
}
