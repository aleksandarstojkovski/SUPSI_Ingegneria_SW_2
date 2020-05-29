import com.google.inject.Guice;
import com.google.inject.Injector;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    public void getWeight() {

        double weigthExpected = new Engine().getWeight() + new Body().getWeight() + new Frame().getWeight() + new Interior().getWeight();

        Injector injector = Guice.createInjector(new CarModule());

        Car carTest = injector.getInstance(Car.class);

        Assert.assertEquals(weigthExpected, carTest.getWeight(),36);

    }
}