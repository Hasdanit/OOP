package Assignment1;

public class Point {
    private double x;
    private double y;
    Point(){

    }
    Point(double x, double y){
        this();
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point dest){
        return Math.sqrt(Math.pow((dest.x - this.x), 2) + Math.pow((dest.y - this.y), 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
