package StructuralPattern.ProxyPattern;

public class RealImage implements Image{
    String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        //heavy operation
        loadImageFromDisk(fileName);
    }
    @Override
    public void display() {
      System.out.println("Displaying Image: ");
    }
    private void loadImageFromDisk(String fileName){
        System.out.println("Loading Image from disk from path: "+fileName);
    }
}
