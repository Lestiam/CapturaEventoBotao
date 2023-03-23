import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CapturaEventoBotao implements ActionListener {

    private JButton botao;

    public void janela(){
        JFrame frame = new JFrame();
        botao = new JButton();

        //REGISTRA O EVENTO
        botao.addActionListener(this);

        frame.getContentPane().add(botao);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,100);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent eevento) {
        botao.setText("Botão foi clicado!");

        //ALTERA A FONTE
        botao.setFont(new Font("SansSerif", Font.BOLD,20));
    }

    public static void main(String[] args){
        CapturaEventoBotao captura = new CapturaEventoBotao();
        captura.janela();
    }
}
