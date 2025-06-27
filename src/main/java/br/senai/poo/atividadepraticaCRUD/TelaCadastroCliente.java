package br.senai.poo.atividadepraticaCRUD;

import javax.swing.*;
import java.awt.event.*;
import br.senai.poo.atividadepraticaCRUD.Cliente;
import br.senai.poo.atividadepraticaCRUD.ClienteDAO;

public class TelaCadastroCliente extends JFrame {

    private JTextField txtNome, txtEmail, txtTelefone;
    private JButton btnSalvar;

    public TelaCadastroCliente() {
        setTitle("Cadastro de Cliente");
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(10, 20, 80, 25);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(100, 20, 160, 25);
        add(txtNome);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(10, 60, 80, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(100, 60, 160, 25);
        add(txtEmail);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(10, 100, 80, 25);
        add(lblTelefone);

        txtTelefone = new JTextField();
        txtTelefone.setBounds(100, 100, 160, 25);
        add(txtTelefone);

        btnSalvar = new JButton("Cadastrar");
        btnSalvar.setBounds(90, 150, 120, 30);
        add(btnSalvar);

        btnSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = new Cliente();
                cliente.setNome(txtNome.getText());
                cliente.setEmail(txtEmail.getText());
                cliente.setTelefone(txtTelefone.getText());

                ClienteDAO dao = new ClienteDAO();
                dao.salvar(cliente);

                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                
                // Limpar campos
                txtNome.setText("");
                txtEmail.setText("");
                txtTelefone.setText("");
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaCadastroCliente();
    }
}