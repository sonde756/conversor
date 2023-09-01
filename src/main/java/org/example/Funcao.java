package org.example;

import javax.swing.*;

public class Funcao {

    ConversoDeMoedas moedas = new ConversoDeMoedas();

    public void converteMoedas(double value) {
        try {
            String[] opcoes = {"De Reais para dólares", "De Reais para euros"};
            String opcaoSelecionada = (String) JOptionPane.showInputDialog(
                    null,
                    "Escolha a moeda para a qual deseja converter:",
                    "Escolha",
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            if (opcoes.equals("De Reais para dólares")) {
                moedas.converteReaisADolar(value);
            } else if (opcoes.equals("De Reais para euros")) {
                moedas.converteReaisParaEuro(value);
            }

        } catch (Exception e) {

            throw new RuntimeException(e);
        }
    }


}
