package p2;

import javax.swing.*;

public class Janela extends JFrame{
    public Janela() {
        setTitle("Minha Janela"); //nome da janela
        setSize(400, 300); //tamanho
        setLocation(200, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Janela();
    }
}
