import com.google.inject.Inject;


public class Car implements IWeight{

    // Inject praticamente fa quello che farebbe il costruttore
    // ovvero fa = new ... ClasseBindata

    @Inject
    private IEngine engine;
    @Inject
    private IBody body;
    @Inject
    private Frame frame;
    @Inject
    private Interior interior;
    @Inject
    private Wheel[] wheels;

    @Override
    public double getWeight() {
        double totWeigthWeels = 0;
        for (Wheel wheel : wheels) {
            totWeigthWeels+= wheel.getWeight();
        }
        return frame.getWeight() + interior.getWeight() + totWeigthWeels + body.getWeight() + engine.getWeight() ;
    }

}
