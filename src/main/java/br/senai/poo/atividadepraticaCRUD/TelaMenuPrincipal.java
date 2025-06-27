package br.senai.poo.atividadepraticaCRUD;

import javax.swing.*;
import java.awt.event.*;

public class TelaMenuPrincipal extends JFrame {

    private JButton btnCadastro, btnListar, btnEditar;

    public TelaMenuPrincipal() {
        setTitle("Sistema de Gerenciamento de Clientes");
        setSize(350, 230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null); // centraliza na tela

        JLabel lblTitulo = new JLabel("MENU PRINCIPAL");
        lblTitulo.setBounds(110, 20, 150, 25);
        add(lblTitulo);

        btnCadastro = new JButton("Cadastrar Cliente");
        btnCadastro.setBounds(80, 60, 180, 30);
        add(btnCadastro);

        btnListar = new JButton("Listar Clientes");
        btnListar.setBounds(80, 100, 180, 30);
        add(btnListar);

        btnEditar = new JButton("Editar / Excluir Cliente");
        btnEditar.setBounds(80, 140, 180, 30);
        add(btnEditar);

        btnCadastro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaCadastroCliente();
            }
        });

        btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaListaClientes();
            }
        });

        btnEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TelaEditarExcluirCliente();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new TelaMenuPrincipal();
    }
}
