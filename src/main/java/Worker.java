public class Worker {

    private int startingValue;

    public Worker(int startingValue) {
        this.startingValue=startingValue;
    }

    int conversion(int number){
        if (number % 2 == 0){
            return number/2;
        } else {
            return 3*number+1;
        }
    }

    int sequence (){
        int counter=0;
        while (startingValue!=1){
            startingValue = conversion(startingValue);
            counter++;
        }
        return counter;
    }

}
