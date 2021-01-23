package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int [] array = new int[10];
        int naibolshiy = 0;
        int naimenshiy = 1000;
        int kolNa_0 = 0;
        int sumNa_0 = 0;

        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            int elemArray = random.nextInt(1000);
            array[i] = elemArray;
        }

        for(int a:array){
            if(a > naibolshiy)
                naibolshiy = a;
            if(a < naimenshiy)
                naimenshiy = a;
            if (a % 10 == 0){
                kolNa_0++;
                sumNa_0 += a;
            }
        }
        System.out.println(naibolshiy);
        System.out.println(naimenshiy);
        System.out.println(kolNa_0);
        System.out.println(sumNa_0);
    }
}
