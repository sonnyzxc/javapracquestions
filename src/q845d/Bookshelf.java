package q845d;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Bookshelf {

  private final List<Book> contents;

  public Bookshelf() {
    contents = new LinkedList<>();
  }

  // Returns the number of books on the bookshelf
  public int size() {
    return contents.size();
  }

  // Adds a book on the left side of the shelf.
  // Shifts all other books one position to the right
  public void addBookOnLeftSide(Book b) {
    addBook(0, b);
  }

  // Adds a book on the right side of the shelf.
  public void addBookOnRightSide(Book b) {
    addBook(size(), b);
  }

  // Adds book in position i counting from the left, starting
  // from zero, and shifts all other books one position to the right.
  // Hence addBook(0, b) is equivalent to addBookOnLeftSide(b), and
  // addBook(size(), b) is equivalent to addBookOnRightSide(b)
  public void addBook(int i, Book b) {
    contents.add(i, b);
  }

  // Removes book from position i, shifting all books with position
  // greater than i to the left
  public Book remove(int i) {
    return contents.remove(i);
  }

  // Prints all details of books from left to right
  public void printLeftToRight() {
    for (Book b : contents) {
      System.out.println(b);
    }
  }

  // Prints all details of books from right to left
  public void printRightToLeft() {
    ListIterator<Book> it = contents.listIterator(contents.size());
    while (it.hasPrevious()) {
      System.out.println(it.previous());
    }
  }
}
