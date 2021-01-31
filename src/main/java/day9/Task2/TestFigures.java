package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };
        System.out.printf("%.2f \n", calculateRedPerimeter(figures));
        System.out.printf("%.2f \n", calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures){
        double sumPerimeter = 0;
        for (Figure f: figures){
            if (f.getColor().equals("Red")){
                sumPerimeter += f.perimeter();
            }
        }
        return sumPerimeter;
    }

    public static double calculateRedArea(Figure[] figures){
        double sumArea = 0;
        for (Figure f: figures){
            if (f.getColor().equals("Red")){
                sumArea += f.area();
            }
        }
        return sumArea;
    }
}
abstract class Figure{
    private String color;
    Figure(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public abstract double area();
    public abstract double perimeter();

}
class Circle extends Figure{
    static final double PI = 3.14159265359;
    private double radius;
    public Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }
    public double area(){
        return PI * radius * radius;
    }

    public double perimeter(){
        return 2 * PI * radius;
    }
}

class Rectangle extends Figure{
    private double width;
    private double length;

    public Rectangle (double width, double length, String color){
        super(color);
        this.width = width;
        this.length = length;
    }
    public double area(){
        return width * length;
    }

    public double perimeter(){
        return (width + length) * 2;
    }
}

class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c, String color){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double area(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter(){
        return a + b + c;
    }
}