public class Driver{
  public void main(String[]args){
    Point a = new Point(1.0, 1.0);
    Point b = new Point(2.0, 2.0);

    System.out.println("a: (" + a.getX() + ", " + a.getY() + ")");

    System.out.println();

    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("c: " + c);
    System.out.println("d: " + d);

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

    System.out.println("Testing a 3/4/5 triangle");
    t1 = new Triangle(-1,-1, 2,3, 2,-1);
    System.out.println( t1 );
    System.out.println( t1.getPerimeter() );

    System.out.println();

    System.out.println("Testing vertex, getting each");
    System.out.println("Vertex A: " + t1.getVertex(0));
    System.out.println("Vertex B: " + t1.getVertex(1));
    System.out.println("Vertex C: " + t1.getVertex(2));

    System.out.println();

    System.out.println("Testing setVertex");
    t1.setVertex(0.0, 0.0);
    System.out.println( t1 );

  }
 }
