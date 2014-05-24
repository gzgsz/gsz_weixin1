package test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 *测试微信请求
 *
 * @author gongsizhen
 * @author 2014年3月21日
 *
 */
public class WeixinRequestTest {
	public static void main(String[] args) throws IOException {
		request();
	}
	
	@SuppressWarnings("unchecked")
	public static void request() throws IOException{
		URL url = new URL("http://127.0.0.1:8080/gsz_weixin1/coreServlet");
		
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		
		con.setRequestMethod("POST");
		
		con.setConnectTimeout(5 * 1000);
		
		con.setDoInput(true);
		
		con.setDoOutput(true);
		
		con.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
		
		con.connect();
		
		DataOutputStream out = new DataOutputStream(con.getOutputStream());
		
		out.write(event().getBytes());
		
		out.flush();
		
		out.close();
		
		if(con.getResponseCode() == 200){
			InputStream inputStream = con.getInputStream();
			
			SAXReader reader = new SAXReader();
			
			Document document = null;
			
			try {
				document = reader.read(inputStream);
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Element root = document.getRootElement();
			
			List<Element> elementList = root.elements();
			
			for (Element e : elementList) {
						System.out.println(e.getText());
			}
			
			inputStream.close();
			inputStream = null;
			
		}
		
		
	}
	
	static String text(){
		StringBuffer sb = new StringBuffer();
		
		sb.append("<xml>");
		sb.append("<ToUserName><![CDATA[gh_72758ea99408]]></ToUserName>");
		sb.append("<FromUserName><![CDATA[o2nSmt1mQDsk2-Tv3LCA2Vtte5Ys]]></FromUserName> ");
		sb.append("<CreateTime>1348831860</CreateTime>");
		sb.append("<MsgType><![CDATA[text]]></MsgType>");
		sb.append("<Content><![CDATA[this is a test]]></Content>");
		sb.append("<MsgId>1234567890123456</MsgId>");
		sb.append("</xml>");
		
		return sb.toString();
	}
	
	
	static String event() {
		StringBuffer sb = new StringBuffer();
		sb.append("<xml>");
		sb.append("<ToUserName><![CDATA[gsz]]></ToUserName>");
		sb.append("<FromUserName><![CDATA[askjdhksadpohsdakdsa]]></FromUserName>");
		sb.append("<CreateTime>");
		sb.append(System.currentTimeMillis());
		sb.append("</CreateTime>");
		sb.append("<MsgType><![CDATA[event]]></MsgType>");
		sb.append("<Event><![CDATA[subscribe]]></Event>");
		sb.append("<EventKey><![CDATA[subscribe]]></EventKey>");
		sb.append("</xml>");
		return sb.toString();
	}
}
