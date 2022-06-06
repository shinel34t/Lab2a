package pl.lublin.wsei.java.cwiczenia.test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    String graphicTitle;
    String graphicWebsiteAddress;
    String graphicAddress;
    String thumbnailAddress;
    String graphicWidth;
    String graphicHeight;

    public Infografika(String text) {
        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher m = pat.matcher((text));
        if (m.find())
            graphicTitle = m.group(1);
        else
            graphicTitle = "";

        pat = Pattern.compile("<link>(.*)</link>");
        m = pat.matcher((text));
        if (m.find())
            graphicWebsiteAddress = m.group(1);
        else
            graphicWebsiteAddress = "";

        pat = Pattern.compile("<media:content url=\"(.*)\" type");
        m = pat.matcher((text));
        if (m.find())
            graphicAddress = m.group(1);
        else
            graphicAddress = "";

        pat = Pattern.compile("<media:thumbnail url=\"(.*)\"");
        m = pat.matcher((text));
        if (m.find())
            thumbnailAddress = m.group(1);
        else
            thumbnailAddress = "";

        pat = Pattern.compile("width=\"(.*)\" height");
        m = pat.matcher((text));
        if (m.find())
            graphicWidth = m.group(1);
        else
            graphicWidth = "";

        pat = Pattern.compile("height=\"(.*)\"");
        m = pat.matcher((text));
        if (m.find())
            graphicHeight = m.group(1);
        else
            graphicHeight = "";
    }
    public void print() {
        System.out.println("Infografika: ");
        System.out.println("Tytul: " + graphicTitle);
        System.out.println("Adres strony: " + graphicWebsiteAddress);
        System.out.println("Adres miniaturki: " + thumbnailAddress);
        System.out.println("Rozmiary : " + graphicWidth + "x" + graphicHeight);
    }
}