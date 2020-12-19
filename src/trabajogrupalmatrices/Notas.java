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
public class Notas {
    public static void main(String[] args) {
        //Declaración e inialización de variables
        Scanner leer = new Scanner(System.in);
        int n = 0, p = 0;
        double promedio = 0;
        
        //Ingreso de Datos
        System.out.print("Escriba el número de los estudiantes: ");
        n = leer.nextInt();
        String NAMES [] = new String [n];
        System.out.print("Escriba la cantidad de notas que desea ingresar: ");
        p = leer.nextInt(); p++; System.out.println();
        double NOTAS[][] = new double [n][p];
        
        //Ingreso de nombres
        for(int i = 0;i < n;i++){
            System.out.print("Ingrese el nombre del estudiate #"+(i+1)+": ");
            NAMES[i] = leer.next();
        }System.out.println();
        
        //Ingreso de notas
        for(int i = 0;i < n;i++){
            System.out.println("Ingrese las notas del estudiante "+NAMES[i]);
            for(int j = 0;j < (p - 1);j++){
                System.out.print("Ingrese la nota "+(j+1)+": ");
                NOTAS[i][j] = leer.nextDouble();
            }
            System.out.println();
        }
        //Se saca el promedio de los estudiantes
        for(int i = 0;i < n;i++){
            for(int j = 0;j < (p - 1);j++){
                promedio = promedio + NOTAS[i][j];
            }
            NOTAS[i][p - 1] = promedio / (p - 1);
            promedio = 0;
        }
        //Se muestran las notas de los estudiantes
        for(int i = 0;i < n;i++){
            System.out.print(NAMES[i]+": ");
            for(int j = 0;j < (p - 1);j++){
                System.out.print("Nota #"+(j+1)+": "+NOTAS[i][j]+"  ");
            }
            System.out.print("Promedio: "+NOTAS[i][p-1]+"\n");
        }
    }
}
