package com.mycompany.exceptiondemo;

//Exception Handling in Try Catch Block with some of the exceptions

public class ExceptionDemo {
    public static void main(String[] args) {
        int arr[] = {1 ,0 ,5 ,6 ,5};
        String str = null;
        String str1 = "abc";
        System.out.println("a =" + arr[4] + " || b =" + arr[1]);
        try {
            int a = (arr[4]/arr[1]);
        }
        catch (ArithmeticException e) {       //ArithmeticException
            System.out.println(e);
        }
        try{
            System.out.println("Array index at 5: " + arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {        //ArrayIndexOutOfBoundsException
            System.out.println(e);
        }
        try{
            System.out.println(str.length() + " | " +Integer.valueOf(str1));
        }
        catch (NullPointerException | NumberFormatException e) {       //NumberFormatException
            System.out.println(e);   
        }
        finally {
            System.out.println("Finally Block....");
        }
        
    }
}
