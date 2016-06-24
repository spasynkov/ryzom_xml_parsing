package controller;

import com.sun.istack.internal.NotNull;
import model.Character;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
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

    /* Printing document's nodes */
    /**
     * This method will go through all root nodes and calls printing method for each node it has
     * */
    private static void printNodes(Document document) {
        // check if document has child nodes at all
        if (document.hasChildNodes()) {
            // foreach child nodes
            for (Node childNode = document.getFirstChild(); childNode != null; childNode = document.getNextSibling()) {
                // print it and all its children
                printNodes(childNode, "");
            }
        }
    }

    /**
     * Printing node's content and then printing its child's nodes content recursively
     * */
    private static void printNodes(Node node, String startingIndent) {
        StringBuilder sb = new StringBuilder();     // building string to print

        // if it's not a text node
        if (!"#text".equals(node.getNodeName())) {
            // adding current indent and the name of the node
            sb.append(startingIndent).append(node.getNodeName());
            // if current node has an attributes - add them to the string
            if (node.hasAttributes()) sb.append(" (").append(getAttributesString(node)).append(")");
            // if current node has another nodes inside - add some mark
            if (node.hasChildNodes()) sb.append(" : ");
        }
        // no need to print "null" for each node without a name
        if (node.getNodeValue() != null) sb.append(node.getNodeValue());
        // if current node has child nodes and they are text nodes (at least first one) -
        // let the text content be printed in one string; else - adding new string character
        if (!(node.hasChildNodes() && "#text".equals(node.getFirstChild().getNodeName()))) sb.append("\n");

        // printing the string that we built
        System.out.print(sb.toString());

        // call this method recursively for all child nodes of the current node
        for (Node child = node.getFirstChild(); child != null; child = child.getNextSibling()) {
            printNodes(child, startingIndent + " ");    // increasing intend for child nodes here
        }
    }

    /**
     * Building all attributes of some node in a single string
     * */
    private static StringBuilder getAttributesString(Node node) {
        StringBuilder result = new StringBuilder();

        NamedNodeMap attributes = node.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            Node attribute = attributes.item(i);
            // if there are more than one attribute - lets separate them with coma
            if (i != 0) result.append(", ");
            result.append(attribute.getNodeName()).append("=").append(attribute.getNodeValue());
        }
        return result;
    }
}
