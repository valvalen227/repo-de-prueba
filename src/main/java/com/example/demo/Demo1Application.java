package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
        // Generar y mostrar la lista de 100 números aleatorios
        int[] numeros = generarNumerosAleatorios(100);
        System.out.println("Lista original:");
        mostrarArray(numeros);
        // Ordenar usando burbuja
        burbuja(numeros);
        System.out.println("Lista ordenada:");
        mostrarArray(numeros);
    }

    // Método para generar un array de n números aleatorios entre 0 y 999
    public static int[] generarNumerosAleatorios(int n) {
        int[] arr = new int[n];
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1000);
        }
        return arr;
    }

    // Método para ordenar un array usando el algoritmo burbuja
    public static void burbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Método para mostrar el array
    public static void mostrarArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
