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
public class TrabajoGrupalMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración e inialización de variables
        Scanner leer = new Scanner(System.in);
        int n = 0, o = 0; boolean b = true;
        System.out.println("Ingrese el limite de la matriz");
        n = leer.nextInt();
        int A[][] = new int [n][n];
        
        //Llenar la matriz
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
		System.out.println("Ingrese el valor de A["+i+"]["+j+"]");
                    A[i][j] = leer.nextInt();
            }
        }
        //Presentamos la matriz
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
		System.out.print("["+A[i][j]+"] ");
            }
            System.out.println();
        }
        //Se pide al usuario que eliga que hacer con la matriz
        System.out.println("Seleccione que quiere hacer con la matriz: ");
        System.out.println("1. Colocar un 1 en los valores pertenecientes a la diagonal principal de la matriz");
        System.out.println("2. Colocar un 0 en los valores pertenecientes a la diagonal secundaria de la matriz");
        System.out.println("3. Colocar un -1 en los valores pertenecientes a las esquinas de la matriz");
        o = leer.nextInt();
        
        switch(o){
            case 1: //Remplazar la diagonal principal con 1
                for(int i = 0; i < n; i++){
                    A[i][i] = 1;
                }
            break;
            case 2: //Remplazar la diagonal secundaria con 0
                for(int i = 0; i < n; i++){
                    for(int j = 0; j < n; j++){
                        if((i + j) == (n - 1)){
                            A[i][j] = 0;
                        }
                    }
                }
            break;
            case 3: //Remplazar las esquinas con -1
                A[0][0] = -1;
                A[0][n - 1] = -1;
                A[n - 1][0] = -1;
                A[n - 1][n - 1] = -1;
            break;
            default:
                System.out.println("La opción que elegiste no existe");
                b = false;
            break;
        }
        //Presentamos el arreglo remplazado
        if(b == true){
            System.out.println("El arreglo de salida es:");
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print("["+A[i][j]+"] ");
                }
                System.out.println();
            }
        }
    }
    
}
