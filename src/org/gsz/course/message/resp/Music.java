/**
 * 
 */
package org.gsz.course.message.resp;

/**
 *������
 *
 * @author gongsizhen
 * @author 2014��3��20��
 *
 */
public class Music {
	//��������
	private String Title;
	
	//��������
	private String Description;
	
	//��������
	private String MusicUrl;
	
	//�������������ӣ�WIFI��������ʹ�ø����Ӳ������� 
	private String HQMusicUrl;

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
	 * @return the musicUrl
	 */
	public String getMusicUrl() {
		return MusicUrl;
	}

	/**
	 * @param musicUrl the musicUrl to set
	 */
	public void setMusicUrl(String musicUrl) {
		MusicUrl = musicUrl;
	}

	/**
	 * @return the hQMusicUrl
	 */
	public String getHQMusicUrl() {
		return HQMusicUrl;
	}

	/**
	 * @param hQMusicUrl the hQMusicUrl to set
	 */
	public void setHQMusicUrl(String hQMusicUrl) {
		HQMusicUrl = hQMusicUrl;
	}
	
	
}
