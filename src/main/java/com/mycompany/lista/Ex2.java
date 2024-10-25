/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista;
import javax.swing.JOptionPane;
 
public class Ex2 {
    public static void main(String[] args) {
        // Entrada de X
        String XString = JOptionPane.showInputDialog("Digite o número X: ");
        int Xnumber = Integer.parseInt(XString); // Conversão correta da entrada X

        int Znumber; // Declaração de Znumber para ser usada no loop

        // Loop do-while
        do {
            // Entrada de Z
            String ZString = JOptionPane.showInputDialog("Digite o número Z: ");
            Znumber = Integer.parseInt(ZString); // Conversão correta da entrada Z

        } while (Znumber <= Xnumber); // O loop continua até que Z seja maior que X
        int contador = 0;
        int soma = 0;
        for (int i = Xnumber; soma <= Znumber; i++){
        contador++;
        soma += i ;
        }
        JOptionPane.showMessageDialog(null, " " + contador);
    }
}