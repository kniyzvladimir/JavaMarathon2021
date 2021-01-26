package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Antonov", 2020, 100, 7000000, "a1");
        Airplane a2 = new Airplane("Boing", 2019, 70, 3000000, "a2");

        Airplane.compareAirplanes(a1, a2);
    }
}

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;
    private String objName;

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public static void compareAirplanes(Airplane a1, Airplane a2){
        if (a1.length == a2.length){
            System.out.println("Длина самолётов равна");
        } else if (a1.length > a2.length){
            System.out.printf("Самолёт %s длинее чем самолёт %s", a1.objName, a2.objName);
        } else {
            System.out.printf("Самолёт %s длинее чем самолёт %s", a2.objName, a1.objName);
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void fillUp(int n) {
        this.fuel += n;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.printf("Изготовитель: %s , год выпуска: %d , длина: %d, вес: %d, количество топлива в баке: %d", producer, year, length, weight, fuel);
    }

    public Airplane(String producer, int year, int length, int weight, String objName) {
        this.producer = producer;
        this.year = year;
        this.weight = weight;
        this.length = length;
        this.objName = objName;
    }
}