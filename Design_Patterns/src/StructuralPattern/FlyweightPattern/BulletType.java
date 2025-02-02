package StructuralPattern.FlyweightPattern;


//Flyweight class - It has all Intrinsic properties (shared between obj)
public class BulletType {
    @Override
    public String toString() {
        return "BulletType{" +
                "color='" + color + '\'' +
                ", Img='" + Img + '\'' +
                '}';
    }

    //Intrinsic Properties - common for all object
    String color;
    String Img;
    public BulletType(String color){
        this.color = color;
        this.Img = "temp.txt";
    }
}
