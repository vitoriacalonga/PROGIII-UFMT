package p2;

import javax.swing.*;
import java.awt.event.*;

public class ExemploBotao extends JFrame implements ActionListener {

    JButton botao;

    public ExemploBotao() {

        botao = new JButton("Clique");

        add(botao);

        botao.addActionListener(this);

        setSize(300,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Botão clicado!");
    }

    public static void main(String[] args) {
        new ExemploBotao();
    }
}