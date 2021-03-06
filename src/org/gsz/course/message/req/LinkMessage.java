/**
 * 
 */
package org.gsz.course.message.req;

/**
 *
 *链接消息
 * @author gongsizhen
 * @author 2014年3月20日
 *
 */
public class LinkMessage extends BaseMessage {
	//消息标题
	private String Title;
	//消息描述
	private String Description;
	//消息链接
	private String Url;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return Title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		Title = title;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description = description;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return Url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		Url = url;
	}
	
	
}
