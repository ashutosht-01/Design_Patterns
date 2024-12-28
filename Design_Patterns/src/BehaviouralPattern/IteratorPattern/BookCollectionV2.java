package BehaviouralPattern.IteratorPattern;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
//Each collection in java implements Iterable interface - it has method which produces an iterator that class needs to override
public class BookCollectionV2 implements Iterable{
    Set<Book> bookList;
    BookCollectionV2(Set<Book> bookList){
        this.bookList = bookList;
    }
    @Override  //similar to createIterator() method
    public Iterator iterator() {
        return bookList.iterator();
    }
}
