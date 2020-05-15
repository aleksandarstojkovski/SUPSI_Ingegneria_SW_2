public class Worker {
    private int startingValue;

    public Worker(int startingValue) {
        this.startingValue = startingValue;
    }
    //pakage for test
    int conversion(int number){
        if (number % 2 == 0){
            return number/2;
        }else{
            return number*3+1;
        }
    }
    public int sequence(){
        System.out.println("Starting value = "+startingValue);
        int lenght = 0;
        int currentValue = startingValue;
        while(currentValue>2){
            lenght++;
            currentValue=conversion(currentValue);
        }
        return lenght+1;
    }

}
