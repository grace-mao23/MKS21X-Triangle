public class Triangle{
  private Point v1;
  private Point v2;
  private Point v3;

  public Triangle(Point p, Point q, Point r){
    v1 = new Point(p);
    v2 = new Point(q);
    v3 = new Point(r);
  }
  public Triangle(double x1, double x2, double x3, double y1, double y2, double y3){
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }

  public double getPerimeter(){
    return Point.distance(this.v1, this.v2) +
           Point.distance(this.v2, this.v3) +
           Point.distance(this.v3, this.v1);
  }
  public Point getVertex(int a){
    if (a == 0) {
      return new Point(this.v1);
    } else if (a == 1) {
      return new Point(this.v2);
    } else {
      return new Point(this.v3);
    }
  }

  public void setVertex(int index, Point newP){
    if (index == 0) {
      return new Point(newP);
    } else if (index == 1) {
      return new Point(newP);
    } else {
      return new Point(newP);
    }
  }

  public String toString(){
    return "Triangle: A" + this.v1 + " B" + this.v2 + " C" + this.v3;
  }
}
