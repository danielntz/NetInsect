import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;


public class readtiles {
	//��̬������get����
	  public static String sendGet(String url,String params) throws IOException
	  {
		      String result = "";
		      BufferedReader in = null;
		    try{
		      String urlName = url +"?" + params;
		      URL realUrl = new URL(urlName);
		      //�򿪺�url֮�������
		      URLConnection conn = realUrl.openConnection();
		      //����ͨ�õ���������
		      conn.setRequestProperty("accept","*/*");
		      conn.setRequestProperty("connection", "Keep-Alive");
		      conn.setRequestProperty("user-agent", "Mozilla/4.0(compatible;MSIE6.0;WindowsNT5.1;SV1");
		      //����ʵ�ʵ�����
		      conn.connect();
		      //��ȡ������Ӧͷ�ֶ�
		      Map<String,List<String>> map = conn.getHeaderFields();
		      for(String key : map.keySet())
		      {
		    	  System.out.println(key +"--->" + map.get(key));
		      }
		     //����BufferReader����������ȡurl����Ӧ
		      in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		      String line;
		      while((line = in.readLine())!=null)
		      {
		    	  result += "\n" + line;
		      }
		    }
		    catch(Exception e)
		    {
		    	System.out.println("����get��������쳣��" + e);
		    	e.printStackTrace();
		    }
		    
		    //ʹ��finally���ر�������
		    finally
		    {
		    	try{
		    		if(in!=null)
		    		{
		    			in.close();
		    		}
		    	   }
		    		catch(IOException ex)
		    		{
		    			ex.printStackTrace();
		    		}
		   } 
		    
	  return result;
	  }
  
	
	
	
}
