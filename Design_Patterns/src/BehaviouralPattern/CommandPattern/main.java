package BehaviouralPattern.CommandPattern;
public class main {
    public static void main(String[] args) {
        TextEditior te = new TextEditior();
        te.write("Hello World");
        //Button: single button object can do many type of actions completely decouple from textEditior
        Button bt = new Button();
        bt.setCommand(new BoldCommand(te));
        bt.onClick();
    }
}
