package qc2b8;

public class Point {

  private final int coordX;
  private final int coordY;

  public Point(int coordX, int coordY) {
    this.coordX = coordX;
    this.coordY = coordY;
  }

  public int getCoordX() {
    return coordX;
  }

  public int getCoordY() {
    return coordY;
  }

  @Override
  public String toString() {
    return "(" + getCoordX() + ", " + getCoordY() + ")";
  }

}
