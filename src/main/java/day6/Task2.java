package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Antonov", 2020, 100, 7000000);
        a1.setYear(2015);
        a1.setLength(80);
        a1.fillUp(1000);
        a1.fillUp(900);
        a1.info();

    }
}

class Airplane{
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setProducer(String producer){
        this.producer = producer;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setFuel(int fuel){
        this.fuel = fuel;
    }
    public void fillUp(int n){
        this.fuel += n;
    }
    public int getFuel(){
        return fuel;
    }
    public void info(){
        System.out.printf("Изготовитель: %s , год выпуска: %d , длина: %d, вес: %d, количество топлива в баке: %d", producer, year, length, weight, fuel);
    }

    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.weight = weight;
        this.length = length;
        this.setFuel(0);
    }
}