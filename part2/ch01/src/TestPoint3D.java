public class TestPoint3D {
    public static void main(String[] args) {
        Point3D p3A = new Point3D(3, 1, 5);
        System.out.println("p3A: " + p3A);
        System.out.println("x: " + p3A.getX());
        System.out.println("y: " + p3A.getY());
        System.out.println("z: " + p3A.getZ());
        p3A.setX(-10);
        p3A.setY(-20);
        p3A.setZ(-30);
        System.out.println("p3A: " + p3A);

        Point3D p3B = new Point3D(30, 20, 10);
        System.out.println("p3B: " + p3B.toString());
        System.out.println("The distance between p3A and p3B is: " + Point3D.distance(p3A, p3B));

        Point3D.showInfo();
    }
}
