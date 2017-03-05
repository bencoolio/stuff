package tme3;


// A custom exceptino class, thrown when the inner classes WindowMalfunction
// and PowerOut, of GreenhouseControls, have their 'action()' method used.
public class ControllerException extends Exception{
    public ControllerException(String message){
        super(message);
    }
    public String getMessage(){
        return super.getMessage();
    }
}