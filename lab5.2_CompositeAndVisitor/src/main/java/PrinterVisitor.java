public class PrinterVisitor implements Visitor{

    @Override
    public void visit(Division division) {
        division.printAll(this);
    }

    @Override
    public void visit(Office office) {
        office.printAll(this);
    }

    @Override
    public void visit(Section section) {
        section.printAll(this);
    }

    @Override
    public void visit(Department department) {
        department.printAll(this);
    }

    @Override
    public void visit(Developer developer) {
        developer.printAll(this);
    }

    @Override
    public void visit(Composite composite) {
        composite.printAll(this);
    }

}
