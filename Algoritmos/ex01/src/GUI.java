import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GUI {

    double saldoInicial = 100.80;
    JLabel saldoLabel;

    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        saldoLabel = new JLabel("Saldo: R$ " + saldoInicial);
        JButton buttonSaque = new JButton("Sacar");
        JButton buttonDeposit = new JButton("Depositar");

        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Nossa GUI");
        frame.pack();
        frame.setVisible(true);

        panel.setLayout(null);
        buttonSaque.setBounds(100, 200, 250, 70);
        panel.add(buttonSaque);

        buttonDeposit.setBounds(50, 100, 250, 70);
        panel.add(buttonDeposit);

        buttonDeposit.addActionListener(this::depositar);
        buttonSaque.addActionListener(this::sacar);

        panel.add(saldoLabel);
        saldoLabel.setBounds(300, 70, 100, 100);
    }

    private void sacar(ActionEvent actionEvent) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado:"));
        saldoInicial -= valor;
        saldoLabel.setText("Saldo: R$ " + saldoInicial);
    }

    private void depositar(ActionEvent actionEvent) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado:"));
        saldoInicial += valor;
        saldoLabel.setText("Saldo: R$ " + saldoInicial);
    }
}
