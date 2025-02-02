package BehaviouralPattern.ChainofResponsibility;

public class ErrorLogger extends Logger{
    public ErrorLogger(Logger nextLogger) {
        super(nextLogger);
    }
    @Override
    public void log(Level level,String msg){
        if(level==Level.ERROR) {
            System.out.println("Error: " + msg);
        }else{
            super.log(level,msg);
        }
    }
}
