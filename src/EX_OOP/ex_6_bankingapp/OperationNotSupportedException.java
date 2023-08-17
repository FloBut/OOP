package EX_OOP.ex_6_bankingapp;

public class OperationNotSupportedException extends Exception{

    public OperationNotSupportedException(String message) {
        super(message);
    }
}
