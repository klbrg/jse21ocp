public class Line {

    // Instance variables
    private Point2D endPoint1;
    private Point2D endPoint2;

    // Constructor:
    public Line(Point2D p1, Point2D p2) {
        endPoint1 = p1;
        endPoint2 = p2;
    }

    // Methods:
    public Point2D getEndpoint1() {
        return endPoint1;
    }

    public Point2D getEndpoint2() {
        return endPoint2;
    }

    public void setEndpoint1(Point2D p1) {
        endPoint1 = p1;
    }

    public void setEndpoint2(Point2D p2) {
        endPoint2 = p2;
    }

    public double length() {
        return Point2D.distance(endPoint1, endPoint2);
    }

    public String toString() {
        return "Line[" + endPoint1 + "," + endPoint2 + "]";
    }
}
