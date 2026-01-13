import java.util.ArrayList;
import java.util.Collections;

public class TresEnRaya {

    public static void main(String[] args) {

        ArrayList<String> fichas = new ArrayList<>();

        // 3 X, 3 O y 3 espacios
        for (int i = 0; i < 3; i++) {
            fichas.add("X");
            fichas.add("O");
            fichas.add(" ");
        }

        // Mezclar aleatoriamente
        Collections.shuffle(fichas);

        // Crear tablero
        String[][] tablero = new String[3][3];

        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = fichas.get(index);
                index++;
            }
        }

        // Mostrar tablero
        System.out.println("PARTIDA FINALIZADA - TRES EN RAYA\n");

        for (int i = 0; i < 3; i++) {
            System.out.println(" " + tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2]);
            if (i < 2) {
                System.out.println("---+---+---");
            }
        }
    }
}

