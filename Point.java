public class Point{
  private double x;
  private double y;

  // a constructor!
  public Point(double a, double b) {
    x = a;
    y = b;
  }
  public Point(Point p){
    point = p;
  }

  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  public double distanceTo(Point p){

  }

  public double distance(Point p, Point q){

  }

  public String toString(){
    return "(" + x + ", " + y + ")";
  }
}
