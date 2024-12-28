package BehaviouralPattern.IteratorPattern;

public class Book {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String name;


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
