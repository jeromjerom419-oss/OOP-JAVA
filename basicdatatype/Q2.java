/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicdatatype;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Input a value for inches: ");
        
        double inches = input.nextDouble();
        
        //Convert inches to meters
        double meters = inches * 0.0254;
        System.out.println(inches + " inches is "+ meters +" meters ");
    }
    
}
