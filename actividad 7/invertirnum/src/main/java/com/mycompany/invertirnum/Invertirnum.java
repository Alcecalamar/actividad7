/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.invertirnum;

import java.util.Scanner;

/**
 *
 * @author cabal
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cabal
 */
public class Invertirnum {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int numer = 8; 
        int[] numeros = new int[numer];
        int[] invertido = new int[numer];
        for (int idx = 0; idx < numeros.length; idx++) {
            System.out.print("Agrega los datos a la lista para invertir al final: ");
            numeros[idx] = num.nextInt();
        }
        for (int idx = 0; idx < numeros.length; idx++) {
            invertido[idx] = numeros[numeros.length - 1 - idx];
        }
        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array invertido: " + Arrays.toString(invertido));
    }
}

