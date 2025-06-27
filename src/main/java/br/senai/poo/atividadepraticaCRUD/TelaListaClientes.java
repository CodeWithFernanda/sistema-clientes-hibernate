package br.senai.poo.atividadepraticaCRUD;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import br.senai.poo.atividadepraticaCRUD.Cliente;
import br.senai.poo.atividadepraticaCRUD.ClienteDAO;

public class TelaListaClientes extends JFrame {

    private JTable tabela;
    private DefaultTableModel modelo;

    public TelaListaClientes() {
        setTitle("Lista de Clientes");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nome");
        modelo.addColumn("Email");
        modelo.addColumn("Telefone");

        tabela = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabela);
        add(scroll, BorderLayout.CENTER);

        carregarDados();

        setVisible(true);
    }

    private void carregarDados() {
        ClienteDAO dao = new ClienteDAO();
        List<Cliente> clientes = dao.listar(); // ajuste aqui se seu método tiver outro nome

        for (Cliente c : clientes) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getEmail(),
                c.getTelefone()
            });
        }
    }

    public static void main(String[] args) {
        new TelaListaClientes();
    }
}
