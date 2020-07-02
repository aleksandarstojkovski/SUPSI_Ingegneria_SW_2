import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DepartmentTest {
    @Test @Disabled
    void accept() {
        Composite dep = new Department("DEPA1");
        dep.add(new Person("Tizio", "Birillo", "CEO"));

        Composite div = new Division("DIVI1");
        dep.add(new Person("Marco", "Branca", "Sicurezza"));

        dep.add(div);
        //dep.printAll();
    }
}