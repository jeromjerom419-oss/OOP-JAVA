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
public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner  (System. in);
        
        System.out.println("Input the number of minutes");
        
        double min = input.nextDouble();
        
        //Convert minutes into year and days 
        double minutesInYear = 60* 24 * 365;
        
        long years = (long) (min / minutesInYear);
         int days = (int) (min /60 / 24) %365;
         
         System.out.println((int) min + "minutes is approximately " + years + " years and " + days + " days ");
         
         
        
        
    }
    
} 
