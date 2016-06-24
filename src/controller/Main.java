package controller;

import com.sun.istack.internal.NotNull;
import model.Character;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * The main class
 */
public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        String ryzomApiXmlLink = "http://api.ryzom.com/character.php?apikey=c0d11f09d31436675160cc3e852fe4bdde5aea72e";
        // Getting XML from web and parsing it
        Document document = new XmlParser().parseXmlFromUrl(ryzomApiXmlLink);

        // Creating character
        Character character = generateCharacter(document);
        System.out.println(character);
    }

    public static Character generateCharacter(@NotNull Document xml) {
        Character character = new Character();
        Node xmlCharacter = xml.getElementsByTagName("character").item(0);
        character.setApiKey(xmlCharacter.getAttributes().getNamedItem("apikey").getNodeValue());
        character.setCreated(Long.parseLong(xmlCharacter.getAttributes().getNamedItem("created").getNodeValue()));
        character.setCashedUntil(Long.parseLong(xmlCharacter.getAttributes().getNamedItem("cached_until").getNodeValue()));
        character.setModules(xmlCharacter.getAttributes().getNamedItem("modules").getNodeValue());
        character.setId(Integer.parseInt(xml.getElementsByTagName("id").item(0).getTextContent()));
        character.setName(xml.getElementsByTagName("name").item(0).getTextContent());
        character.setShard(xml.getElementsByTagName("shard").item(0).getTextContent());
        character.setMoney(Long.parseLong(xml.getElementsByTagName("money").item(0).getTextContent()));

        return character;
    }
}
