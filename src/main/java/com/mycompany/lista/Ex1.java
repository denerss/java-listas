/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.lista;
import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String[] args) {
        // Leitura da entrada
        String NString = JOptionPane.showInputDialog("Digite o número: ");
        int N = Integer.parseInt(NString); // Converte a String para int
        int i; // Variável de controle

        // Início do loop do-while
        do {
            if (N % 2 == 0) {
                N = N / 2; // Se N é par, divide por 2
            } else {
                N = 3 * N + 1; // Se N é ímpar, aplica a fórmula 3 * N + 1
            }
            JOptionPane.showMessageDialog(null, " " + N); // Exibe o valor de N
            i = N; // Atualiza o valor de i para checar a condição de saída
        } while (i != 1); // Continua o loop até que i seja 1
    }
}
