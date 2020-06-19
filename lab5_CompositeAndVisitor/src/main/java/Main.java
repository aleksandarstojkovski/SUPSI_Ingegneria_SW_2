public class Main {
    public static void main(String[] args) {

        Component employee1 = new Developer("dev1");
        Component employee2 = new Developer("dev2");
        Component employee3 = new Developer("dev3");
        Component employee4 = new Developer("dev4");

        Department department = new Department("department");
        Division division = new Division("division");
        Section section = new Section("section");
        Office office = new Office("office");

        department.addComponent(division);
        division.addComponent(section);
        section.addComponent(office);

        department.addComponent(employee1);
        division.addComponent(employee2);
        section.addComponent(employee3);
        office.addComponent(employee4);

        Visitor visitor = new PrinterVisitor();
        department.printAll(visitor);

    }
}
