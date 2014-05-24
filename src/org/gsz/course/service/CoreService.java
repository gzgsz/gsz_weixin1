/**
 * 
 */
package org.gsz.course.service;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.gsz.course.message.resp.TextMessage;
import org.gsz.course.util.MessageUtil;

/**
 *���ķ�����
 *
 * @author gongsizhen
 * @author 2014��3��21��
 *
 */
public class CoreService {
	
	public static String processRequest(HttpServletRequest request){
		String respMessage = null;
		try{
			String respContent = "�������쳣�����Ժ����ԣ�";
			
			Map<String ,String> requestMap = MessageUtil.parseXml(request);
			
			String fromUserName = requestMap.get("FromUserName");
			
			String toUserName = requestMap.get("ToUserName");
			
			String msgType = requestMap.get("MsgType");
			
			//�ظ��ı���Ϣ
			TextMessage textMessage = new TextMessage();
			
			textMessage.setToUserName(fromUserName);
			
			textMessage.setFromUserName(toUserName);
			
			textMessage.setCreateTime(new Date().getTime());
			
			textMessage.setMsgType(MessageUtil.REQ_MESSAGE_TYPE_TEXT);
			
			textMessage.setFuncFlag(0);
			
			//�ı���Ϣ
			if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)){
				respContent = "�㷢�͵����ı���Ϣ";
			}
			//ͼƬ��Ϣ
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)){
				respContent = "�㷢�͵���ͼƬ��Ϣ";
			}
			//����λ����Ϣ
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)){
				respContent = "�㷢�͵��ǵ���λ����Ϣ";
			}
			//������Ϣ
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)){
				respContent = "�㷢�͵���������Ϣ";
			}
			//��Ƶ��Ϣ
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)){
				respContent = "�㷢�͵�����Ƶ��Ϣ";
			}
			//�¼�����
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)){
				//�¼�����
				String eventType = requestMap.get("Event");
				
				if(eventType.equals(MessageUtil.REQ_MESSAGE_TYPE_SUBSCRIBE)){
					respContent = "лл���Ĺ�ע��";
				}
				
				else if (eventType.equals(MessageUtil.REQ_MESSAGE_TYPE_UNSUBSCRIBE)){
					// TODO ȡ�����ĺ��û����ղ������ںŷ��͵���Ϣ����˲���Ҫ�ظ���Ϣ 
				}
				else if(eventType.equals(MessageUtil.REQ_MESSAGE_TYPE_CLICK)){
					//TODO �Զ���˵�Ȩû�п��ţ��ݲ����������Ϣ  
				}
			}
			textMessage.setContent(respContent);
			
			respMessage = MessageUtil.textMessageToXml(textMessage);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return respMessage;
	}
}
