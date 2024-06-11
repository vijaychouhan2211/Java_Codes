package com.mycompany.customexception;

class MyCheckedException extends Exception {
    public MyCheckedException(String s){
        super(s);
    }
}
class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String s){
        super(s);
    }
}
public class CustomException {
    public static void main(String[] args) {
        try {
            throw new MyCheckedException("\nThrow Checked Exception.....");//throw is used when the user create Exception 
        }
        catch (MyCheckedException e) {
            System.out.println("Caught Checked Exception... " + e.getLocalizedMessage());
        }
        try {
            throw new MyUncheckedException("\nThrow Unchecked Exception....");
        }
        catch (MyUncheckedException e) {
            System.out.println("Caught Unchecked Exception..." + e.getMessage());
        }
    }
}
