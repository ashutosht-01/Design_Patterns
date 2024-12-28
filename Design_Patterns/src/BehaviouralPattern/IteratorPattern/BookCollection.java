package BehaviouralPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    List<Book> bookList;
    BookCollection(List<Book> bookList){
        this.bookList = bookList;
    }
    //Method to get private iterator obj
   public Iterator<Book> createIterator(){
        return new BookIterator(bookList);
   }
    private class BookIterator implements Iterator<Book>{
      List<Book> bookList;
      //for list we are maintaining this variable
      int position;
      BookIterator(List<Book> bookList){
          this.bookList = bookList;
          position =0;
      }
        @Override
        public boolean hasNext() {
        return  position < bookList.size();
        }

        @Override
        public Book next() {
            return bookList.get(position++);
        }
    }
}
