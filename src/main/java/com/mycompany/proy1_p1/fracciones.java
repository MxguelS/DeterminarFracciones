/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proy1_p1;

import javax.swing.JOptionPane;

/**
 *
 * @author an976
 */
public class fracciones {
    

    public fracciones() {
    
        int numerador1 = obtenerNumero("Ingrese el numerador de la primera fracción:");
        int denominador1 = obtenerDenominador("Ingrese el denominador de la primera fracción:");
        int numerador2 = obtenerNumero("Ingrese el numerador de la segunda fracción:");
        int denominador2 = obtenerDenominador("Ingrese el denominador de la segunda fracción:");

        if (denominador1 == denominador2) {
            compararFracciones(numerador1, numerador2);
        } else {
            int nuevoNumerador1 = numerador1 * denominador2;
            int nuevoNumerador2 = numerador2 * denominador1;
            compararFracciones(nuevoNumerador1, nuevoNumerador2);
        }
    }

    private int obtenerNumero(String mensaje) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            String input = JOptionPane.showInputDialog(mensaje);

            try {
                numero = Integer.parseInt(input);
                if (numero != 0) {
                    entradaValida = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Debes introducir un número diferente de 0.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes introducir un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        return numero;
    }

    private int obtenerDenominador(String mensaje) {
        int denominador = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            String input = JOptionPane.showInputDialog(mensaje);

            try {
                denominador = Integer.parseInt(input);
                if (denominador != 0) {
                    entradaValida = true;
                } else {
                    JOptionPane.showMessageDialog(null, "El denominador no puede ser igual a 0.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes introducir un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        return denominador;
    }

    private void compararFracciones(int numerador1, int numerador2) {
        if (numerador1 > numerador2) {
            JOptionPane.showMessageDialog(null, "La primera fracción es mayor que la segunda.");
        } else if (numerador1 < numerador2) {
            JOptionPane.showMessageDialog(null, "La segunda fracción es mayor que la primera.");
        } else {
            JOptionPane.showMessageDialog(null, "Ambas fracciones son iguales.");
        }
    }

    
}
