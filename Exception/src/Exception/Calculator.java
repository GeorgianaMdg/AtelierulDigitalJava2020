package Exception;

import java.io.UncheckedIOException;

public class Calculator {
    private int calc(int i) throws CheckedException{
        if(i<0){
           CheckedException e = new CheckedException("the input value is too small");
            throw e;
        }
        return 10/i;
    }
    public int evaluate(int input) {
        try {
            return input + calc(input);
        } catch (CheckedException e){
            if(input==3){
                UncheckedException ex = new UncheckedException("Input is -3");
                throw ex;
            }
            return input+20;
        }
    }

}
