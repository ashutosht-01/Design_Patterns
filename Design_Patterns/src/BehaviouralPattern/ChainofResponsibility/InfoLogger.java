package BehaviouralPattern.ChainofResponsibility;

//Concrete Handler
public class InfoLogger extends Logger{
    InfoLogger(Logger nextLogger) {
        super(nextLogger);
    }
    @Override
    public void log(Level level,String msg){
      if(level==Level.INFO) {
          System.out.println("Info: " + msg);
      }else{
          //either use super log & define next logic on abstract class
          //or define next logic here & use interface
          super.log(level,msg);
      }
    }

}
