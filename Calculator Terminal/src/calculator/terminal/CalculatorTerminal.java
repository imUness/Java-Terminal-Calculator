/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator.terminal;

import java.util.Scanner;

/**
 *
 * @author youness.elakri
 */
public class CalculatorTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Wellcom in JTC - Java terminal Calculator");
 System.out.println("");

Scanner Sinput = new Scanner(System.in);
System.out.print("Enter the equation:");
String input = Sinput.nextLine();

String[] got = input.split("[\\-\\+\\*/]");

if (got.length != 2){
    System.out.println("Invalid formart!");
    return;
}
           double F = Double.parseDouble(got[0]);
           double S = Double.parseDouble(got[1]);
           double R =0;
           char X = input.charAt(got[0].length());
           
        switch (X) {
            case '+' -> R = F + S;
            case '-' -> R = F - S;
            case '*' -> R = F * S;
            case '/' -> R = F / S;
        }
        
        System.out.println("Result: " + R);
        
    
  
    
} 
}
