import java.util.ArrayList;
import java.util.List;

public class Section implements Employee{

    private List<Employee> eployeeList = new ArrayList<>();

    public void printAll() {
        System.out.println("Section");
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
