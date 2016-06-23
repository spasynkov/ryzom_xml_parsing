package controller;

import com.sun.istack.internal.NotNull;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Class for parsing Ryzom API XML
 */
public class XmlParser {
    private Document document;

    public Document parseXmlFromUrl(@NotNull String urlString) throws IOException, ParserConfigurationException, SAXException {
        URL url = new URL(urlString);
        URLConnection urlConnection = url.openConnection();
        parseXml(urlConnection.getInputStream());

        return getDocument();
    }

    public Document parseXmlFromFile(@NotNull String fileName) throws IOException, SAXException, ParserConfigurationException {
        InputStream inputStream = new FileInputStream(fileName);
        parseXml(inputStream);

        return getDocument();
    }

    private void parseXml(InputStream stream) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setValidating(false);        // don't validate XML
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        document = documentBuilder.parse(stream);
        document.normalize();
    }

    public Document getDocument() {
        return document;
    }
}
