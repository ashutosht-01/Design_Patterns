package StructuralPattern.FlyweightPattern;

public class Bullet {
    @Override
    public String toString() {
        return "Bullet{" +
                "x=" + x +
                ", y=" + y +
                ", velocity=" + velocity +
                ", bulletType=" + bulletType +
                '}';
    }

    //Extrinsic Properties - Unique for all objects
    private int x;
    private int y;
    private int velocity;
    //Intrinsic Properties - Common for all objects
    BulletType bulletType;
    Bullet(int x,int y,int velocity,String color){
        this.x=x;
        this.y=y;
        this.velocity=velocity;
        bulletType = BulletTypeFactory.getBulletTypeInstance(color);
    }


}
