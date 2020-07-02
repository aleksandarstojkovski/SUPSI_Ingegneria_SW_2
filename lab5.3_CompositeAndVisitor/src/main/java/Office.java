public class Office extends Composite {

    public Office(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitOffice(this);
    }

}
