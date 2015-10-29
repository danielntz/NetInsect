import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.Node;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;
import org.w3c.dom.xpath.XPathExpression;
import org.xml.sax.SAXException;

/**
 * Xpath的使用
 * @author lenovo
 *
 */
public class Xpathtext {
    
	public Xpathtext(){
		
	}
	
	public void XpathDom() throws ParserConfigurationException, SAXException, IOException, XPathExpressionException{
		
		//解析文件，生成document对象
		 DocumentBuilder builder = DocumentBuilderFactory.newInstance()
				    .newDocumentBuilder();
		 org.w3c.dom.Document document =  builder.parse(new File("F:/yy1.xml"));
		 //生成xpath对象
		 XPath xpath = XPathFactory.newInstance().newXPath();
		 //获取节点值
	   
		  	 String webTitle1 = (String) xpath.evaluate(
		    "//div[@class='tit02 tit04']/h3/a/text()", document,
		    XPathConstants.STRING);
		   System.out.println(webTitle1);
		   System.out.println("==========================");
		   String webTitle = (String) xpath.evaluate(
				    "//div[@class='tit02 tit05']/a/text()", document,
				    XPathConstants.STRING);
		   System.out.println(webTitle);
		   System.out.println("==========================");
	       String web1 = (String) xpath.evaluate(
				    "//div[@class='tit02 tit07']", document,       //直接输出文本内容，不用text()
				    XPathConstants.STRING);
		   System.out.println(web1);
		   System.out.println("==========================");
		   String web0 = (String) xpath.evaluate(
				    "//div[@class='war']", document,                //直接输出文本内容，不用text()
				    XPathConstants.STRING);
		   System.out.println(web0);
		   String name1= (String)xpath.evaluate("//div[@node-type='long']",document,       
				    XPathConstants.STRING);
		   System.out.println(name1);
	/*	// 获取节点属性值
		  String webTitleLang = (String) xpath.evaluate(
		    "/bookstore/book[@category='WEB']/title/@lang", document,
		    XPathConstants.STRING);
		   System.out.println(webTitleLang);
		   System.out.println("===========================================================");

		  // 获取节点对象
		  Node bookWeb = (Node) xpath.evaluate(
		    "/bookstore/book[@category='WEB']", document,
		    XPathConstants.NODE);
		  System.out.println(bookWeb.getNodeName());

		  System.out.println("===========================================================");

		
       }*/
		   //获得当前页面指定的所有节点的元素放入集合中，从中一一获取
		 DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();    
		 DocumentBuilder documentBuilder1 = builderFactory.newDocumentBuilder();    
		 org.w3c.dom.Document document1 =  documentBuilder1.parse(new File("F:/yy.xml"));  
		 XPathFactory factory = XPathFactory.newInstance();    
		 XPath xpath1 = factory.newXPath();    
		 javax.xml.xpath.XPathExpression expression =  xpath.compile("//div[@class='tit02 tit06']/text()");
		 NodeList books =  (NodeList) expression.evaluate(document, XPathConstants.NODESET);
		for(int i = 0;i<books.getLength();i++){                
			System.out.println(books.item(i).getNodeValue());    
		}  
		
		 }
	   
	
}
