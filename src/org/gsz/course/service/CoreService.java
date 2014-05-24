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
 *核心服务类
 *
 * @author gongsizhen
 * @author 2014年3月21日
 *
 */
public class CoreService {
	
	public static String processRequest(HttpServletRequest request){
		String respMessage = null;
		try{
			String respContent = "请求处理异常，请稍后重试！";
			
			Map<String ,String> requestMap = MessageUtil.parseXml(request);
			
			String fromUserName = requestMap.get("FromUserName");
			
			String toUserName = requestMap.get("ToUserName");
			
			String msgType = requestMap.get("MsgType");
			
			//回复文本信息
			TextMessage textMessage = new TextMessage();
			
			textMessage.setToUserName(fromUserName);
			
			textMessage.setFromUserName(toUserName);
			
			textMessage.setCreateTime(new Date().getTime());
			
			textMessage.setMsgType(MessageUtil.REQ_MESSAGE_TYPE_TEXT);
			
			textMessage.setFuncFlag(0);
			
			//文本信息
			if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)){
				respContent = "你发送的是文本信息";
			}
			//图片信息
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)){
				respContent = "你发送的是图片信息";
			}
			//地理位置信息
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)){
				respContent = "你发送的是地理位置信息";
			}
			//链接信息
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)){
				respContent = "你发送的是链接信息";
			}
			//音频信息
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)){
				respContent = "你发送的是音频信息";
			}
			//事件推送
			else if(msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)){
				//事件类型
				String eventType = requestMap.get("Event");
				
				if(eventType.equals(MessageUtil.REQ_MESSAGE_TYPE_SUBSCRIBE)){
					respContent = "谢谢您的关注！";
				}
				
				else if (eventType.equals(MessageUtil.REQ_MESSAGE_TYPE_UNSUBSCRIBE)){
					// TODO 取消订阅后用户再收不到公众号发送的消息，因此不需要回复消息 
				}
				else if(eventType.equals(MessageUtil.REQ_MESSAGE_TYPE_CLICK)){
					//TODO 自定义菜单权没有开放，暂不处理该类消息  
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
