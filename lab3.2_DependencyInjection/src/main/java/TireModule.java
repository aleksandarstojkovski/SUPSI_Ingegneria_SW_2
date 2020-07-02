import com.google.inject.AbstractModule;

public class TireModule extends AbstractModule {
    ITire tire;
    TireModule(ITire tire){
        this.tire = tire;
    }
    @Override
    protected void configure() {
        // Come gestire il binding tra interfaccia e due possibili classi

            bind(ITire.class).to(tire.getClass());

    }
}
