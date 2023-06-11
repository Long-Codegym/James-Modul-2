package DAY_6.Class_Point_MoveablePoint;

import DAY_6.Class_Point_MoveablePoint.Module.MoveablePoint;

public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        System.out.println(" tọa độ và tốc độ mới là: ");
        moveablePoint = new MoveablePoint(2.1f, 3.4f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(1.1f, 2.4f,5.6f,7.1f);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
