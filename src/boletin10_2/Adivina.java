package boletin10_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class Adivina {
    private static int numero;
    private static int resp;
    private static String respuesta;

    public static void darNumero() {
        numero = (int) Math.floor(Math.random() * 50 + 1);
        respuesta = JOptionPane.showInputDialog("Adivina el numero:");
        resp = Integer.parseInt(respuesta);
    }

    public static void acertar() {
        while(resp!=numero){
                if (numero - resp > 20 || resp - numero > 20) {
            respuesta = JOptionPane.showInputDialog("Moi lexos");
            resp = Integer.parseInt(respuesta);
                }
                
               else if (numero - resp >= 10 && numero - resp <= 20 || resp - numero >= 10 && resp - numero <= 20) {
            respuesta = JOptionPane.showInputDialog("Lexos");
            resp = Integer.parseInt(respuesta);
                }
               
               else if (numero - resp > 5 && numero - resp < 10 || resp - numero > 5 && resp - numero < 10) {
            respuesta = JOptionPane.showInputDialog("Preto.");
            resp = Integer.parseInt(respuesta);
                }
               
               else if (numero - resp <= 5) {
            respuesta = JOptionPane.showInputDialog("Mooooi preto");
            resp = Integer.parseInt(respuesta);
                }
        }
        JOptionPane.showMessageDialog(null,"HAS ACERTADO!");

    }}
