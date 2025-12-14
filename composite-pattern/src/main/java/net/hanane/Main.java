package net.hananenhm;

import composite.File;
import composite.Folder;

/**
 * @author hanane
 **///TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.addComponent(new File("pom.xml"));
        Folder src = (Folder) root.addComponent(new Folder("src"));
        Folder main = (Folder) src.addComponent(new Folder("main"));
        main.addComponent(new File("Test.java"));
        main.addComponent(new File("Person.java"));
        root.print();
    }
}