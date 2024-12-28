package BehaviouralPattern.IteratorPattern;

import java.util.Arrays;
import java.util.List;

public class client {
    public static void main(String[] args) {
        Book b1= new Book();
        b1.setName("English");
        Book b2 = new Book();
        b2.setName("History");
        List<Book> bookList=Arrays.asList(b1,b2);
        //With help of iterator interface we separate concerns as client doesn't need to know underlying data structure
        BookCollection bookCollection = new BookCollection(bookList);
      Iterator<Book> it=  bookCollection.createIterator();
      while(it.hasNext()){
          System.out.println(it.next());
      }

    }
}
