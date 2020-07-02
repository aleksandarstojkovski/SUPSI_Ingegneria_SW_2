import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarTest {

    @Test
    void getWeight() {
        Injector injector = Guice.createInjector(new TestCarModule());
        Car carTest = injector.getInstance(Car.class);
        double weigthExpected = 92;
        assertEquals(weigthExpected,carTest.getWeight());
    }
}