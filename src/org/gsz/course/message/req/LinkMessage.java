/**
 * 
 */
package org.gsz.course.message.req;

/**
 *
 *������Ϣ
 * @author gongsizhen
 * @author 2014��3��20��
 *
 */
public class LinkMessage extends BaseMessage {
	//��Ϣ����
	private String Title;
	//��Ϣ����
	private String Description;
	//��Ϣ����
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
