package org.example;

import org.example.composite.File;
import org.example.composite.Folder;

public class Main {
    public static void main(String[] args) {
        Folder root=new Folder("design patterns");
        Folder d1= (Folder) root.addCompnent(new Folder("Comportement"));
        Folder d2= (Folder) root.addCompnent(new Folder("structure"));
        Folder d3= (Folder) root.addCompnent(new Folder("creation"));
        d1.addCompnent(new File("strategy"));
        d2.addCompnent(new File("observer"));
        d2.addCompnent(new File("composite"));
        d2.addCompnent(new File("Adapter"));
        d3.addCompnent(new File("singleton"));
        d3.addCompnent(new File("builder"));
        Folder d21=(Folder) d2.addCompnent(new Folder("str21"));
        d21.addCompnent(new File("C211"));
        d21.addCompnent(new File("C212"));
        d21.addCompnent(new File("C213"));
        root.show();

    }
}
