/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajogrupalmatrices;
import java.util.Scanner;
/**
 *
 * @author adria
 */
public class MultiplicacionMatrices {
    public static void main(String[] args) {
        //Dealaracion e inializacion de variables
        Scanner leer = new Scanner(System.in);
        int nA = 0, mA = 0, nB = 0, mB = 0;
        System.out.println("Escriba numero de filas de la matriz A");
        nA = leer.nextInt();
        System.out.println("Escriba numero de columnas de la matriz A");
        mA = leer.nextInt();
        System.out.println("Escriba numero de filas de la matriz A");
        nB = leer.nextInt();
        System.out.println("Escriba numero de columnas de la matriz A");
        mB = leer.nextInt();
        int A [][] = new int[nA][mA];
        int B [][] = new int[nB][mB];
        //Ingreso de matrices
        System.out.println("Ingrese la Matriz A");
        for(int i = 0; i < nA; i++){
            for(int j = 0; j < mA; j++){
		System.out.print("Ingrese el valor de A["+i+"]["+j+"] = ");
                A[i][j] = leer.nextInt();
            }
        }
        System.out.println("Ingrese la Matriz B");
        for(int i = 0; i < nB; i++){
            for(int j = 0; j < mB; j++){
		System.out.print("Ingrese el valor de B["+i+"]["+j+"] = ");
                B[i][j] = leer.nextInt();
            }
        }
        //Presentamos la matriz
        System.out.println("Matriz A");
        for(int i = 0; i < nA; i++){
            for(int j = 0; j < mA; j++){
		System.out.print("["+A[i][j]+"] ");
            }
            System.out.println();
        }
        System.out.println("Matriz B");
        for(int i = 0; i < nB; i++){
            for(int j = 0; j < mB; j++){
		System.out.print("["+B[i][j]+"] ");
            }
            System.out.println();
        }

        if(mA != nB){//control de error
            System.out.println("Error: no se pueden multiplicar las matrices");
        }else{
            int C [][] = new int[nA][mB];
            for(int i = 0; i < nA;i++){
                for(int j = 0; j < mB;j++){
                    for(int k = 0; k < mA;k++){
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }//salida
            System.out.println("El arreglo de salida es:");
            for(int i = 0; i < nA; i++){
                for(int j = 0; j < mB; j++){
                    System.out.print("["+C[i][j]+"] ");
                }
                System.out.println();
            }
        }
    }
}
