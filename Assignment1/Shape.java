package Assignment1;

import java.util.ArrayList;

public class Shape {
    ArrayList<Point> Points = new ArrayList<>();

    Shape() {

    }

    Shape(ArrayList<Point> points) {
        this();
        Points = points;
    }

    public void addPoint(Point point){
        Points.add(point);
    }


    public double calculatePerimeter(){
        double Perimeter = 0;
        Perimeter += Points.get(Points.size()-1).distanceTo(Points.get(0));
        for(int i = 0; i < Points.size() - 1; i++){
            Perimeter += Points.get(i).distanceTo(Points.get(i+1));
        }
        return Perimeter;
    }
    public double getAvarageSide(){
        double Avarage = calculatePerimeter()/ Points.size();
        return Avarage;
    }
    public double getLongestSide(){
        double TheLongestSide = Points.get(Points.size()-1).distanceTo(Points.get(0));
        for(int i = 0; i < Points.size()-1; i++){
            if(TheLongestSide < Points.get(i).distanceTo(Points.get(i+1))) {
                TheLongestSide = Points.get(i).distanceTo(Points.get(i + 1));
            }
        }
        return TheLongestSide;
    }
}
