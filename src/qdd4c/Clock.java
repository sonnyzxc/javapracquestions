package qdd4c;

public class Clock {

  private int secondsSinceMidnight;
  private final DisplayMode displayMode;

  public Clock(int secondsSinceMidnight, DisplayMode displayMode) {
    this.secondsSinceMidnight = secondsSinceMidnight;
    this.displayMode = displayMode;
  }

  public Clock(int secondsSinceMidnight) {
    this(secondsSinceMidnight, DisplayMode.SecondsSinceMidnight);
  }

  public Clock(int hh, int mm, int ss) {
    secondsSinceMidnight = hh * 3600 + mm * 60 + ss;
    displayMode = DisplayMode.SecondsSinceMidnight;
  }


  public void tick() {
    secondsSinceMidnight += 1;
  }

  @Override
  public String toString() {
    if (displayMode == DisplayMode.SecondsSinceMidnight) {
      return secondsSinceMidnight + " seconds since midnight";
    }
    int hourInt = secondsSinceMidnight / 3600;
    String hour = hourInt < 10 ? "0" + hourInt : Integer.toString(hourInt);
    int minuteInt = (secondsSinceMidnight - hourInt * 3600) / 60;
    String minute = minuteInt < 10 ? "0" + minuteInt : Integer.toString(minuteInt);
    int secondInt = secondsSinceMidnight % 60;
    String second = secondInt < 10 ? "0" + secondInt : Integer.toString(secondInt);
    return hour + ":" + minute + ":" + second;
  }

  private enum DisplayMode {
    TwentyFourHour,
    SecondsSinceMidnight
  }
}
