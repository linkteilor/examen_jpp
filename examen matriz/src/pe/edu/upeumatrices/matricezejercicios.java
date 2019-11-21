/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeumatrices;

import java.util.Scanner;


public class matricezejercicios {
    public static void main(String[] args) {
        
    }
     public static int [][] pregunta15(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit=lt.nextInt();
        for (int j = 0; j <dim; j++) {
            for (int i = dim-1; i >=0+j; i++) {               
                M[i][j]=munit;
                munit++;
            
            }
        }
        
        return M;
    }
    
}
