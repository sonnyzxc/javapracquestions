package qbdb4;

public class House {

  private Rectangle floorSize;
  private int floorArea;

  public House(Rectangle floorSize) {
    setFloorSize(floorSize);
  }

  public Rectangle getFloorSize() {
    return new Rectangle(floorSize.getWidth(), floorSize.getHeight());
  }

  public void setFloorSize(Rectangle floorSize) {
    this.floorSize = new Rectangle(floorSize.getWidth(), floorSize.getHeight());
    floorArea = floorSize.getWidth() * floorSize.getHeight();
  }

  public int getFloorArea() {
    return floorArea;
  }

}