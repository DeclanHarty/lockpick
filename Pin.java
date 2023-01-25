public class Pin {
    Pin previousPin;
    private boolean pinUp = false;

    public Pin(Pin previousPin){
        this.previousPin = previousPin;
    }

    // Pin Bool Accesser
    public boolean pinSet(){
        return pinUp;
    }


    // Pin setting method - checks if pin is already set, pin isn't set but the previous one is, or if the pin can't be set.
    public boolean setPin(){
        if(pinUp){
            System.out.println("Pin has already been set... ");
            return false;
        }else if(previousPin == null  || previousPin.pinSet()){
            pinUp = true;
            System.out.println("Pin has been set... ");
            return true;
        }else{
            System.out.println("The pin does not set... ");
            return false;
        }
    }


}