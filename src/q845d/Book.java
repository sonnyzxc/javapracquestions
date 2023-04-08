package q845d;

public class Book {

  private final String isbn;
  private final String title;
  private final int pages;

  public Book(String isbn, String title, int pages) {
    this.isbn = isbn;
    this.title = title;
    this.pages = pages;
  }

  @Override
  public String toString() {
    return title + ", ISBN: " + isbn + ", pages: " + pages;
  }

}
