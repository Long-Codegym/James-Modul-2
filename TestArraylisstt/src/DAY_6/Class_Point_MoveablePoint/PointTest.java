package DAY_6.Class_Point_MoveablePoint;

import DAY_6.Class_Point_MoveablePoint.Module.Point;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        System.out.println(" Point mới: ");
        point = new Point(3.2f, 5.4f);
        System.out.println(point);
    }
}
