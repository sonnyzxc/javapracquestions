package qdd4c;

public class AlarmClock extends Clock {

  private final int alarmTimeSecondsSinceMidnight;
  private boolean alarmSounding;

  public AlarmClock(int time, int alarm) {
    super(time);
    alarmTimeSecondsSinceMidnight = alarm;
  }

  public AlarmClock(int hh, int mm, int ss, int hhAlarm, int mmAlarm, int ssAlarm) {
    super(hh, mm, ss);
    alarmTimeSecondsSinceMidnight = hhAlarm * 3600 + mmAlarm * 60 + ssAlarm;
  }

  @Override
  public void tick() {
    super.tick();
//    if (alarmSounding) {
//      assert secondsSinceMidnight != alarmTimeSecondsSinceMidnight;
//
//      int oneMinuteAgo = secondsSinceMidnight - SECONDS_IN_A_MINUTE;
//      if (oneMinuteAgo < 0) {
//        oneMinuteAgo += SECONDS_IN_A_DAY;
//      }
//
//      if (oneMinuteAgo == alarmTimeSecondsSinceMidnight) {
//        alarmSounding = false;
//      }
//    } else if (secondsSinceMidnight == alarmTimeSecondsSinceMidnight) {
//      alarmSounding = true;
//    }
  }

  @Override
  public String toString() {
    return super.toString() + (alarmSounding ? " BEEP!" : "");
  }
}
