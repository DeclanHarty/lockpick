import java.util.List;
import java.util.Collections;

public class Lock {
    List<Pin> pins;
    private int numPins;
    private int numSetPins = 0;
    private boolean unlocked = false;


    public Lock(int _numPins){
        numPins = _numPins;

        makePins();
    }

    private void makePins(){
        Pin previousPin = null;
        for(int i = 0; i < numPins; i++){
            pins.add(new Pin(previousPin));
            previousPin = pins.get(i);
        }

        Collections.shuffle(pins);
    }

    public void pickPin(int index){
        if(unlocked){
            System.out.println("Lock has already been picked... ");
            return;
        }
    }
}
