interface Shape {
    void CalculateArea();
}

class Square implements Shape {
    int a;
    public Square(int a){
        this.a=a;
    }

    public void CalculateArea() {
        System.out.println("The area of square is: " + (a * a));
    }

}

class Circle implements Shape {
    int a;

    public Circle(int a){
        this.a=a;
    }
    public void CalculateArea() {
        System.out.println("The area of circle is: " + (3.14 * a * a));
    }
}

class Triangle implements Shape {
    int a, b;

    public Triangle(int a,int b) {
        this.a = a;
        this.b = b;
    }

    public void CalculateArea() {
        System.out.println("The area of triangle is: " + (0.5 * a * b));
    }

}

public class Area {
    public static void main(String[] args) {
        Square s = new Square(4);
        Triangle t = new Triangle(4,3);
        Circle c = new Circle(10);
        s.CalculateArea();
        t.CalculateArea();
        c.CalculateArea();
    }
}