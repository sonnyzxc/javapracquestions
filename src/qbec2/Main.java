package qbec2;

import qbec2.Record.Genre;

public class Main {

  public static void main(String[] args) {

    Artist queen = new Artist("Queen", Genre.Rock);

    queen.addRecord("A Night At the Opera");

    queen.addRecord("Hot Space", Genre.Pop);

    queen.addRecord("A Day at the Races", Genre.Rock);

    queen.addRecord("Innuendo", Genre.Rock);

    System.out.println("All records by " + queen.getName() + ":");
    queen.showCatalogue();

    System.out.println();

    System.out.println("All " + Genre.Rock + " records by " + queen.getName() + ":");
    queen.showGenre(Genre.Rock);

  }
}
