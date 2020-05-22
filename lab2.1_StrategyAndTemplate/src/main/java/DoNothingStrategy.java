public class DoNothingStrategy implements ManipulationStrategy {

    @Override
    public String manipulation(String source){
        return source;
        }

}