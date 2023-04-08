package qbec2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import qbec2.Record.Genre;

public class Artist {

  private final String name;
  private final List<Record> catalogue = new ArrayList<>();
  private final Genre mainGenre;

  public Artist(String name, Genre mainGenre) {
    this.name = name;
    this.mainGenre = mainGenre;
  }


  // Add a record of the given name to the artist's catalogue
  // Use the artist's main genre as the record's genre
  public void addRecord(String name) {
    addRecord(name, mainGenre);
  }

  // Add a record of the given name and genre to the artist's catalogue
  public void addRecord(String name, Genre genre) {
    catalogue.add(new Record(name, genre));
  }

  // Display the artist's catalogue
  public void showCatalogue() {
    for (Record r: catalogue) {
      System.out.println(r);
    }
  }

  // Display the subset of artist's catalogue that falls into the given genre
  public void showGenre(Genre genre) {
    for (Record r : catalogue) {
      if (Objects.equals(r.getGenre(), genre.toString())) {
        System.out.println(r);
      }
    }
  }

  public String getName() {
    return name;
  }
}
