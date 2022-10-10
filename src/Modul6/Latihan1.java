/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul6;

/**
 *
 * @author HP Folio 1040
 */

import java.io.*;

public class Latihan1 {
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(
                new InputStreamReader(System.in));
        
        int nilai1 = 0;
        int nilai2 = 0;
        int nilai3 = 0;
        double rata = 0;
        
        System.out.print("Nilai 1 = ");
        nilai1 = Integer.parseInt(in.readLine());
        
        System.out.print("Nilai 2 = ");
        nilai2 = Integer.parseInt(in.readLine());
        
        System.out.print("Nilai 3 = ");
        nilai3 = Integer.parseInt(in.readLine());
        
        rata = (nilai1 + nilai2 + nilai3)/3;
        
        System.out.println("Rata-rata = "+rata);
        
        if(rata >= 60){
            System.out.println(":-)");
        }else{
            System.out.println(":-(");
        }
    }
}
