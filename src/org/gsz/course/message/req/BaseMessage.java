/**
 * 
 */
package org.gsz.course.message.req;

/**
 *��Ϣ����( ��ͨ�û� ����>�����˺ţ�
 *
 * @author gongsizhen
 * @author 2014��3��20��
 *
 */
public class BaseMessage {
	//������΢�ź�
	private String ToUserName;
	//���ͷ��ʺţ�һ��OpenID��
	private String FromUserName;
	//��Ϣ����ʱ�� �����ͣ�
	private long CreateTime;
	//��Ϣ���ͣ�text/image/location/link��
	private String MsgType;
	//��Ϣid��64λ����
	private long MsgId;

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
	 * @return the msgId
	 */
	public long getMsgId() {
		return MsgId;
	}

	/**
	 * @param msgId the msgId to set
	 */
	public void setMsgId(long msgId) {
		MsgId = msgId;
	}
	
	
}
