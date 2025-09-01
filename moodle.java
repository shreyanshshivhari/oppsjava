package p1;
import java.util.Scanner;

class Shape {
    public void draw() {
        System.out.println("Drawing shape");
    }
    public void erase() {
        System.out.println("Erasing shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing circle");
    }
    public void erase() {
        System.out.println("Erasing circle");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing triangle");
    }
    public void erase() {
        System.out.println("Erasing triangle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing square");
    }
    public void erase() {
        System.out.println("Erasing square");
    }
}

public class moodle {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Triangle();
        Shape s3 = new Square();
        s1.draw();
        s1.erase();
        s2.draw();
        s2.erase();
        s3.draw();
        s3.erase();
    }
}
