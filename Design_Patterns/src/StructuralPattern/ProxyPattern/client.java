package StructuralPattern.ProxyPattern;

public class client {
    public static void main(String[] args) {
        ProxyImage img1 = new ProxyImage("c://user/downloads/lf.png");
        ProxyImage img2 = new ProxyImage("c://user/downloads/tf.png");
        //LazyLoading - Heavy objects are loaded into memory only when needed saving memory & cpu cycles
        img1.display();
        //Image will not be loaded again, as it has been cached in proxy
        img1.display();
        img2.display();
    }
}
