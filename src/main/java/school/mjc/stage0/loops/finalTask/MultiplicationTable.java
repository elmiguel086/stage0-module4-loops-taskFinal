package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1 + " x " + numberTableToPrint
                    + " = " + (i+1) * numberTableToPrint);
        }
    }
}
