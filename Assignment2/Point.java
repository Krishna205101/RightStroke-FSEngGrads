public class Point {
    private int x, y;

    Point() {
        x = 5;
        y = 8;
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point(Point p) {
        x = p.x + 2;
        y = p.y + 2;
    }

    void display() {
        System.out.println("The values of x and y at different constructors: " + x + " " + y);
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(7, 3);
        Point p3 = new Point(p2);
        p1.display();
        p2.display();
        p3.display();
    }
}
