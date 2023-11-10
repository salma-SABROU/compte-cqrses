package ma.enset.comptecqrses.commands_api.exception;

public class AmountNegativeException extends RuntimeException{
    public AmountNegativeException(String msg){
        super(msg);
    }
}
