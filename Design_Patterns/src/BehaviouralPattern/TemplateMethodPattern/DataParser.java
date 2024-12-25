package BehaviouralPattern.TemplateMethodPattern;

public abstract class DataParser {

    public final void parseData(){
        openFile();
        parse();
        closeFile();
    }
    abstract protected void parse();
    protected void openFile(){
        System.out.println("Opening File...");
    }
    protected void closeFile(){
        System.out.println("Closing File...");
    }
}
