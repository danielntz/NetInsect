import java.io.File;
import java.io.IOException;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.xpath.XPathExpression;
import org.xml.sax.SAXException;


public class XpathtoArray {

	  public XpathtoArray(){
	  }
	  
	  public void  dedao() throws XPathExpressionException, SAXException, IOException, ParserConfigurationException{
	  
		  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		  factory.setNamespaceAware(false);
		  DocumentBuilder builder = factory.newDocumentBuilder();
		  Document doc = (Document) builder.parse("F:/yy.xml");
	//	  System.out.println(doc.getChildNodes().getLength());
		  XPathFactory xFactory = XPathFactory.newInstance();
		  XPath xpath = xFactory.newXPath();
		  javax.xml.xpath.XPathExpression expr = xpath.compile("//div[@class='tit02 tit06']/text()");
		  Object result = expr.evaluate(doc, XPathConstants.NODESET);
		  NodeList nodes = (NodeList) result;
	   
		  for (int i = 0; i < nodes.getLength(); i++) {
			   System.out.println(nodes.item(i).getNodeValue()+"=======");
			  }
	 
   }
	
	 
}
