package es.josemalvarez.skillranking;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import es.josemalvarez.skillranking.utils.DocumentBuilderException;
import es.josemalvarez.skillranking.utils.DocumentBuilderHelper;
import static org.junit.Assert.*;
public class DOMXMLParser {

	@Test
	public void test() throws IOException, DocumentBuilderException, TransformerException, XPathExpressionException {
		  InputStream is = 
	                Thread.currentThread().getContextClassLoader().getResourceAsStream("data/connections-10.xml");
	      Document doc = DocumentBuilderHelper.getDocumentFromInputStream(is);

	      XPathFactory factory = XPathFactory.newInstance();
	      XPath xpath = factory.newXPath();
	      XPathExpression expr = xpath.compile("//person");
	      NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
	      assertEquals(10, nodes.getLength());	      
	}
}
