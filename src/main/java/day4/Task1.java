package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lengthArray = scanner.nextInt();
        int [] array = new int[lengthArray];
        for(int i = 0; i < lengthArray; i++){
            int elemArray = random.nextInt(10);
            array[i] = elemArray;
        }
        int countBolshe8 = 0;
        int countRavno1 = 0;
        int countChetnie = 0;
        int countNeChetnie = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] > 8)
                countBolshe8++;
            if (array[i] == 1)
                countRavno1++;
            if (array[i] % 2.0 == 0)
                countChetnie++;
            if (array[i] % 2 != 0)
                countNeChetnie++;
            sum += array[i];
        }
        System.out.println();
        System.out.println(array.length);
        System.out.println(countBolshe8);
        System.out.println(countRavno1);
        System.out.println(countChetnie);
        System.out.println(countNeChetnie);
        System.out.println(sum);
    }
}
