/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeumatrices.PracticasdeMatrizJ_P;

import java.util.Scanner;



public class Matriz_JPP {
    public static void main(String[] args) {
        Scanner lt=new Scanner(System.in);
    
         //Ejemplo de Estructura Condicional Multiple
        //declarando variable nombreAlgoritmo
        String nombreAlgoritmo;
        //Leendo el nombre de algoritmo
        System.out.println("Seleccione las preguntas de la matriz\n ");
        nombreAlgoritmo=lt.nextLine();
        //Usando Estructura Condicional Multiple       
        switch(nombreAlgoritmo){
            case "1":{imprimirMtriz(pregunta1()); }break;
            case "2":{ imprimirMtriz(pregunta2()); }break;
            case "3":{ imprimirMtriz(pregunta3()); }break;
            case "4":{ imprimirMtriz(pregunta4()); }break;            
            case "5":{ imprimirMtriz(pregunta20()); }break;            
            case "6":{ imprimirMtriz(pregunta16()); }break;            
            case "7":{ imprimirMtriz(pregunta35()); }break;            
            default:{ System.out.println("Opcion no valida"); }

    }
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
    public static int [][] pregunta1(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base");
        int munit=lt.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <dim-i; j++) {
                M[i][j]=munit+(i+j)*(i+j+1)/2 + i;               
            }           
        }        
        return M;
    }
     public static int [][] pregunta2(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base");
        int munit=lt.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <dim-i; j++) {
                M[i][j]=munit+(i+j)*(i+j+1)/2 + j;                
            }  
        }  
        return M;
    }
    public static int[][] pregunta3(){
        Scanner lt=new Scanner(System.in);
        System.out.println("ingrese la dimension de la matriz");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.println("ingrese direcccion de base");
        int munit=lt.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {
                if ((i+j)%2==0) {
                    M [i][j]=munit+(i+j)*(i+j+1)/2+j;
                    
                } else {
                    M [i][j]=munit+(i+j)*(i+j+1)/2+i;
                }               
            }     
        }       
       return M;
    }
    public static int [][] pregunta4(){
        Scanner lt=new Scanner(System.in);
        System.out.println("ingresar la dimension de la matriz:");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.println("ingrese la direccionamiento de la base:");
        int munit=lt.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim-i; j++) {
                if (i+j%2==0) {
                    M[j][i]=munit+(i+j)*(i+j+1)/2+j;
                    
                } else {
                    M[j][i]=(i+j)*(i+j+1)/2+i;
                }                    
            }
            
        }
        
        return M;
    }
        public static int [][] pregunta5(){//coregir 
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base");
        int munit=lt.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <= i; j++) {               
                M[i][j]=munit;
                munit++;
            
            }
        }
        
        return M;
    }
        public static int [][] pregunta6(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base");
        int munit=lt.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <= i; j++) {               
                M[i][j]=munit;
                munit++;
            
            }
        }
        
        return M;
    }
          public static int [][] pregunta7(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base");
        int munit=lt.nextInt();
        for (int i = 0; i <dim; i++) {
            for (int j = 0; j <dim-i; j++) {               
                M[i][j]=munit;
                munit++;
            
            }
        }    
        return M;
    }
      public static int [][] pregunta8(){//areclar
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base");
        int munit=lt.nextInt();
        for (int i = 0; i <dim; i++) {
            for (int j = 0; j <dim-i; j++) {              
                      M[i][j]=munit;
                munit++;
            }
        }
        
        return M;
    }
          public static int [][] pregunta20(){//areglar pregunta 20
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit=lt.nextInt();
        for(int j =0; j <dim; j++) {//columnas
            for(int i = dim-1; i >=(dim-1)-j; i--) {//filas               
                M[j][i]=munit;
                munit++;
            }
        }
        
        return M;
    }  
      public static int [][] pregunta9(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit=lt.nextInt();
        for(int j = 0; j <dim; j++) {
            for(int i = dim-1; i >=0+j; i--) {               
                M[j][i]=munit;
                munit++;
            
            }
        }
        
        return M;
    }
    public static int[][] pregunta13(){
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese la Dimension de la Matriz:");
        int dim=lt.nextInt();
        int[][] M=new int[dim][dim];
        System.out.println("Ingrese el numero de Inicio:");
        int numInit=lt.nextInt();//dim=5 numInit=0
              for (int i = 0; i < dim; i++) {
                  for (int j = 0; j < dim-i; j++) {
                      if (i>=j) {
                          M[j][i]=numInit;
                          numInit++;
                          
                      } else {
                          M[j][i]=numInit++;
                          
                      }
                  }
                  
              }
        return M;
        }
     public static int [][] pregunta15(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim=lt.nextInt();
        int[][] M=new int[dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit=lt.nextInt();
        for (int j=0; j<dim; j++) {
            for (int i=dim-1; i>=0+j; i--) {               
                M[i][j]=munit;
                munit++;            
            }
        }
        
        return M;
    }
      public static int [][] pregunta16(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit=lt.nextInt();
        for(int j = 0; j <dim; j++) {//columnas
            for(int i = dim-1; i >=(dim-1)-j; i--) {//filas               
                M[i][j]=munit;
                munit++;
            }
        }
        
        return M;
    }
    public static int [][] preguntaj20(){//areglar pregunta 20
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit=lt.nextInt();
        for(int j = 0; j >dim-1; j--) {//columnas
            for(int i = dim; i <=(dim-1)-j; i++) {//filas               
                M[i][j]=munit;
                munit++;
            }
        }
        
        return M;
    }
    public static int [][] pregunta21(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit=lt.nextInt();
        for(int j = 0; j <dim; j++) {//columnas
            if (j%2==0) {
             for(int i = 0; i <dim; i++){
              M[i][j]=munit;
              munit++;}                       
            }else{
                 for(int i =dim-1; i >=0; i--) {//filas               
                M[i][j]=munit;
                munit++;}
          }       
         }
         return M;
        }
    public static int [][] pregunta24(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit=lt.nextInt();
        for(int j =dim-1; j >=0; j--) {//columnas
            if (j%2==0) {
             for(int i =dim-1; i>=0; i--){
              M[i][j]=munit;
              munit++;}                       
            }else{
                 for(int i = 0; i <dim; i++) {//filas               
                M[i][j]=munit;
                munit++;}
          }       
         }
         return M;
        }

   public static int [][] pregunta25(){
      Scanner lt=new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim=lt.nextInt();
        int [][]M=new int [dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit=lt.nextInt();
        for(int j = 0; j <dim; j++) {//columnas
            if (j%2==0) {
             for(int i = 0; i <dim; i++){
              M[j][i]=munit;
              munit++;}                       
            }else{
                 for(int i =dim-1; i >=0; i--) {//filas               
                M[j][i]=munit;
                munit++;}
          }       
         }
         return M;
        }
   public static int[][] pregunta30(){
       Scanner lt=new Scanner(System.in);
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim= lt.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=lt.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ld = c; ld < dim-1-c; ld++) {
              M[ld][dim-1-c]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {
              M[dim-1-c][li]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {
              M[liz][c]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {
              M[c][ls]=numInit;
              numInit++;
            }            
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }    
   public static int[][] pregunta31(){
       Scanner lt=new Scanner(System.in);
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim= lt.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=lt.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ld = c; ld <c; ld++) {
              M[ld][dim-1-c]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {
              M[dim-1-c][li]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {
              M[liz][c]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {
              M[c][ls]=numInit;
              numInit++;
            }            
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }
       public static int[][] pregunta33(){
       Scanner lt=new Scanner(System.in);
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim= lt.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=lt.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ld = dim-1-c; ld >c; ld--) {
              M[c][ld]=numInit;
              numInit++;
            }
            for (int li =c; li <dim-1-c; li++) {
              M[li][c]=numInit;
              numInit++;
            }
            for (int liz =c; liz <dim-1-c; liz++) {
              M[dim-1-c][liz]=numInit;
              numInit++;
            }
               for (int ls =dim-1-c; ls >c; ls--) {
              M[ls][dim-1-c]=numInit;
              numInit++;
            } 
                    
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    } 
       public static int[][] pregunta34(){
       Scanner lt=new Scanner(System.in);
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim= lt.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=lt.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int liz = c; liz < dim-1-c; liz++) {
              M[liz][c]=numInit;
              numInit++;
            }
            for (int li =c; li<dim-1-c; li++) {
              M[dim-1-c][li]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {
              M[liz][dim-1-c]=numInit;
              numInit++;
            }
            for (int ld =dim-1-c; ld >c; ld++) {
              M[c][ld]=numInit;
              numInit++;
            }            
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    }    
  public static int[][] pregunta35(){
       Scanner lt=new Scanner(System.in);
    System.out.println("Ingrese la Dimension de la Matriz:");
    int dim= lt.nextInt();
    int[][] M=new int[dim][dim];
    System.out.println("Ingrese el numero de Inicio:");
    int numInit=lt.nextInt();//dim=5 numInit=0
        for(int c=0;c<dim/2;c++){
            for (int ld = c; ld < dim-1-c; ld++) {
              M[dim-1-c][ld]=numInit;
              numInit++;
            }
            for (int li = dim-1-c; li >c; li--) {
              M[li][dim-1-c]=numInit;
              numInit++;
            }
            for (int liz = dim-1-c; liz >c; liz--) {
              M[c][liz]=numInit;
              numInit++;
            }
            for (int ls = c; ls <dim-1-c; ls++) {
              M[ls][c]=numInit;
              numInit++;
            }            
        }
        if(dim%2!=0){
            M[dim/2][dim/2]=numInit;
        }        
        return M;
    } 
    


    
}
