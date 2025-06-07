// File: Point2D.java
public class Point2D {
    // Class Member Decalartions

    // Fields:
    private int x; // The x-coordinate
    private int y; // The y-coordinate

    // Constructor:
    public Point2D(int xCoord, int yCoord) {
        x = xCoord;
        y = yCoord;
    }

    // Methods:
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
}