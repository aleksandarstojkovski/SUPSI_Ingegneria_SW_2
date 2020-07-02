import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class CarModule extends AbstractModule{

    Wheel[] wheels = new Wheel[4];

    @Override
    public void configure() {
        bind(IEngine.class).to(Engine.class);
        bind(IBody.class).to(Body.class);

        for(int i = 0; i < wheels.length;i++){
            wheels[i] = new Wheel();
            requestInjection(wheels[i]);
        }
    }

    @Provides
    public Wheel[] provideWheels(){
        return wheels;
    }

}