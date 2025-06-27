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

## 🔧 Como Executar

1. Clone este repositório  
2. Importe como projeto Maven no Eclipse (ou outra IDE compatível)  
3. Crie o banco de dados no MySQL ou MariaDB:
   ```sql
   CREATE DATABASE sistema_clientes;

4. No arquivo src/main/resources/dbconfig.properties, configure sua conexão:
   db.url=jdbc:mysql://localhost:3306/sistema_clientes
db.user=SEU_USUARIO
db.password=SUA_SENHA


5. Execute a classe Main.java
6. Utilize o menu no terminal para cadastrar, listar, atualizar ou excluir clientes.
7. Verifique os dados no Workbench:
   SELECT * FROM cliente;


⚙️ Observações sobre Configuração

1. O sistema utiliza um arquivo externo (dbconfig.properties) para os dados de conexão com o banco.

2. Essa abordagem permite executar a aplicação em diferentes computadores com facilidade: basta ajustar os valores do .properties conforme o ambiente.

3. Funciona com MySQL ou MariaDB — apenas altere a db.url se necessário, por exemplo:

db.url=jdbc:mariadb://localhost:3306/sistema_clientes


🛠️ Futuras Melhorias

1. Inclusão de interface gráfica (Swing ou JavaFX)

2. Busca de clientes por nome ou ID

3. Validação de campos obrigatórios e formatos (ex: email, telefone)

4. Exportação de dados em PDF ou CSV

5. Integração com testes automatizados (JUnit)
   
7. Criação de usuários com autenticação básica


👩‍💻 Sobre a Autora
Projeto desenvolvido por Fernanda, aluna do curso Técnico em Desenvolvimento de Sistemas – SENAI Camaçari, como parte da disciplina Programação Orientada a Objetos. Veja mais em: https://github.com/CodeWithFernanda


📚 Licença
Este projeto é de uso educacional e está sob a licença MIT. Fique à vontade para estudar, adaptar e reutilizar com os devidos créditos.



