package BehaviouralPattern.ChainofResponsibility;

public class Client {
    public static void main(String[] args) {
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        //logger has info log instance for now
        logger.log(Level.ERROR,"Runtime error happened"); //info delegating request debug & then debug delegating to error
        logger.log(Level.DEBUG,"Debugging this piece of code");
        logger.log(Level.INFO,"Info logging ");
    }
}
