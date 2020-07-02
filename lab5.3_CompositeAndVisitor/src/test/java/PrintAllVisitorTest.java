import org.junit.jupiter.api.Test;

public class PrintAllVisitorTest {
    PrintAllVisitor printAllVisitor;

    @Test
    void visitDepartment() {
        printAllVisitor = new PrintAllVisitor();
        Department department = new Department("Alimentari");
        printAllVisitor.visitDepartment(department);
    }

    @Test
    void visitOffice() {
    }

    @Test
    void visitDivision() {
    }

    @Test
    void visitSection() {
    }

    @Test
    void visitPerson() {
    }
}
