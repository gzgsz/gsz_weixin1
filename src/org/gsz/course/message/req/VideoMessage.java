/**
 * 
 */
package org.gsz.course.message.req;

/**
 *视频信息
 *
 * @author gongsizhen
 * @author 2014年3月20日
 *
 */
public class VideoMessage extends BaseMessage {
	//视频消息媒体id
	private String MediaId;
	
	//视频消息缩略图的媒体id
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
