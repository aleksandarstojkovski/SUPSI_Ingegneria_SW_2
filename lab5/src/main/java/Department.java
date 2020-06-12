import java.util.ArrayList;
import java.util.List;

public class Department implements Employee {

    private List<Employee> eployeeList = new ArrayList<>();

    public void printAll() {
        System.out.println("Department");
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

