package trabalho1;

import java.awt.*; //PARA DESIGN
import java.awt.event.*;//capturar eventos
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class JanelaBiblioteca extends JFrame implements ActionListener {
    
    private List<ItemBiblioteca> biblioteca = new ArrayList<>(); //guarda todos os itens da biblioteca
    private JComboBox<String> comboItens; //caixa de selecao com os itens
    private JButton btnEmprestar, btnDevolver, btnMultar; //botoes clicaveis
    private JTextArea terminalArea; //para mostrar a interacao com os itens, como se fosse um terminal mesmo

    public JanelaBiblioteca(){
        //base de dados
        biblioteca.add(new Livro("Engenharia de Software", "Ian Sommerville", "978-85-123", 1234));
        biblioteca.add(new Livro("Clean Code", "Robert C. Martin", "978-01-323", 2123));
        biblioteca.add(new Revista("National Geographic", "Disney", "0027-9358", 3123));
        biblioteca.add(new MidiaDigital("Curso de Java", "MP4", 4123));
        biblioteca.add(new Jornal("Folha de S.Paulo", "14/12/2025", 5123));
        biblioteca.add(new Artigo("Análise do comportamento social...", "Vitoria Calonga", "IFMT",6123));
        biblioteca.add(new Livro("Entendendo Algoritmos", "Aditya Y. Bhargava", "978-85-7522", 1010));
        biblioteca.add(new Livro("Arquitetura e Organização de Computadores", "William Stallings", "978-85-430", 1011));
        biblioteca.add(new Livro("1984", "George Orwell", "978-85-231", 1014));
        biblioteca.add(new MidiaDigital("Audiobook: O Mítico Homem-Mês", "MP3", 3032));


        //config da janela
        this.setTitle("Sistema da Biblioteca");
        this.setSize(480, 520); //larg x altura
        this.setLocation(150, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para fechar quando clicarmos no x da janela
        this.setLayout(new BorderLayout());//divide a janela em partes 

        //topo
        JPanel painelTopo = new JPanel(); //painel do topo
        painelTopo.setBackground(new Color(255,240,245)); //cor de fundo
        painelTopo.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10)); //centraliza os obj automaticamente linha a linha

        ImageIcon iconeOriginal = new ImageIcon("library.png"); //pega img e coloca em icone ori
        
        Image imgRedimensionada = iconeOriginal.getImage().getScaledInstance(300, 150, Image.SCALE_SMOOTH); //redimensiona p tamanho da imagem na janela
        ImageIcon iconeFinal = new ImageIcon(imgRedimensionada); //cria novo icone no tamanho certo 
        
        JLabel lblImagem = new JLabel(iconeFinal); //forma de exibir imagens no swing é colocando o icon em uma jlabel
        painelTopo.add(lblImagem); //add img no topo

        this.add(painelTopo, BorderLayout.NORTH); //coloca o paineltopo na parte norte da janela

        //centro
        JPanel painelCentro = new JPanel();
        painelCentro.setBackground(new Color(255,240,245)); //mescla cor com a do topo
        painelCentro.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); //centraliza e da espaço entre os botoes 

        painelCentro.add(new JLabel("Selecione o Item:")); //add texto
        comboItens = new JComboBox<>();//incializa a caixa de selecao jcombobox
        for (ItemBiblioteca item : biblioteca){ //para cada item da biblioteca uma nova opcao é criada
            comboItens.addItem(item.getTitulo()); 
        }
        painelCentro.add(comboItens); //agr add a caixa pronta no painel central

        //botoes
        btnEmprestar = new JButton("Emprestar"); //cria e define texto dos botoes
        btnDevolver = new JButton("Devolver");
        btnMultar = new JButton("Multar");
        btnEmprestar.addActionListener(this); //eventos
        btnDevolver.addActionListener(this);
        btnMultar.addActionListener(this);
        painelCentro.add(btnEmprestar); //cola em painel
        painelCentro.add(btnDevolver);
        painelCentro.add(btnMultar);

        //terminal
        terminalArea = new JTextArea(10, 35); 
        terminalArea.setEditable(false); //impede insercao de texto
        JScrollPane scroll = new JScrollPane(terminalArea); //caso fique grande, permite rolar
        painelCentro.add(scroll);

        this.add(painelCentro, BorderLayout.CENTER);//add o painel central no centro da janela
    }

    //tratamento de eventos 
    public void actionPerformed(ActionEvent e){
        int indexSelecionado = comboItens.getSelectedIndex(); //aq fica o ind do item selecionada na caixa
        ItemBiblioteca item = biblioteca.get(indexSelecionado); //pega o item da biblioteca de acordo com o ind

        if (e.getSource() == btnEmprestar){
            if (item.getDispo() == false){
                JOptionPane.showMessageDialog(null, "ERRO: Este item já está emprestado!", "Aviso", JOptionPane.WARNING_MESSAGE);
                terminalArea.append("-> Falha: '" + item.getTitulo() + "' já estava emprestado.\n");
            } else {
                item.emprestar(); 
                JOptionPane.showMessageDialog(null, "Emprestado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                terminalArea.append("-> Sucesso: '" + item.getTitulo() + "' foi emprestado.\n");
            }
        } 
        else if (e.getSource() == btnDevolver){
            if (item.getDispo() == true) {
                JOptionPane.showMessageDialog(null, "ERRO: Este item não está emprestado no momento!", "Aviso", JOptionPane.WARNING_MESSAGE);
                terminalArea.append("-> Falha: '" + item.getTitulo() + "' já estava na biblioteca.\n");
            } else {
                item.devolver();
                JOptionPane.showMessageDialog(null, "Devolvido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                terminalArea.append("-> Sucesso: '" + item.getTitulo() + "' foi devolvido.\n");
            }
        } 
        else if (e.getSource() == btnMultar){
            item.multar();
            JOptionPane.showMessageDialog(null, "Multa processada!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            terminalArea.append("-> Multa aplicada para: '" + item.getTitulo() + "'.\n");
        }
    }

    public static void main(String[] args){
        JanelaBiblioteca janela = new JanelaBiblioteca();
        janela.setVisible(true);
    }
}