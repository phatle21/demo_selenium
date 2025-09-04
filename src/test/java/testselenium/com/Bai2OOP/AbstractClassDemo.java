package testselenium.com.Bai2OOP;

abstract class Shape {
    // abstract method - bat buoc lop con phai override
    abstract double area();

    // normal method - co san code dung chung
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
}

// Abstract class: có thể chứa code sẵn (method display()), các class con kế thừa dùng lại.

public class AbstractClassDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.display();
        System.out.println("Circle area = " + circle.area());

        Shape rectangle = new Rectangle(4, 5);
        rectangle.display();
        System.out.println("Rectangle area = " + rectangle.area());
    }
}
