import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        try {
            Injector injector = Guice.createInjector(new GuiceConfiguration());
            Car car = injector.getInstance(Car.class);
            System.out.println("L'auto pesa " + car.getWeight());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
