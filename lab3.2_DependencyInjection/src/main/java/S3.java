import com.google.inject.Guice;
import com.google.inject.Injector;

public class S3 {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new CarModule(new WinterTire()));
        ICar car = injector.getInstance(ICar.class);
        System.out.println("L'auto invernale pesa "+car.getWeight());

        injector = Guice.createInjector(new CarModule(new SummerTire()));
        car = injector.getInstance(ICar.class);
        System.out.println("L'auto estiva pesa "+car.getWeight());
    }

}
