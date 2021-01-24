package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike harleyDavidson = new Motorbike(1990, "black", "Softail Fat Boy");
        System.out.println("Год: " + harleyDavidson.getYear());
        System.out.println("Цвет: " + harleyDavidson.getColor());
        System.out.println("Модель: " + harleyDavidson.getModel());
    }
}
class Motorbike{
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
}