package BehaviouralPattern.ChainofResponsibility;

//Abstract Handler
public abstract class Logger {
    Logger nextLogger;

    public Logger(Logger nextLogger) {
        this.nextLogger=nextLogger;
    }

    public void log(Level level,String msg){
       if(nextLogger!=null){
           nextLogger.log(level,msg);
       }
    }
}
