package BehaviouralPattern.CommandPattern;
//Receiver: Perform operation
public class TextEditior {
    String content;
    public void write(String content){
        this.content=content;
    }
    public void boldText(){
        System.out.println("Text is bold "+content);
    }
    public void italicText(){
        System.out.println("Text is italic "+content);
    }
}
