package BehaviouralPattern.MementoPattern;
import java.util.Stack;

//Caretaker class : Manages memento (snapshots of text editor state)
public class Caretaker {
   private final Stack<EditiorMemento>  hist = new Stack<>();

    public void saveState(Editior textEditor){
        hist.push(textEditor.save());
    }
    public void undo(Editior textEditor){
        if (!hist.isEmpty()){
            hist.pop();
            textEditor.restore(hist.peek());
        }
    }
}
