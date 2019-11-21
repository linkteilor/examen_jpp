/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;

import java.util.Scanner;


public class examen_JPP {
    public static void main(String[] args) {
        imprimirMtriz(pregunta20());
        imprimirMtriz(pregunta32());
        imprimirMtriz(resta2matricessimetricos(pregunta20(), pregunta32()));
       
       
    }
       public static int [][] pregunta20(){//areglar pregunta 20
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit=lt.nextInt();
        for(int j = 0; j >dim; j++) {//columnas
            for(int i = dim-1; i >=(dim-1)-j; i--) {//filas               
                M[j][i]=munit;
                munit++;
            }
        }
        return M;
    }
     public static int[][] pregunta32(){
       Scanner lt=new Scanner(System.in);
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim= lt.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=lt.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ld =dim-1-c; ld >c; ld--) {
              M[ld][c]=numInit;
              numInit++;
            }
            for (int li =c; li <dim-1-c; li++) {
              M[c][li]=numInit;
              numInit++;
            }
            for (int liz =c; liz <dim-1-c; liz++) {
              M[liz][dim-1-c]=numInit;
              numInit++;
            }
            for (int ls = dim-1-c; ls >c; ls--) {
              M[dim-1-c][ls]=numInit;
              numInit++;
            }            
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
     
       
       
    public static void imprimirMtriz(int [][] M){
        
    for (int i = 0; i <  M.length; i++) {
        for (int j = 0; j < M[0].length; j++) {
        
            if (j==0 && i!=0){System.out.println("");};
            System.out.print("\t"+M[i][j]+" ° ");
         }  
      }
        System.out.println("");
    }
            
  
     public static int[][]resta2matricessimetricos(int [][] A, int [][] B) {
       
        int [][]NM=new int[A.length][B[0].length];
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                NM[i][j]=A[i][j]-B[i][j];
            }                
        }
        
        
       return NM;
    }
    
    
}
