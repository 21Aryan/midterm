/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * date 07/05/21
 */
public class ArithmeticBase 
{

     enum Operation {
        Addition, Subtraction, Multiply, Divide
    }

    public int calculate(Operation operation, int a, int b) {
        switch (operation) {
            case Addition:
                return addition(a, b);
            case Subtraction:
                return subtraction(a, b);
               
            case Multiply:
                    return Multiply(a, b);
                
                case Divide:
                     return Divide(a, b);   
                
                
                
        }

        throw new RuntimeException("Unsupported exception");
    }

    private int addition(int a, int b) {
        return a + b;
    }

    private int subtraction(int a, int b) {
        return a - b;
    }

     private int multiply(int a, int b) {
        return a * b;
    }
    
     private int divide(int a, int b) {
        return a / b;
    }
    
    
    
}