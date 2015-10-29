import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;


public class readtiles {
	//静态方法，get请求
	  public static String sendGet(String url,String params) throws IOException
	  {
		      String result = "";
		      BufferedReader in = null;
		    try{
		      String urlName = url +"?" + params;
		      URL realUrl = new URL(urlName);
		      //打开和url之间的连接
		      URLConnection conn = realUrl.openConnection();
		      //设置通用的请求属性
		      conn.setRequestProperty("accept","*/*");
		      conn.setRequestProperty("connection", "Keep-Alive");
		      conn.setRequestProperty("user-agent", "Mozilla/4.0(compatible;MSIE6.0;WindowsNT5.1;SV1");
		      //建立实际的连接
		      conn.connect();
		      //获取所有响应头字段
		      Map<String,List<String>> map = conn.getHeaderFields();
		      for(String key : map.keySet())
		      {
		    	  System.out.println(key +"--->" + map.get(key));
		      }
		     //定义BufferReader输入流来读取url的响应
		      in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		      String line;
		      while((line = in.readLine())!=null)
		      {
		    	  result += "\n" + line;
		      }
		    }
		    catch(Exception e)
		    {
		    	System.out.println("发送get请求出现异常！" + e);
		    	e.printStackTrace();
		    }
		    
		    //使用finally来关闭输入流
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
