package p2;

import java.awt.Color;
import javax.swing.JFrame;

public class PrimeiraJanela extends JFrame {
    public PrimeiraJanela() {
        //Titulo da Janela
        this.setTitle("Primeiro aplicativo Swing");
        //Dimensões da Janela
        this.setSize (1000, 500);
        //Posição:Canto esquerdo superior da tela
        this.setLocation (150, 50);
        //Impedir que a janela seja redimensionada
        this.setResizable (false);
        //Colocar cor de fundo azul na janela
        this.getContentPane().setBackground(Color.blue);
    }
    public static void main(String[] args) {
        // Criar uma instancia do tipo "PrimeiraJanela"
        PrimeiraJanela jan = new PrimeiraJanela();
        //Tornar a janela visível
        jan.setVisible(true);
    }
}