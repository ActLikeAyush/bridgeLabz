
abstract class Shape {
    abstract double area();

    abstract double perimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 3.14* radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Rectangle extends Shape {
     double length; 
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double base;
    double height; 
    double  A;
    double  B;
    double C;

    Triangle(double base, double height, double A, double B, double C) {
        this.base = base;
        this.height = height;
        this.A = A;
        this.B = B;
        this.C = C;
    }

    @Override
    double area() {
        return (base * height) / 2;
    }

    @Override
    double perimeter() {
        return A + B + C;
    }
}


public class Geometry {
    public static void main(String[] args) {


        Circle c = new Circle(2.5);
        System.out.println("Circle Area: " + c.area());
        System.out.println("Circle Perimeter: " + c.perimeter());
        Rectangle r = new Rectangle(4, 5);
        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Rectangle Perimeter: " + r.perimeter());
        Triangle t = new Triangle(3, 4, 3, 4, 5);
        System.out.println("Triangle Area: " + t.area());
        System.out.println("Triangle Perimeter: " + t.perimeter());
    }
}
