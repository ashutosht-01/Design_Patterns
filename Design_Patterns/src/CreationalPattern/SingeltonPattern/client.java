package CreationalPattern.SingeltonPattern;

public class client {
    public static void main(String[] args) {
        DBConnection dbConnection1 = DBConnection.getInstance();
        System.out.println(dbConnection1.toString());
        DBConnection dbConnection2 = DBConnection.getInstance();
        System.out.println(dbConnection2.toString());
        System.out.println(dbConnection1==dbConnection2);
    }
}
