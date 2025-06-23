# Sistema de Cadastro de Clientes (Java + Hibernate + MySQL)

Este projeto consiste em uma aplicação de linha de comando para o gerenciamento de clientes, utilizando Java, Hibernate ORM e banco de dados MySQL. Foi desenvolvido como atividade prática da disciplina **Programação Orientada a Objetos** no curso Técnico em Desenvolvimento de Sistemas do **SENAI Camaçari**.

## 🚀 Funcionalidades
- Cadastro de novos clientes
- Listagem de clientes existentes
- Atualização de dados
- Exclusão de registros

## 🛠️ Tecnologias Utilizadas
- Java (versão 17 ou superior)
- Hibernate ORM (5.6.15.Final)
- MySQL 8
- Maven (gerenciamento de dependências)
- Eclipse IDE
- MySQL Workbench

## 🧱 Estrutura
- `Cliente.java` – Entidade JPA do sistema
- `ClienteDAO.java` – Classe de acesso aos dados (DAO)
- `HibernateUtil.java` – Configuração da SessionFactory
- `Main.java` – Interface de menu via terminal


## 🔧 Como Executar
1. Clone este repositório  
2. Importe como projeto Maven no Eclipse  
3. Crie o banco de dados no MySQL:
   ```sql
   CREATE DATABASE sistema_clientes;
4. Rode a classe Main.java
5. Utilize o menu no terminal para cadastrar, listar, atualizar ou excluir clientes.
6. Verifique no MySQL Workbench se os dados foram salvos corretamente com:
   SELECT * FROM cliente;

