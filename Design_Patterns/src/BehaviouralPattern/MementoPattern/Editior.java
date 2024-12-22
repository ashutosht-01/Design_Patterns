package BehaviouralPattern.MementoPattern;

public class Editior {
    public String content;
    public void write(String content){
        this.content = content;
    }
    public String getContent(){
        return content;
    }
   //save current state of editor
    public EditiorMemento save(){
         return new EditiorMemento(content);
    }
    public void restore(EditiorMemento memento){
        content = memento.getContent();

    }
}
