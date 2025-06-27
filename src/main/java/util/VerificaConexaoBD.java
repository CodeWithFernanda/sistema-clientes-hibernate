package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VerificaConexaoBD {
    public static void testarConexao() {
        try (Connection conexao = DriverManager.getConnection(
                ConfigBD.getUrl(), ConfigBD.getUsuario(), ConfigBD.getSenha())) {
            System.out.println("✅ Conexão bem-sucedida com o banco!");
        } catch (SQLException e) {
            System.out.println("❌ Falha ao conectar: " + e.getMessage());
        }
    }
}
