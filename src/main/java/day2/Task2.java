package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if(a >= b){
            System.out.println("Некорректный ввод");
        }
        for (a +=1 ;a < b; a++){
            if (a % 5.d == 0 && a % 10.d != 0){
                System.out.print(a + " ");
            }
        }

    }
}
