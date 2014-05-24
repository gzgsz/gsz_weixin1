/**
 * 
 */
package org.gsz.course.message.resp;

/**
 *
 *
 * @author gongsizhen
 * @author 2014年3月20日
 *
 */
public class TextMessage extends BaseMessage {
	// 文本信息
	private String content;

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
