public class Developer implements Component {

    private static int counter=1;
    private int id;

    public Developer(){
        this.id = counter++;
    }

    @Override
    public void printAll() {
        System.out.println("Developer"+id);
    }

}
