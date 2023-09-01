package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

String opcoes = JOptionPane.showInputDialog(null,"Escolha uma opção",
        "menu",JOptionPane.QUESTION_MESSAGE, null,new Object[]{"Conversor de moeda","Converso de temperatura"},
        "Escooha").toString();

String input = JOptionPane.showInputDialog("Insira um valor");


Funcao funcao = new Funcao();

switch (opcoes){
    case "Conversor de moeda":
        double valorRecebido = Double.parseDouble(input);
        funcao.converteMoedas(valorRecebido);
    int reposta = JOptionPane.showConfirmDialog(null,"Deseja continuar?");
    if (reposta == JOptionPane.OK_OPTION){
        System.out.println("Escolha opção");
    }else {
        JOptionPane.showMessageDialog(null,"Finalizado");
    }
}
    }
}