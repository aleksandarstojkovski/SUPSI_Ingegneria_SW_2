public class Main {
    public static void main(String[] args) {

        Component employee1 = new Developer();
        Component employee2 = new Developer();
        Component employee3 = new Developer();
        Component employee4 = new Developer();

        Department department = new Department("department");
        Division division = new Division("division");
        Section section = new Section("section");
        Office office = new Office("office");

        department.addComponent(division);
        division.addComponent(section);
        office.addComponent(section);

        department.addComponent(employee1);
        division.addComponent(employee2);
        section.addComponent(employee3);
        office.addComponent(employee4);

        department.printAll();

    }
}
