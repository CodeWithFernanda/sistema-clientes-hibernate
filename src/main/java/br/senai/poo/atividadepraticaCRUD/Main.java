package br.senai.poo.atividadepraticaCRUD;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteDAO dao = new ClienteDAO();

        while (true) {
            System.out.println("\n=== MENU CLIENTES ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Excluir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    Cliente novo = new Cliente(nome, email, telefone);
                    dao.salvar(novo);
                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n=== LISTA DE CLIENTES ===");
                    dao.listar().forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("ID do cliente a atualizar: ");
                    int idAtualiza = scanner.nextInt();
                    scanner.nextLine(); // limpar buffer

                    Cliente atualiza = new Cliente();
                    atualiza.setId(idAtualiza);

                    System.out.print("Novo nome: ");
                    atualiza.setNome(scanner.nextLine());
                    System.out.print("Novo email: ");
                    atualiza.setEmail(scanner.nextLine());
                    System.out.print("Novo telefone: ");
                    atualiza.setTelefone(scanner.nextLine());

                    dao.atualizar(atualiza);
                    System.out.println("Cliente atualizado!");
                    break;

                case 4:
                    System.out.print("ID do cliente a excluir: ");
                    int idRemove = scanner.nextInt();
                    Cliente excluir = new Cliente();
                    excluir.setId(idRemove);
                    dao.excluir(excluir);
                    System.out.println("Cliente removido!");
                    break;

                case 0:
                    System.out.println("Encerrando programa...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}
