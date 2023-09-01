package Programa;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;

public class Home {
    public static void main(String[] args) {
        String url = "https://pt.wikipedia.org/wiki/Dragon_Ball_(s%C3%A9rie)";
        try {
            Document document = Jsoup.connect(url).get();
            Elements titleElements = document.select("title");
            for (Element titleElement : titleElements) {
                String title = titleElement.text();
                String conteudo = "Título Obtido: " + title;
                FileWriter escritor = new FileWriter ("Arquivo.txt");
                escritor.write(conteudo);
                escritor.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
