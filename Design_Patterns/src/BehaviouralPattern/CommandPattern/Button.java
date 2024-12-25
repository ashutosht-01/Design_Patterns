package BehaviouralPattern.CommandPattern;
//Invoker
public class Button {
    public Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void onClick(){
        command.execute();
    }
}
