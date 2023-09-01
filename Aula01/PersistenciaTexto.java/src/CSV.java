import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CSV{
    public static void main(String[] args){
        Properties propriedades = new Properties();
        propriedades.setProperty("Usuario", "João");
        propriedades.setProperty("senha", "secretaria");

        try {
            FileOutputStream arquivo = new FileOutputStream("Config.properties");
            propriedades.store(arquivo, "configurações do usuário");

            arquivo.close();
            System.out.println("Propriedades Gravadas com sucesso! ");
        } catch (IOException e) {
            System.err.println("Erro de gravar propriedades : " + e.getMessage());
        }
    }
}