package br.senai.poo.atividadepraticaCRUD;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import br.senai.poo.atividadepraticaCRUD.Cliente;
import br.senai.poo.atividadepraticaCRUD.ClienteDAO;

public class TelaEditarExcluirCliente extends JFrame {

    private JTable tabela;
    private DefaultTableModel modelo;
    private JTextField txtNome, txtEmail, txtTelefone;
    private JButton btnAtualizar, btnExcluir;

    public TelaEditarExcluirCliente() {
        setTitle("Editar / Excluir Cliente");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        modelo = new DefaultTableModel(new Object[]{"ID", "Nome", "Email", "Telefone"}, 0);
        tabela = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabela);
        scroll.setBounds(20, 20, 540, 150);
        add(scroll);

        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 180, 80, 25);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(100, 180, 200, 25);
        add(txtNome);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(20, 220, 80, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(100, 220, 200, 25);
        add(txtEmail);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(20, 260, 80, 25);
        add(lblTelefone);

        txtTelefone = new JTextField();
        txtTelefone.setBounds(100, 260, 200, 25);
        add(txtTelefone);

        btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setBounds(330, 200, 110, 30);
        add(btnAtualizar);

        btnExcluir = new JButton("Excluir");
        btnExcluir.setBounds(330, 250, 110, 30);
        add(btnExcluir);

        carregarClientes();

        tabela.getSelectionModel().addListSelectionListener(e -> {
            if (tabela.getSelectedRow() != -1) {
                txtNome.setText(modelo.getValueAt(tabela.getSelectedRow(), 1).toString());
                txtEmail.setText(modelo.getValueAt(tabela.getSelectedRow(), 2).toString());
                txtTelefone.setText(modelo.getValueAt(tabela.getSelectedRow(), 3).toString());
            }
        });

        btnAtualizar.addActionListener(e -> {
            int linha = tabela.getSelectedRow();
            if (linha != -1) {
                Cliente cliente = new Cliente();
                cliente.setId((int) modelo.getValueAt(linha, 0));
                cliente.setNome(txtNome.getText());
                cliente.setEmail(txtEmail.getText());
                cliente.setTelefone(txtTelefone.getText());

                new ClienteDAO().atualizar(cliente);
                JOptionPane.showMessageDialog(null, "Cliente atualizado com sucesso!");
                recarregarTabela();
            }
        });

        btnExcluir.addActionListener(e -> {
            int linha = tabela.getSelectedRow();
            if (linha != -1) {
                int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este cliente?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    Cliente cliente = new Cliente();
                    cliente.setId((int) modelo.getValueAt(linha, 0));

                    new ClienteDAO().excluir(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
                    recarregarTabela();
                }
            }
        });

        setVisible(true);
    }

    private void carregarClientes() {
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> clientes = dao.listar();

        for (Cliente c : clientes) {
            modelo.addRow(new Object[]{c.getId(), c.getNome(), c.getEmail(), c.getTelefone()});
        }
    }

    private void recarregarTabela() {
        modelo.setRowCount(0); // limpa
        carregarClientes();
        txtNome.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
    }

    public static void main(String[] args) {
        new TelaEditarExcluirCliente();
    }
}
