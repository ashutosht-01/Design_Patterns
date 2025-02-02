package StructuralPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    String name;
    List<FileSystemComponent> components;
    public  Folder( String name){
        this.name=name;
        components = new ArrayList<>();
    }
    public void addComponent(FileSystemComponent component){
        components.add(component);
    }
    @Override
    public void showDetails() {
      System.out.println("Folder name: "+name);
      for(FileSystemComponent component:components){
          component.showDetails();
      }
    }
}
