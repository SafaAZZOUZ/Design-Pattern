package org.example.composite;

public abstract class Component {
    protected   String name;
    protected int level;
    public  abstract  void show();

    public Component(String name) {
        this.name = name;
    }
    public String tab(){
        String tab="";
        for (int i=0;i<level ; i++){
            tab+="\t";
        }
        return tab;
    }
}
