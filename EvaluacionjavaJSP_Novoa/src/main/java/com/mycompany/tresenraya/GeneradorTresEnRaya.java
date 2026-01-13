package com.mycompany.tresenraya;

import java.util.*;

public class GeneradorTresEnRaya {

    // Genera el tablero
    public static String[][] generarTablero() {
        List<String> fichas = new ArrayList<>();

        fichas.add("X");
        fichas.add("X");
        fichas.add("X");

        fichas.add("O");
        fichas.add("O");
        fichas.add("O");

        fichas.add("");
        fichas.add("");
        fichas.add("");

        Collections.shuffle(fichas);

        String[][] tablero = new String[3][3];
        int k = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = fichas.get(k++);
            }
        }

        return tablero;
    }

    // Muestra el tablero bonito
    public static void mostrarTablero(String[][] t) {
        System.out.println("\nTABLERO FINAL\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j].equals("")) {
                    System.out.print("[   ]");
                } else {
                    System.out.print("[ " + t[i][j] + " ]");
                }
            }
            System.out.println();
        }
    }
}
