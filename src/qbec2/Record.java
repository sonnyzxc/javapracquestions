package qbec2;

public class Record {

  private String title;
  private Genre genre;

  public Record(String title, Genre genre) {
    this.title = title;
    this.genre = genre;
  }

  public String getGenre() {
    return genre.toString();
  }

  public enum Genre {
    Rock,
    Pop,
    Jazz;

    @Override
    public String toString() {
      return switch (this) {
        case Rock -> "Rock";
        case Pop -> "Pop";
        case Jazz -> "Jazz";
      };
    }
  }
}
