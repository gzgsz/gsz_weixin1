/**
 * 
 */
package org.gsz.course.message.req;

/**
 *图片信息
 *
 * @author gongsizhen
 * @author 2014年3月20日
 *
 */
public class ImageMessage extends BaseMessage {
	//图片链接
	private String PicUrl;

	/**
	 * @return the picUrl
	 */
	public String getPicUrl() {
		return PicUrl;
	}

	/**
	 * @param picUrl the picUrl to set
	 */
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	
	
}
