package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int newNumber=1;
        for(int i =1; i<=power; i++){
           newNumber=  newNumber*numberToPrint;
        }
        System.out.println(newNumber);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
