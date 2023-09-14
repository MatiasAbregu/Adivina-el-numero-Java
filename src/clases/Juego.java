package clases;

import javax.swing.*;

/**
 * @author Matias
 */
public class Juego {

    private int seleccion;
    private boolean bandera = false;

    public Juego() {

        JOptionPane.showMessageDialog(null, "Bienvenido a ¡Adivina el número!");
        JOptionPane.showMessageDialog(null, "A continuación se mostraran 2 opciones.");

        while (bandera == false) {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("Por favor selecciona una de las siguientes opciones: " + "\n 1. Jugar" + "\n 2. Salir"));

            switch (seleccion) {
                case 1:
                    Jugar();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "¡Gracias por jugar!");
                    bandera = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor seleccione una de las opciones existentes, gracias.");
                    break;
            }
        }
    }

    public void Jugar() {

        JOptionPane.showMessageDialog(null, "Voy a pensar en un número y tú lo tienes que adivinar." + "\nEl número será del 1 al 100");
        JOptionPane.showMessageDialog(null, "Aquí vamos...");

        int numeroS = (int) Math.round(Math.random() * 100), numeroD = 0;
        String respuesta = "";
        boolean bandera = false, bandera2 = false;

        //System.out.println(numeroS);

        while (bandera == false) {
            
            while (respuesta.equals("") || respuesta.contains("-")) { //Comienzo de While
                
                respuesta = JOptionPane.showInputDialog("Dime que número crees que es: " + "\nRecuerda que el número es del 1 al 100");
                respuesta = respuesta.toUpperCase();
                
                if (respuesta.equals("") || respuesta.contains("-") || respuesta.contains("A") || respuesta.contains("B") || respuesta.contains("C") || respuesta.contains("D") || respuesta.contains("E") || respuesta.contains("F") || respuesta.contains("G") || respuesta.contains("H") || respuesta.contains("I")
                        || respuesta.contains("J") || respuesta.contains("K") || respuesta.contains("L") || respuesta.contains("M") || respuesta.contains("N") || respuesta.contains("Ñ") || respuesta.contains("O") || respuesta.contains("P") || respuesta.contains("Q") || respuesta.contains("R") || respuesta.contains("S")
                        || respuesta.contains("T") || respuesta.contains("U") || respuesta.contains("V") || respuesta.contains("W") || respuesta.contains("X") || respuesta.contains("Y") || respuesta.contains("Z")) {
                    JOptionPane.showMessageDialog(null, "¡Por favor, introduce un número o introduce un número valido, no me rompas el programa :D!");
                    respuesta = "";
                } else {
                    numeroD = Integer.parseInt(respuesta);
                }
                
            } // Cierre de While
            
            if (numeroD == numeroS) {
                JOptionPane.showMessageDialog(null, "¡Correcto! Adivinaste. Has ganado a una maquina, sorprendente");
                bandera = true;
            } else {
                JOptionPane.showMessageDialog(null, "No, ese no es el número en el que pensé");
                bandera2 = false;
                
                while (bandera2 == false) {
                    respuesta = JOptionPane.showInputDialog(null, "¿Quieres seguir intentando adivinar?" + "\nSi" + "\nNo");
                    respuesta = respuesta.toUpperCase();

                    if (respuesta.equals("SI") || respuesta.equals("S") || respuesta.equals("I")) {
                        //Ejecuta nuevamente lo de arriba, para intentar adivinar de nuevo el número         
                        respuesta = "";
                        bandera2 = true;
                    } else if (respuesta.contains("0") || respuesta.contains("1") || respuesta.contains("2") || respuesta.contains("3") || respuesta.contains("4") || respuesta.contains("5") || respuesta.contains("6") || respuesta.contains("7") || respuesta.contains("8") || respuesta.contains("9") || respuesta.contains("-")) {
                        JOptionPane.showMessageDialog(null, "¡¡Números NO!!");
                    } else {
                        JOptionPane.showMessageDialog(null, "¡Pues vaya lastima :(!");
                        bandera = true;
                        bandera2 = true;
                    }
                }
            }
            
        }
    }

    public static void main(String args[]) {
        Juego panel = new Juego();
    }

}
