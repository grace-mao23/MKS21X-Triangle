public class Driver{
  public static void main(String[]args){
    Point a = new Point(1.0, 1.0);
    Point b = new Point(2.0, 2.0);
    Point c = new Point(0.0, 0.0);

    System.out.println("a: (" + a.getX() + ", " + a.getY() + ")");

    System.out.println();

    System.out.println("a: " + a);
    System.out.println("b: " + b);

    System.out.println();

    System.out.println("Testing distance, should be equal");
    System.out.println(Point.distance(a,b));
    System.out.println(a.distanceTo(b));

    System.out.println();

    System.out.println("Testing perimeter, should be equal");
    Triangle t1 = new Triangle(1.0,2.0,3.0,1.0,2.0,3.0);
    Triangle t2 = new Triangle(new Point(1.0,1.0),new Point(2.0,2.0),new Point(3.0,3.0));
    System.out.println( t1 );
    System.out.println( t1.getPerimeter() );
    System.out.println( t2 );
    System.out.println( t2.getPerimeter() );

    System.out.println();

    System.out.println("Testing vertex, getting each");
    System.out.println("Vertex A: " + t2.getVertex(0));
    System.out.println("Vertex B: " + t2.getVertex(1));
    System.out.println("Vertex C: " + t2.getVertex(2));

    System.out.println();

    System.out.println("Testing setVertex");
    t2.setVertex(0, c);
    System.out.println( t2 );

  }
 }
