/**
 * 
 */
package org.gsz.course.message.req;

/**
 *音频信息
 *
 * @author gongsizhen
 * @author 2014年3月20日
 *
 */
public class VoiceMessage extends BaseMessage {
	//语音媒体id
	private String  MediaId;
	//语音格式
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
