public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Developer();
        Employee employee2 = new Developer();
        Employee employee3 = new Developer();
        Employee employee4 = new Developer();

        Department department = new Department();
        Division division = new Division();
        Section section = new Section();
        Office office = new Office();

        department.addEmployee(division);
        division.addEmployee(section);
        office.addEmployee(section);

        department.addEmployee(employee1);
        division.addEmployee(employee2);
        section.addEmployee(employee3);
        office.addEmployee(employee4);

        department.printAll();

    }
}
