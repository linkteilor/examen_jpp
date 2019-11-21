/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.ordemacion;

/**
 *
 * @author Laboratorio 7
 */
public class AlgoritmoOrdenacion {
    public static void main(String[] args) {
        //algoritmos de ordenacion por insercion directa
        int[] vector={3,4,1,6,8,2};
        //variable temporal
        int temp=0, posicionp=0;
        //vector.length(es para sabe la posicion de los vectores de la variable declarada)
        for (int i = 1; i < vector.length; i++) {
            //almacenado las posiciones
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
