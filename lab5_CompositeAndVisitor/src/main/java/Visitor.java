public interface Visitor {
    public void visit(Division division);
    public void visit(Office office);
    public void visit(Section section);
    public void visit(Department department);
    public void visit(Developer developer);
    public void visit(Composite composite);
}
