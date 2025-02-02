package BehaviouralPattern.ChainofResponsibility;

public class DebugLogger extends Logger{
    public DebugLogger(Logger nextLogger) {
        super(nextLogger);
    }
    @Override
    public void log(Level level,String msg){
        if(level==Level.DEBUG) {
            System.out.println("Debug: " + msg);
        }else{
            super.log(level,msg);
        }
    }
}
