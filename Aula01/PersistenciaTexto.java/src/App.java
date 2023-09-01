import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args){
        String conteudo = "Este é um exemplo de persistência em um arquivo de texto";
    
        try{
            FileWriter escritor = new FileWriter ("Arquivo.txt");
            escritor.write(conteudo);
            escritor.close();
            System.out.println("Dados gravados com sucesso!");
            
     } catch (IOException e){
        System.err.println("Erro ao escrever no arquivo "+ e.getMessage());
    }
 }
}