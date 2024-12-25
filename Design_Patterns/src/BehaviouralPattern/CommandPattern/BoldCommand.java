package BehaviouralPattern.CommandPattern;

//Concrete implementation of command interface
public class BoldCommand implements Command{
    TextEditior textEditior;
    BoldCommand(TextEditior textEditior){
        this.textEditior = textEditior;
    }
    @Override
    public void execute() {
        textEditior.boldText();
    }
}
