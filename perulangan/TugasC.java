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
public class TugasC {
    public static void main(String[] args) {
        int sum=0;
        float average;
        Scanner dataInput=new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya data nilai = ");
        int dataLength=dataInput.nextInt();
        int data[]=new int[dataLength];
        
        //input
        for(int i =0;i <dataLength;i++){
            System.out.print("Masukkan data nilai ke-"+(i+1)+"=");
            data[i]=dataInput.nextInt();
        }
        System.out.print("");
        
        //minimum value
        int dataMax=data[0];
        int dataMin=data[0];
        for (int i =0;i< dataLength;i++){
            if(data[i]>dataMax){
                dataMax=data[i];
            }
            if (data[i]<dataMin){
                dataMin=data[i];
            }
        }
        System.out.println("Nilai minimum = "+dataMin);
        System.out.println("Nilai maximum = "+dataMax);
        
        //average
        for(int i = 0;i < dataLength;i++){
            sum +=data[i];
        }
        average = sum/dataLength;
        System.out.println("Nilai rata ratanya adalah ="+average);
        
        
    }
}

