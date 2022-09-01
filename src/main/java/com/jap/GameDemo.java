package com.jap;

public class GameDemo {

    public String divideByNumber(int firstNumber, int secondNumber){
        //create local variable
        int finalNumber ;
        try {
            //write logic
             finalNumber = firstNumber/secondNumber;
            System.out.println("finalNumber1 = " + finalNumber);
            //Handle specific exception
        }catch (ArithmeticException exception){
          return exception.toString();
        }
        return String.valueOf(finalNumber);
    }


}
