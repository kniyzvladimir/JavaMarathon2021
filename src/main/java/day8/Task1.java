package day8;

public class Task1 {
    public static void main(String[] args) {
        NumericString.nsRegular(20000, true);
        NumericString.nsStringBilder(20000, true);

    }
}

class NumericString{
    public static void nsRegular(int count, boolean timeOnly){
        String s = "";
        long star = System.nanoTime();
        for (int i = 0; i < count; i++ ){
            s = s + i + " ";
        }
        long finish = System.nanoTime();
        if(timeOnly == false){
            System.out.println(s); }
        System.out.println("Время выполнения String: " + (finish - star));
    }

    public static void nsStringBilder(int count, boolean timeOnly){
        StringBuilder sb = new StringBuilder();
        long star = System.nanoTime();
        for (int i = 0; i < count; i++ ){
            sb.append(i).append(" ");
        }
        long finish = System.nanoTime();
        if(timeOnly == false){
            System.out.println(sb.toString()); }
        System.out.println("Время выполнения StringBuilder: " + (finish - star));
    }
}