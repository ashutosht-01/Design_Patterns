package StructuralPattern.FlyweightPattern;

//Use case - creating multiple identical & similar objects in-memory which can lead app's to excessive memory consumption.
//Helps us in reducing memory footprint.By sharing common state as object among multiple objects

public class client {
    public static void main(String[] args) {
        Bullet green1 = new Bullet(3,4,55,"Green");
        Bullet white = new Bullet(3,5,66,"white");
        Bullet green2 = new Bullet(3,6,32,"Green");
        System.out.println(green1.toString());
        System.out.println(green2.toString());
        System.out.println(white.toString());
    }
}
