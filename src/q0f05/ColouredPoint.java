package q0f05;

public class ColouredPoint extends Point {

  private Colour colour;

  public ColouredPoint(double XCoord, double YCoord, double ZCoord, Colour colour) {
    super(XCoord, YCoord, ZCoord);
    this.colour = colour;
  }

  @Override
  public String toString() {
    return "(" + super.toString() + ", " + colour.toString() + ")";
  }

  protected enum Colour {
    RED,
    GREEN,
    BLUE;

    @Override
    public String toString() {
      return switch (this) {
        case RED -> "Red";
        case BLUE -> "Blue";
        case GREEN -> "Green";
      };
    }
  }
}
