package CreationalPattern.SingeltonPattern;
//Use case - when only one instance of a class is required to coordinate across the systems
public class DBConnection {
    private volatile  static DBConnection instance;
    private  DBConnection(){
        System.out.println("DB connection created..");
    }
    //Thread safe singleton
    //Lazy initialization- create an object if required in system
    public static DBConnection getInstance(){
        //Double check single lock solution
        //Problems:
        //1) Reorder of instruction by CPU in case of member variable
        //2) L1 caching
        //solution- use volatile keyword for instance
        if(instance==null){
            synchronized(DBConnection.class) {
                if(instance==null) {
                    instance = new DBConnection();
                }
            }
        }
        return instance;
    }
}
