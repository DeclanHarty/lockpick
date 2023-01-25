import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Lock {
    Pin pins[];
    public int numPins;
    private int numSetPins = 0;
    private boolean unlocked = false;

    public Lock(int numPins){
        this.numPins = numPins;
        pins = new Pin[numPins];
        makePins();
    }

    private void makePins(){
        Pin previousPin = null;
        for(int i = 0; i < numPins; i++){
            pins[i] = (new Pin(previousPin));
            previousPin = pins[i];
        }
        List<Pin> pinsList = Arrays.asList(pins); 
        Collections.shuffle(pinsList);
        pinsList.toArray(pins);
    }

    public void pickPin(int index){
        if(unlocked){
            System.out.println("Lock has already been picked... ");
            return;
        }
        if(pins[index].setPin()){
            numSetPins++;
            checkIfUnlocked();
        }
    }

    private  void checkIfUnlocked(){
        if (numSetPins == numPins){
            System.out.println("Lock has been picked... ");
            unlocked = true;
        }
    }

    public void printLock(){
        String[] lockLines = {"", "", "", ""};
        int iterations = 1;

        for(Pin pin : pins){
            lockLines[0] += (" " + iterations);
            lockLines[1] += " \u2588";
            lockLines[pin.pinSet() ? 2 : 3] += " \u2588";
            lockLines[pin.pinSet() ? 3 : 2] += "  ";
            iterations++;

            /*if(pin.pinSet()){
                lockLines[1] += " \u2588";
                lockLines[2] += "  ";
            }else{
                lockLines[1] += "  ";
                lockLines[2] += " \u2588";
            }*/
        }

        for (String string : lockLines) {
            System.out.println(string);
        }

        
    }

    public boolean Unlocked(){
        return unlocked;
    }
}
