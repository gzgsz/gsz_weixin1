/**
 * 
 */
package org.gsz.course.message.resp;

/**
 *响应消息的基类
 *
 * @author gongsizhen
 * @author 2014年3月20日
 *
 */
public class BaseMessage {
	// 接收方帐号（收到的OpenID） 
	private String ToUserName;
	//开发者微信号
	private String FromUserName;
	//消息创建时间戳 （整型）
	private long CreateTime;
	//消息类型（text/music/news）  
	private String MsgType;
	//位0x0001被标志时，星标刚收到的消息 
	private int FuncFlag;
	/**
	 * @return the toUserName
	 */
	public String getToUserName() {
		return ToUserName;
	}
	/**
	 * @param toUserName the toUserName to set
	 */
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	/**
	 * @return the fromUserName
	 */
	public String getFromUserName() {
		return FromUserName;
	}
	/**
	 * @param fromUserName the fromUserName to set
	 */
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	/**
	 * @return the createTime
	 */
	public long getCreateTime() {
		return CreateTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}
	/**
	 * @return the msgType
	 */
	public String getMsgType() {
		return MsgType;
	}
	/**
	 * @param msgType the msgType to set
	 */
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	/**
	 * @return the funcFlag
	 */
	public int getFuncFlag() {
		return FuncFlag;
	}
	/**
	 * @param funcFlag the funcFlag to set
	 */
	public void setFuncFlag(int funcFlag) {
		FuncFlag = funcFlag;
	}
	
	
	
	
	
}
