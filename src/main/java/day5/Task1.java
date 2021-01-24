package day5;

public class Task1 {
    public static void main(String[] args) {
        Car audi_2727 = new Car();
        audi_2727.setColor("black");
        audi_2727.setYear(2020);
        System.out.println("Цвет: " + audi_2727.getColor());
        System.out.println("Год: " + audi_2727.getYear());

    }
}
class Car{
    private int year;
    private String color;

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
}