package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2000);
        car1.info();
        System.out.println(car1.yearDifference(1990));
    }
}

class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int yearDifference(int inputYear) {
        int difference;
        if (year > inputYear) {
            difference = year - inputYear;
        } else {
            difference = inputYear - year;
        }

        return difference;

    }
    public void info(){
        System.out.println("Это мотоцикл");
    }
}

class Car{
    private int year;
    private String color;
    private String model;

    public void setYear(int carYear){
        year = carYear;
    }
    public int getYear (){
        return year;
    }
    public void setColor(String carColor){
        color = carColor;
    }
    public String getColor (){
        return color;
    }
    public void setModel(String carModel){
        color = carModel;
    }
    public String getModel (){
        return model;
    }
    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear){
        int difference;
        if (year > inputYear){
            difference = year - inputYear;
        }else {
            difference = inputYear - year;
        }
        return difference;
    }
}