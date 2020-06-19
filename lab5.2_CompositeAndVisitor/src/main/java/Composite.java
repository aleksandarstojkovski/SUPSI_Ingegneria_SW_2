import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private List<Component> eployeeList = new ArrayList<>();
    private String name;

    public Composite(String name){
        this.name=name;
    }

    public void addComponent(Component emp){
        eployeeList.add(emp);
    }

    public void removeComponent(Component emp){
        eployeeList.remove(emp);
    }

    public void printAll(Visitor visitor) {
        System.out.println(name);
        for (Component emp : eployeeList)
            emp.accept(visitor);
    }

    @Override
    public void accept(Visitor visitor) {

    }

}
