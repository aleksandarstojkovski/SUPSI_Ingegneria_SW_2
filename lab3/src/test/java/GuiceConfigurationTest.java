import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class GuiceConfigurationTest extends AbstractModule{

    Wheel[] wheels = new Wheel[4];

    @Override
    public void configure() {
        bind(IEngine.class).to(EngineFake.class);
        bind(IBody.class).to(BodyFake.class);

        wheels = new Wheel[4];
        for(int i = 0; i < wheels.length;i++){
            Wheel newWheel = new Wheel();
            wheels[i] = newWheel;
            requestInjection(newWheel);
        }
    }

    @Provides
    public Wheel[] provideWheels(){
        return wheels;
    }

}