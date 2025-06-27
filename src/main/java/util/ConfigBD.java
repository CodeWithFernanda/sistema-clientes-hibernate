package util;

import java.io.InputStream;
import java.util.Properties;

public class ConfigBD {

    private static final Properties props = new Properties();

    static {
        try (InputStream input = ConfigBD.class.getClassLoader().getResourceAsStream("dbconfig.properties")) {
            if (input == null) {
                throw new RuntimeException("Arquivo de configuração não encontrado");
            }
            props.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao carregar configurações do banco", e);
        }
    }

    public static String getUrl() {
        return props.getProperty("db.url");
    }

    public static String getUsuario() {
        return props.getProperty("db.user");
    }

    public static String getSenha() {
        return props.getProperty("db.password");
    }
}
