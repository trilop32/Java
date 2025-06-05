package l5;
class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Points {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        System.out.println("x= "+p1.x+" y= "+p1.y);
    }
}
