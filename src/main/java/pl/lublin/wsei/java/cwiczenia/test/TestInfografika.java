package pl.lublin.wsei.java.cwiczenia.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestInfografika {
    public static void main(String[] args) throws IOException {
        try {
            String contents = new String(Files.readAllBytes(Paths.get("src/main/java/pl/lublin/wsei/java/cwiczenia/test/gusInfoGraphic.xml")));
            Infografika infoGraph = new Infografika(contents);
            System.out.println("Tytul: " + infoGraph.graphicTitle);
            System.out.println("Adres strony: " + infoGraph.graphicWebsiteAddress);
            System.out.println("Adres miniaturki: " + infoGraph.thumbnailAddress);
            System.out.println("Rozmiary : " + infoGraph.graphicWidth + "x" + infoGraph.graphicWidth);
        }
        catch (IOException e) {
            System.out.print("Błąd wczytywania pliku gusInfo... " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
