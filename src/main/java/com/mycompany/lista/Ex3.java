/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author Dener
 */
public class Ex3 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int min = 1;
        int valor = aleatorio.nextInt((100 - 1) + 1 ) + min;
        int contador = 0;
        int Palpite = 0;
        do {
        String StringPalpite = JOptionPane.showInputDialog("Digite o seu palpite: ");
        Palpite = Integer.parseInt(StringPalpite);
        contador++;
        } while(Palpite != valor);
        JOptionPane.showMessageDialog(null, "Tentativas até acertar " + contador);
    }
    
}
