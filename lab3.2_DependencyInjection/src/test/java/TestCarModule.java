import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class TestCarModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IEngine.class).to(EngineFake.class);
        bind(IBody.class).to(BodyFake.class);
    }
    @Provides
    Wheel[] provideWheels (){
        Wheel[] wheels = new Wheel[4];

        for (int i=0;i<4;i++) {
            wheels[i] = new Wheel(new WinterTire());
        }
        return wheels;
    }
}
