package BehaviouralPattern.MementoPattern;

public class EditiorMemento {
    private final String content;
    EditiorMemento(String content){
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
