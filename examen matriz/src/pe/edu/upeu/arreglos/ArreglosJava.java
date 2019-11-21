/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.arreglos;

import pe.edu.upeu.subprogramas.LeerTeclado;

/**
 *
 * @author Laboratorio 7
 */
public class ArreglosJava {
    
    public int[] rellenarVector(int x){
        LeerTeclado lt=new LeerTeclado();
        int[] vector=new int[x];
        for (int i = 0; i < vector.length; i++) {
        vector[i]=lt.leer(0,"Ingrese valor en el indice "+i+" :");
        }
        imprimirVect(vector);
        return vector;
    }
    public void imprimirVect(int[] x){
        for (int i = 0; i < x.length; i++) {
            System.out.println("");
            System.out.println(x[i]);
        }
    }    
    
    public int sumaVector(int[] num1){
    int sum=0;    
        for (int x = 0; x < num1.length; x++) {
            sum=sum+num1[x];
        }
        return sum;
    }
    public int sumadevectores(int [] num1){
        
        int suma=0;
        for (int x = 0; x < num1.length; x++) {
            if(num1[x]%2!=0){
            suma=suma+num1[x];
            }       
        }
        
        return suma;    
}
    
    public void numerospareseimpares(int [] num1){  
        int par=0;
        int impar=0;
        
        for (int x = 0; x < num1.length; x++) {
            if(num1[x]%2!=0){
                impar++;              
        }else{
               par++;
            }           
        }
        System.out.println("los numeros impares:"+impar+"\n numeros pares:"+par);
        
        
    }
    
    public static void main(String[] args) {
        ArreglosJava aj=new ArreglosJava();
        //aj.rellenarVector(5); 
              
        
        int[] num1={1,2,5,7,9,0};
        System.out.println("Resultado:"+aj.sumaVector(num1));
        
        char[] valc={'*','R','1','/','P'};
        double[] vald={1.2,2.5,5.2,7.9,9.2,0.3};
        boolean[] bool={false, true, false};
        String[] cadena={"Juan","Pedro", "Raul", "Daniel"};
        Object[] todo={'*',"Juan", 8, 3.5, false };
         
        aj.numerospareseimpares(num1);
        
        int[] numX=new int[8];
        numX[0]=87;
        numX[1]=8;
        numX[2]=7;
        System.out.println("Dato:"+numX[0]);
        
        
        
        
    }
}
