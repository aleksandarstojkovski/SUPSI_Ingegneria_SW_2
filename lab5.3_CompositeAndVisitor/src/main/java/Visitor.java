public interface Visitor {
    void visitDepartment(Department department);
    void visitOffice(Office office);
    void visitDivision(Division divison);
    void visitSection(Section section);
    void visitPerson(Person person);
}
