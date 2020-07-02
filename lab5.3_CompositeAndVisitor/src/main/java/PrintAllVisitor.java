public class PrintAllVisitor implements Visitor{
    @Override
    public void visitDepartment(Department componet) {
        System.out.println(String.format(">> %s ", componet.getName()));
    }

    @Override
    public void visitOffice(Office componet) {
        System.out.println(String.format(">> %s ", componet.getName()));
    }
    @Override
    public void visitDivision(Division componet) {
        System.out.println(String.format(">> %s ", componet.getName()));
    }

    @Override
    public void visitSection(Section componet) {
        System.out.println(String.format(">> %s ", componet.getName()));
    }

    @Override
    public void visitPerson(Person componet) {
        System.out.println(String.format("Name[%s] Surname[%s] Role[%s]", componet.getName(), componet.getSurname(), componet.getRole()));
    }
}
