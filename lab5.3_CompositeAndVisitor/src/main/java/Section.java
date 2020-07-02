public class Section extends Composite {

    public Section(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }

}
