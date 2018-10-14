public class Point{
  private double x;
  private double y;

  public Point(double a, double b) {
    x = a;
    y = b;
  }

  public Point(Point p){
    x = p.x;
    y = p.y;
  }

  public double getX(){
    return this.x;
  }
  public double getY(){
    return this.y;
  }

  public double distanceTo(Point p){
    return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
  }

  public double distance(Point p, Point q){
    return Math.sqrt(Math.pow(p.x - q.x, 2) + Math.pow(p.y - q.y, 2));
  }

  public String toString(){
    return "(" + x + ", " + y + ")";
  }
}
