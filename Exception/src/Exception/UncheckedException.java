package Exception;

public class UncheckedException extends RuntimeException{
    public UncheckedException(String description){
        super("Unchecked "+ description);
}
