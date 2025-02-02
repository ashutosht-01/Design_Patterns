package StructuralPattern.CompositePattern;

//Use case:- Used in hierarchical structure where object can be composed of other object
//Let's client treat individual & composition of objects uniformly
public class FileSystemApp {
    public static void main(String[] args) {
        FileSystemComponent f1 = new File("file1.txt");
        FileSystemComponent f2 = new File("file2.txt");
        Folder folder = new Folder("Documents");
        folder.addComponent(f1);
        folder.addComponent(f2);
        Folder subFolder = new Folder("SubDoc");
        FileSystemComponent f3 = new File("file3.txt");
        subFolder.addComponent(f3);
        folder.addComponent(subFolder);
        folder.showDetails();
    }
}
