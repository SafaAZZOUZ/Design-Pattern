package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {
    private List<Component> childs=new ArrayList<>();
    public Folder(String name){
        super(name);
    }

    public Component addCompnent(Component component){
        component.level=this.level+1;
        childs.add(component);
        return  component;
    }
    @Override
    public void show() {

        System.out.println(tab()+"folder :"+name);
        for (Component c : childs){
            c.show();
        }


    }
}
