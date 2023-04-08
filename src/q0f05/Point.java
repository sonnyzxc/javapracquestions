package q0f05;

public class Point {
  private final double XCoord;
  private final double YCoord;
  private final double ZCoord;

  public Point(double XCoord, double YCoord, double ZCoord) {
    this.XCoord = XCoord;
    this.YCoord = YCoord;
    this.ZCoord = ZCoord;
  }

  public double distance(Point newPoint) {
    return Math.sqrt(Math.pow((newPoint.XCoord - XCoord), 2)
        + Math.pow((newPoint.YCoord - YCoord), 2)
        + Math.pow((newPoint.ZCoord - ZCoord), 2));
  }

  public static Point getOrigin() {
    return new Point(0, 0, 0);
  }

  public double magnitude() {
    return distance(getOrigin());
  }

  @Override
  public String toString() {
    return "(" + XCoord + ", " + YCoord + ", " + ZCoord + ")";
  }

}
