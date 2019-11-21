/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeumatrices;

import java.util.Scanner;

/**
 *
 * @author Laboratorio 7
 */
public class de_c_a_java {

    public static void main(String[] args) {
        //imprimirMtriz(pregunta2());
        // imprimirMtriz(pregunta3());
        // imprimirMtriz(pregunta4());
        //  imprimirMtriz(pregunta5());
        //imprimirMtriz(pregunta15());
        //imprimirMtriz(pregunta11());
        //imprimirMtriz(pregunta16());
        //imprimirMtriz(pregunta21());
        //imprimirMtriz(pregunta23());
       //imprimirMtriz(pregunta30());
        imprimirMtriz(pregunta34());
    }

    public static void imprimirMtriz(int[][] M) {

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {

                if (j == 0 && i != 0) {
                    System.out.println("");
                };
                System.out.print("\t" + M[i][j] + " ° ");
            }

        }
        System.out.println("");
    }
    public static int[][] pregunta2() {
        Scanner lt = new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz ");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.print("ingrese direccionando base");
        int munit = lt.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim - i; j++) {
                M[i][j] = munit + (i + j) * (i + j + 1) / 2 + j;

            }

        }

        return M;
    }
    public static int[][] pregunta3() {
        Scanner lt = new Scanner(System.in);
        System.out.println("ingrese la dimension de la matriz");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.println("ingrese direcccion de base");
        int munit = lt.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim - i; j++) {
                if ((i + j) % 2 == 0) {
                    M[i][j] = munit + (i + j) * (i + j + 1) / 2 + j;

                } else {
                    M[i][j] = munit + (i + j) * (i + j + 1) / 2 + i;
                }

            }

        }
        return M;
    }
    public static int[][] pregunta4() {
        Scanner lt = new Scanner(System.in);
        System.out.println("ingresar la dimension de la matriz:");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.println("ingrese la direccionamiento de la base:");
        int munit = lt.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim - i; j++) {
                if (i + j % 2 == 0) {
                    M[j][i] = munit + (i + j) * (i + j + 1) / 2 + j;

                } else {
                    M[j][i] = (i + j) * (i + j + 1) / 2 + i;
                }
            }

        }

        return M;
    }
    public static int[][] pregunta5() {
        Scanner lt = new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz ");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.print("ingrese direccionando base");
        int munit = lt.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <= i; j++) {
                M[i][j] = munit;
                munit++;

            }
        }

        return M;
    }
    public static int[][] pregunta6() {
        Scanner lt = new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz ");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.print("ingrese direccionando base");
        int munit = lt.nextInt();
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j <= dim - i; j++) {
                M[i][j] = munit;
                munit++;

            }
        }

        return M;
    }
    public static int[][] pregunta15() {
        Scanner lt = new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit = lt.nextInt();
        for (int j = 0; j < dim; j++) {
            for (int i = dim - 1; i >= 0 + j; i--) {
                M[i][j] = munit;
                munit++;
            }
        }

        return M;
    }
    public static int[][] pregunta11() {
        Scanner lt = new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit = lt.nextInt();
        for (int j = 0; j < dim; j++) {
            for (int i = dim - 1; i >= 0 + j; i--) {
                M[j][i] = munit;
                munit++;

            }
        }

        return M;
    }
    public static int[][] pregunta16() {
        Scanner lt = new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit = lt.nextInt();
        for (int j = 0; j < dim; j++) {//columnas
            for (int i = dim - 1; i >= (dim - 1) - j; i--) {//filas               
                M[i][j] = munit;
                munit++;
            }
        }

        return M;
    }
    public static int[][] pregunta20() {
        Scanner lt = new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit = lt.nextInt();
        for (int j = 0; j > dim - 1; j++) {//columnas
            for (int i = dim; i <= (dim - 1) - j; i--) {//filas               
                M[j][i] = munit;
                munit++;
            }
        }

        return M;
    }
    public static int[][] pregunta21() {
        Scanner lt = new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit = lt.nextInt();
        for (int j = 0; j < dim; j++) {//columnas
            if (j % 2 == 0) {
                for (int i = 0; i < dim; i++) {
                    M[i][j] = munit;
                    munit++;
                }
            } else {
                for (int i = dim - 1; i >= 0; i--) {//filas               
                    M[i][j] = munit;
                    munit++;
                }
            }
        }
        return M;
    }
    public static int[][] pregunta25() {
        Scanner lt = new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit = lt.nextInt();
        for (int j = 0; j < dim; j++) {//columnas
            if (j % 2 == 0) {
                for (int i = 0; i < dim; i++) {
                    M[j][i] = munit;
                    munit++;
                }
            } else {
                for (int i = dim - 1; i >= 0; i--) {//filas               
                    M[j][i] = munit;
                    munit++;
                }
            }
        }
        return M;
    }
    public static int[][] pregunta23() {
        Scanner lt = new Scanner(System.in);
        System.out.print("ingrese la dimencion de la matriz: ");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.print("ingrese direccionando base:");
        int munit = lt.nextInt();
        for (int j = dim - 1; j >= 0; j--) {//columnas
            if (j % 2 == 0) {
                for (int i = dim - 1; i >= 0; i--) {
                    M[i][j] = munit;
                    munit++;
                }
            } else {
                for (int i = 0; i < dim; i++) {//filas               
                    M[i][j] = munit;
                    munit++;
                }
            }
        }
        return M;
    }
    public static int[][] pregunta30() {
        Scanner lt = new Scanner(System.in);
        System.out.println("ingrese la dimension de la matriz");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.println("ingrese la la direccion de la base");
        int munit = lt.nextInt();
        for (int c = 0; c < dim / 2; c++) {//la cantidad de vueltas
            for (int li = c;li<dim-1-c;li++) {//va de arriba a abajo
                M[li][dim-1-c] = munit;
                munit++;
            }
            for (int li = dim-1-c; li > c; li--) {//va de arriba a abajo
                M[dim - 1 - c][li] = munit;
                munit++;
            }
            for (int liz = dim - 1 - c; liz > c; liz--) {
                M[liz][c] = munit;
                munit++;
            }
            for (int ls = c; ls < dim - 1 - c; ls++) {
                M[c][ls] = munit;
                munit++;
            }
        }
        if (dim % 2 != 0) {
            M[dim / 2][dim / 2] = munit;
        }
        return M;

    }

    public static int[][] pregunta34() {
        Scanner lt = new Scanner(System.in);
        System.out.println("ingrese la dimension de la matriz");
        int dim = lt.nextInt();
        int[][] M = new int[dim][dim];
        System.out.println("ingrese la la direccion de la base");
        int munit = lt.nextInt();
        for (int c = 0; c < dim / 2; c++) {
            for (int li = c; li<dim-1-c; li++) {
                M[li][c] = munit;
                munit++;
            }
            for (int dz =c;dz <dim-1-c; dz++) {
                M[dim-1-c][dz] = munit;
                munit++;

            }  
              for (int ld = c;ld < dim-1-c; ld--) {
                M[dim-1-c][ld] = munit;
                munit++;
            }
            for (int ls =c; ls < dim-1-c; ls--) {

            }
            if (dim % 2 != 0) {
                M[dim / 2][dim / 2] = munit;
            }
        }
        return M;
    }

}
