/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeumatrices;

import java.util.Scanner;


public class MATRIZTransformadas {
    public static void imprimirMtriz(int [][] M){
        
    for (int i = 0; i <  M.length; i++) {
        for (int j = 0; j < M[0].length; j++) {
        
            if (j==0 && i!=0){System.out.print("");};
            System.out.print("\t"+M[i][j]+" ° ");
         }
    
      }
        System.out.println("");
    }

    public static int [][]transformada01(){
        Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimension de la matriz:");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese el numero de inicio");
        int numint=lt.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-1; j++) {// din-i para
                M[i][j]=numint+(i+j)*(i+j+1)/2 + i;
                
                
            }
            
        }
        
        
        return M;
    }
    
    public static void main(String[] args) {
        imprimirMtriz(transformada01());
        
    }
    
}
