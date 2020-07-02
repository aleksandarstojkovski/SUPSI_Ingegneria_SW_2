import com.google.inject.Inject;

public class Wheel {
    private double weight = 5;
    ITire tire;

    @Inject
    Wheel(ITire tire){
        this.tire = tire;
    }


    public double getWeight() {
        return weight+tire.getWeight();
    }
}
