package Exception;

public class CheckedException extends Exception{
    public CheckedException(String description){
        super("Checked "+ description);
    }

}
