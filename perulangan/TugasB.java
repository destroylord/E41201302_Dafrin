/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

import java.util.Scanner;

/**
 *
 * @author nizam
 */
public class TugasB {
    public static void main(String[] args) {
        //Case 1 Perkalian 2
        int number = 2;
        System.out.println("        Do_While");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        System.out.print("  "+ number +"");
        do{
            number *=2;
            if(number > 100){
                break;
            }
            System.out.println(number+"");
        }while (number < 100);
        System.out.println("");
        
        System.out.println("----------------------------");
        
        //Case 2 kelipatan 2
        int bil;
        
        System.out.println("          case 2");
        System.out.println("    kelipatan 2 (1-100)");
        System.out.println("==========================");
        for(bil=2;bil<=100;bil++)
            if(bil%2==0)
                System.out.println(" " + bil + " ");
    }
    }
