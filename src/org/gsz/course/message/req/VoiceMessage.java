/**
 * 
 */
package org.gsz.course.message.req;

/**
 *��Ƶ��Ϣ
 *
 * @author gongsizhen
 * @author 2014��3��20��
 *
 */
public class VoiceMessage extends BaseMessage {
	//����ý��id
	private String  MediaId;
	//������ʽ
	private String Format;
	/**
	 * @return the mediaId
	 */
	public String getMediaId() {
		return MediaId;
	}
	/**
	 * @param mediaId the mediaId to set
	 */
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	/**
	 * @return the format
	 */
	public String getFormat() {
		return Format;
	}
	/**
	 * @param format the format to set
	 */
	public void setFormat(String format) {
		Format = format;
	}
	
	
}
