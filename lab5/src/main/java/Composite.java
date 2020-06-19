import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee{

    private List<Employee> eployeeList = new ArrayList<>();
    private String name;

    public Composite(String name){
        this.name=name;
    }

    public void printAll() {
        System.out.println(name);
        for (Employee emp : eployeeList)
            emp.printAll();
    }

    public void addEmployee(Employee emp){
        eployeeList.add(emp);
    }

    public void removeEmployee(Employee emp){
        eployeeList.remove(emp);
    }

}
