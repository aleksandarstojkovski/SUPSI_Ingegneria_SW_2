public class Division extends Composite {

    public Division(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDivision(this);
    }

}
