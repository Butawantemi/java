import java.util.*;


public class ExceptionExample1 {
    public void validatePinCode(int pinCode) throws InvalidPinCodeException {
        if (!(pinCode >= 100000 || pinCode <= 999999)) {
            throw new InvalidPinCodeException("Pin code must be a 6-digits number");
        }
        System.out.println(pinCode);
    
    }

    public static void main(String[] args) throws InvalidPinCodeException {
        ExceptionExample1 obj = new ExceptionExample1();
        obj.validatePinCode(123334);
    }
}
