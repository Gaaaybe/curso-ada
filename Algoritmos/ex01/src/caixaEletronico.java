import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.*;

public class caixaEletronico {

    public static void GUI(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Nossa GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static String menu(){
        GUI();

        String opçãoDeSeleção;
        System.out.println("Menu de operações...");
        System.out.println("[a] Mostrar Saldo. \n"+"[b] Depositar. \n"+"[c] Sacar \n"+"[d] Finalizar. ");
        System.out.println("Qual a sua escolha?");

        return "a";
    }

    public static void main(String[] args) throws Exception {

        menu();
    }
}
