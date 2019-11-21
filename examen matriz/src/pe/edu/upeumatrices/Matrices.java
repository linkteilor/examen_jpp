/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeumatrices;

import java.io.InputStream;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;
import pe.edu.upeu.subprogramas.LeerTeclado;

/**
 *
 * @author Laboratorio 7
 */
public class Matrices {
    public static void main(String[] args) {
        imprimirMtriz(suma2matricessimetricos(rellegarMatriz(2, 2),rellegarMatriz(2, 2)));
        
    }
    public static int[][]suma2matricessimetricos(int [][] A, int [][] B) {
       
        int [][]NM=new int[A.length][B[0].length];
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                NM[i][j]=A[i][j]-B[i][j];
            }                
        }
        
       return NM;
    }
    public static int [][] rellegarMatriz(int X,int Y ){
        int [][]M=new int [X][Y];
        Scanner lt=new Scanner(System.in);
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                System.out.println("ingrese su valor de M["+i+"] ["+j+"]=");
                M[i][Y]=lt.nextInt();
                
            }
            
        }
       return M;
    }    
    
    public static void imprimirMtriz(int [][] M){
        
    for (int i = 0; i <  M.length; i++) {
        for (int j = 0; j < M[0].length; j++) {
        
            if (j==0 && i!=0){System.out.println(" ");};
            System.out.println(M[i][j]+" # ");
         }
    
      }
        System.out.println(" ");
    }
    

    
    public static void sumadematriz() {
        
        //forma de hacer una matris
        int[][] M={{2,2,2,2},{4,4,4,4},{5,5,5,5},{7,7,7,7},{6,6,6,6},{3,3,3,3}};
        int [][]MX=new int[6][4];
        int [][]MY;
        //tamaño de la fila: M.lengths, tamaño de ña columna:M[0].length
        int sumNum=0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                 
                //% modulo o mod coje el resto
                if(M[i][j]%3==0){
                sumNum=sumNum+M[i][j];
            };
                System.out.println("suma"+sumNum);
                
            }
            
        }
        
    }

  
    
}
