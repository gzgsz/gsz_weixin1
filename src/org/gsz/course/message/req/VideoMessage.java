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
public class VideoMessage extends BaseMessage {
	//��Ƶ��Ϣý��id
	private String MediaId;
	
	//��Ƶ��Ϣ����ͼ��ý��id
	private String ThumbMediaId;

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
	 * @return the thumbMediaId
	 */
	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	/**
	 * @param thumbMediaId the thumbMediaId to set
	 */
	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
	
	
}
