import com.google.inject.Inject;

public class Car implements ICar{
    // Inject permette di istanziare la classe
    //@Inject
    private IEngine engine;
    //@Inject
    private IBody body;
    @Inject
    private Frame frame;
    @Inject
    private Interior interior;
    @Inject
    private Wheel[] wheels;


    @Inject
    public Car(IEngine engine, IBody body) {
        this.engine = engine;
        this.body = body;

    }
    /*
        @Inject
        public Car(IEngine engine, IBody body, Frame frame,Interior interior, Wheel[] wheels) {
        this.engine = engine;
        this.body = body;
        this.frame = frame;
        this.interior = interior;
        this.wheels = wheels;
        }
    */

    @Override
    public double getWeight() {
        double currentWeight = 0;
        currentWeight = engine.getWeight()+body.getWeight()+frame.getWeight()+interior.getWeight();
        for (Wheel var:wheels) {
            currentWeight+=var.getWeight();
        }
        return currentWeight;
    }

}