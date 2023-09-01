package org.example;

import javax.swing.*;

public class ConversoDeMoedas {
    public void converteReaisADolar(double valor) {
        double moedaDolar = valor / 5.01;
        JOptionPane.showMessageDialog(null, "Você tem $" + moedaDolar + " dolares");
    }

    public void converteReaisParaEuro(double valor){
        double moedaDolar = valor / 5.52;
        JOptionPane.showMessageDialog(null, "Você tem $" + moedaDolar + " euros");
    }
}
