public class UpperCaseStrategy implements ManipulationStrategy {

    @Override
    public String manipulation(String source) {
        return source.toUpperCase();
    }

}
