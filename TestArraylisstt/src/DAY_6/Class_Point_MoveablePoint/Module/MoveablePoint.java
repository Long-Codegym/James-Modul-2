package DAY_6.Class_Point_MoveablePoint.Module;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] getSpeed = new float[2];
        getSpeed[0] = xSpeed;
        getSpeed[1] = ySpeed;
        return getSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + "Speed = (" + xSpeed + "," + ySpeed + ")";
    }

    public void move() {
        float currenX = super.getX();
        float currenY = super.getY();
        currenX += xSpeed;
        currenY += ySpeed;
        super.setX(currenX);
        super.setY(currenY);
    }
}
