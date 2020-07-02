import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private final String name;

    List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public String getName() {
        return name;
    }


   public void  accept(Visitor visitor) {
       for (Component c : components) {
           c.accept(visitor);
       }
   }
}
