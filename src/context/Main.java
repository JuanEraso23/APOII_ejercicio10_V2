package context;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // Variables
        int num = 8;
        int multiplo = 0;

        String resultado = "";

        // Ciclo
        for (int i = 0; i <= 10; i++) {
            multiplo = (num * i);
            resultado += num + " x " + i + " = " + multiplo + "\n";
        }

        // Salida
        JOptionPane.showMessageDialog(
                null,
                "Tabla del " + num + "\n\n" + resultado
        );
    }
}