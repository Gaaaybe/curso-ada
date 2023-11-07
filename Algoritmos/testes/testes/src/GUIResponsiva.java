import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIResponsiva {

    private double saldo = 1000.0;  // Saldo inicial

    private JLabel saldoLabel;

    public GUIResponsiva() {
        JFrame frame = new JFrame("Minha GUI Responsiva");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Painel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        // Botões
        JButton depositarButton = new JButton("Depositar");
        JButton sacarButton = new JButton("Sacar");
        JButton verificarSaldoButton = new JButton("Verificar Saldo");
        JButton sairButton = new JButton("Sair");

        // Rótulo para exibir saldo
        saldoLabel = new JLabel("Saldo: R$ " + saldo);

        // Adicionar ação aos botões
        depositarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depositar();
            }
        });

        sacarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sacar();
            }
        });

        verificarSaldoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarSaldo();
            }
        });

        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Adicionar componentes ao painel
        panel.add(depositarButton);
        panel.add(sacarButton);
        panel.add(verificarSaldoButton);
        panel.add(sairButton);

        // Adicionar o rótulo de saldo abaixo dos botões
        panel.add(saldoLabel);

        // Adicionar o painel ao frame
        frame.add(panel);

        frame.setVisible(true);
    }

    private void depositar() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado:"));
        saldo += valor;
        atualizarSaldo();
    }

    private void sacar() {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado:"));
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        atualizarSaldo();
    }

    private void verificarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo atual: R$ " + saldo);
    }

    private void atualizarSaldo() {
        saldoLabel.setText("Saldo: R$ " + saldo);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUIResponsiva();
            }
        });
    }
}
