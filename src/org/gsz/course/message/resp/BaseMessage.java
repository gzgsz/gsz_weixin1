/**
 * 
 */
package org.gsz.course.message.resp;

/**
 *��Ӧ��Ϣ�Ļ���
 *
 * @author gongsizhen
 * @author 2014��3��20��
 *
 */
public class BaseMessage {
	// ���շ��ʺţ��յ���OpenID�� 
	private String ToUserName;
	//������΢�ź�
	private String FromUserName;
	//��Ϣ����ʱ��� �����ͣ�
	private long CreateTime;
	//��Ϣ���ͣ�text/music/news��  
	private String MsgType;
	//λ0x0001����־ʱ���Ǳ���յ�����Ϣ 
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
