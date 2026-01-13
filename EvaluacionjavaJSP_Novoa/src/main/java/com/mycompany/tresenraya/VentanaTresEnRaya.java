package com.mycompany.tresenraya;

import javax.swing.*;
import java.awt.*;

public class VentanaTresEnRaya extends JFrame {

    private JButton[] botones = new JButton[9];

    public VentanaTresEnRaya() {
        setTitle("Tres en Raya");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            botones[i] = new JButton("");
            botones[i].setFont(new Font("Arial", Font.BOLD, 40));
            add(botones[i]);
        }

        cargarTablero();
    }

    private void cargarTablero() {
        String[][] tablero = GeneradorTresEnRaya.generarTablero();

        int k = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                botones[k].setText(tablero[i][j]);
                k++;
            }
        }
    }
}


