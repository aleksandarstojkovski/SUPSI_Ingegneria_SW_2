import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Provides;

public class CarModule extends AbstractModule {

    // Posso fare un costruttore di CarModule per passare il tipo di Gomma?

    ITire tire;

    CarModule(ITire tire){
    this.tire = tire;
    }


    @Override
    protected void configure() {
        bind(IEngine.class).to(Engine.class);
        bind(IBody.class).to(Body.class);

        bind(ICar.class).to(Car.class);
    }
    @Provides
    Wheel[] provideWheels (){
        Wheel[] wheels = new Wheel[4];
        Injector injector = Guice.createInjector(new TireModule(tire));
        ITire injectedTire = injector.getInstance(ITire.class);
        for (int i=0;i<4;i++) {
            wheels[i] = new Wheel(injectedTire);
        }
        return wheels;
    }
}
