// File: Point2D.java
public class Point2D {
    // Static variable:
    private static String info = "A 2D point represented by (x,y)-coordinates.";

    // Instance variables:
    private int x; // The x-coordinate
    private int y; // The y-coordinate

    // Constructor:
    public Point2D(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
    }

    // Instance methods:
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int xCoord) {
        x = xCoord;
    }

    public void setY(int yCoord) {
        y = yCoord;
    }

    public String toString() {
        return "(" + x + "," + y + ")"; // Format: (x,y)
    }

    // Static methods:
    public static double distance(Point2D p1, Point2D p2) {
        int xDiff = p1.x - p2.x;
        int yDiff = p1.y - p2.y;

        return Math.sqrt(xDiff * xDiff + yDiff + yDiff);
    }

    public static void showInfo() {
        System.out.println(info);
    }
}