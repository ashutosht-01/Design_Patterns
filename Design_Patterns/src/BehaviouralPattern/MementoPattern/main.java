package BehaviouralPattern.MementoPattern;

public class main {
    public static void main(String[] args) {
    Editior editior = new Editior();
    Caretaker caretaker = new Caretaker();
    editior.write("Hello World");
    caretaker.saveState(editior);
    editior.write("java");
    caretaker.saveState(editior);
    caretaker.undo(editior);
    System.out.println(editior.getContent());
    }

}
