package StructuralPattern.ProxyPattern;
//Placeholder(Surrogate) Obj - it will have your RealImage obj
public class ProxyImage implements Image{
    private RealImage realImage;
    public String fileName;
    public  ProxyImage(String fileName){
       this.fileName = fileName;
    }
    @Override
    public void display() {
        if (realImage == null){
         realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
