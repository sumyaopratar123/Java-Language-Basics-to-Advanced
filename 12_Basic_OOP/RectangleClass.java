// Java beginner example
class Rectangle {
    int length, width;
    Rectangle(int length, int width) { this.length = length; this.width = width; }
    int area() { return length * width; }
}
public class RectangleClass {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        System.out.println(r.area());
    }
}
