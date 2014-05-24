/**
 * 
 */
package org.gsz.course.util;

import java.io.InputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.gsz.course.message.resp.MusicMessage;
import org.gsz.course.message.resp.NewsMessage;
import org.gsz.course.message.resp.TextMessage;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
/**
 *��Ϣ������
 *
 * @author gongsizhen
 * @author 2014��3��21��
 *
 */
public class MessageUtil {
	/**
	 * ������Ϣ���ͣ��ı�
	 */
	public static final String RESP_MESSAGE_TYPE_TEXT = "text";
	
	/**
	 * ������Ϣ���ͣ�����
	 */
	public static final String RESP_MESSAGE_TYPE_MUSIC = "music";
	
	/**
	 * ������Ϣ���ͣ�ͼ��
	 */
	public static final String RESP_MESSAGE_TYPE_NEWS = "news";
	
	/**
	 * ������Ϣ���ͣ��ı�
	 */
	public static final String REQ_MESSAGE_TYPE_TEXT = "text";
	
	/**
	 * ������Ϣ���ͣ�ͼƬ
	 */
	public static final String REQ_MESSAGE_TYPE_IMAGE = "image";
	
	/**
	 * ������Ϣ���ͣ�����
	 */
	public static final String REQ_MESSAGE_TYPE_LINK = "link";
	
	/**
	 * ������Ϣ���ͣ�����λ��
	 */
	public static final String REQ_MESSAGE_TYPE_LOCATION = "location";
	
	/**
	 * ������Ϣ���ͣ���Ƶ
	 */
	public static final String REQ_MESSAGE_TYPE_VOICE = "voice";
	

    /** 
     * ������Ϣ���ͣ����� 
     */  
    public static final String REQ_MESSAGE_TYPE_EVENT = "event"; 
    
	/**
	 * �¼����ͣ�subscribe(����)
	 */
	public static final String REQ_MESSAGE_TYPE_SUBSCRIBE = "subscribe";
	
	/**
	 * �¼����ͣ�unsubscribe(ȡ������)
	 */
	public static final String REQ_MESSAGE_TYPE_UNSUBSCRIBE = "unsubscribe";
	
	/**
	 * �¼����ͣ�CLICK(�Զ���˵�����¼�)
	 */
	public static final String REQ_MESSAGE_TYPE_CLICK = "CLICK";
	
	/**
	 * ����΢�ŷ���������(xml),���뵽HashMap��
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public static Map<String,String> parseXml(HttpServletRequest request) throws Exception{
		//�������������HashMap��
		Map<String,String> map = new HashMap<String,String>();
		
		//��request�л�ȡ������
		InputStream inputStream = request.getInputStream();
		
		//��ȡ������
		SAXReader reader = new SAXReader();
		Document document = reader.read(inputStream);
		
		//��ø�Ԫ��
		Element root = document.getRootElement();
		
		//�õ���Ԫ�ص������ӽڵ�
		List<Element> elementList = root.elements();
		
		//���� ���нڵ㣬���ѽڵ����map��
		for(Element e : elementList){
			map.put(e.getName(),e.getText());
		}
		
		//�ͷ���Դ
		inputStream.close();
		inputStream = null;
		
		return map;
	}
	/**
	 * �ı���Ϣ����ת��Ϊxml
	 * 
	 * @param textMessage
	 * @return
	 */
	public static String textMessageToXml(TextMessage textMessage){
		xstream.alias("xml", textMessage.getClass());
		return xstream.toXML(textMessage);
	}
	/**
	 * ������Ϣ����ת��Ϊxml
	 * 
	 * @param textMessage
	 * @return
	 */
	public static String musicMessageToXml(MusicMessage musicMessage){
		xstream.alias("xml", musicMessage.getClass());
		return xstream.toXML(musicMessage);
	}
	/**
	 * ͼ����Ϣ����ת��Ϊxml
	 * 
	 * @param textMessage
	 * @return
	 */
	public static String newsMessageToXml(NewsMessage newsMessage){
		xstream.alias("xml", newsMessage.getClass());
		return xstream.toXML(newsMessage);
	}
	
	/**
	 * ��չxstream��ʹ��֧��CDATA��
	 */
	public static XStream xstream = new XStream(new XppDriver(){
		public HierarchicalStreamWriter createWriter(Writer out){
			return new PrettyPrintWriter(out){
				boolean cdata = true;
				
				@SuppressWarnings("unchecked")
				public void startNode(String name,Class clazz){
					super.startNode(name,clazz);
				}
				
				protected void writeText(QuickWriter writer,String text){
					if(cdata){
						writer.write("<![CDATA[");
						writer.write(text);
						writer.write("]]>");
					}else{
						writer.write(text);
					}
				}
			} ;
		}
	});
}
