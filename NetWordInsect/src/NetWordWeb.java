import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;




public class NetWordWeb {

	public static void main(String[] args) throws IOException, XPathExpressionException, ParserConfigurationException, SAXException {
		// TODO Auto-generated method stub
		
		//String response1 = new String(response.getBytes("UTF-8"),"ISO-8859-1");
		//String response2 = new String(response1.getBytes("ISO8859-1"),"UTF-8");
		//byte [] Byte = new String(response.getBytes("ISO-8859-1"),"UTF-8").getBytes("GBK");
	//	String response2 = new String(Byte,"GBK");
		//String response = readtiles.sendGet("http://www.sina.com.cn/", null);
		//String temp=new String(response.getBytes("UTF-8"));//这里写原编码方式
      //   String newtemp=new String(temp.getBytes(),"utf-8");//这里写转换后的编码方式
     //    String newStr=new String(newtemp.getBytes("GBK"));//这里写转换后的编码方式
         
		//创建一个文件
     /*    File file = new File("F:/tt.txt");
		 if(!file.exists()){
			 file.createNewFile();
		 }
		 byte[] byte1 = new byte[2048];     //一次读取的最大字节数，如果内容过大，可以读几次
		 byte1 = newStr.getBytes();
		 int b = newStr.length();
		 FileOutputStream fileoutputstream = new FileOutputStream(file);
		 fileoutputstream.write(byte1, 0, b);
		 fileoutputstream.close();*/
	     chachu();
	    // chachu1();
		// System.out.println(newStr);
	}
	public static void  chachu() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException{
		 Xpathtext hhh = new Xpathtext();
			 hhh.XpathDom();
	}
	public static void  chachu1() throws XPathExpressionException, SAXException, IOException, ParserConfigurationException{
		XpathtoArray hhh1 = new XpathtoArray();
		hhh1.dedao();
	}

}


































