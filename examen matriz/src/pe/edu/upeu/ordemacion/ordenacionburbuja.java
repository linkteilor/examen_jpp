/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.ordemacion;

import jdk.nashorn.internal.parser.JSONParser;


public class ordenacionburbuja {
    public static void main(String[] args) {
        int[] vector={9,2,8,3,10,6};
        int temp = 0;
        int posicionp=0;
        for (int i = 1; i < vector.length; i++) {
            temp=vector[i];
            posicionp=i;
              while (posicionp>0 && temp<vector[posicionp-1]) {                
                vector[posicionp]=vector[posicionp-1];
                posicionp--;
            }
              vector[posicionp]=temp;           
        }
        System.out.println("\n");
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
            
        }
   }
    
}
