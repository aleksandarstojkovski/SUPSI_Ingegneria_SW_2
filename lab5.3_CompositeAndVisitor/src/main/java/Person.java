public class Person implements Component {

    private final String name;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRole() {
        return role;
    }

    private final String surname;
    private final String role;

    public Person(String name, String surname, String role) {
        this.name = name;
        this.surname = surname;
        this.role = role;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitPerson(this);
    }

}

