package q5235.pointequality;

public class Point {

  // By making these fields final, we ensure that a Point is immutable.
  protected final double coordX;
  protected final double coordY;
  protected final double coordZ;

  public Point(double coordX, double coordY, double coordZ) {
    this.coordX = coordX;
    this.coordY = coordY;
    this.coordZ = coordZ;
  }

  public double distanceFrom(Point other) {
    return Math
        .sqrt(Math.pow(other.coordX - coordX, 2) + Math.pow(other.coordY - coordY, 2)
            + Math.pow(other.coordZ - coordZ, 2));
  }

  public static Point getOrigin() {
    return new Point(0, 0, 0);
  }

  public double magnitude() {
    return distanceFrom(getOrigin());
  }

  @Override
  public String toString() {
    return "(" + coordX + ", " + coordY + ", " + coordZ + ")";
  }

//  @Override
//  public boolean equals(Object object) {
//    return object instanceof Point p && coordX == p.coordX && coordY == p.coordY && coordZ == p.coordZ;
//  }

//  @Override
//  public int hashCode() {
//    return this.hashCode();
//  }
}
