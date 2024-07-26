/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mayormenor;

/**
 *
 * @author cabal
 */
import java.util.Arrays;
import java.util.Scanner;
public class Mayormenor {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numer = 8; 
        int[] numeros = new int[numer];

        for (int idx = 0; idx < numeros.length; idx++) {
            System.out.print("agrega los los datos a loa lista para comparalos al final ");
            numeros[idx] = num.nextInt();
            num.nextLine();
        }

        System.out.println("Impresión del Array: " + Arrays.toString(numeros));

        num.close();
        int menor = numeros[0];
        for (int idx = 0; idx < numeros.length; idx++) {
            if(numeros[idx]< menor){
                menor = numeros[idx];
            }}
        int mayor = numeros[0];
        
        for (int idx = 0; idx < numeros.length; idx++) {
            if(numeros[idx]>mayor){
                mayor = numeros[idx];
            }
        }
        System.out.println("El numero mayor es "+ mayor + "el numero menor es "+menor );
    }
}
        
        