/**
 * 
 */
package org.gsz.course.message.resp;

/**
 *音乐信息
 *
 * @author gongsizhen
 * @author 2014年3月20日
 *
 */
public class MusicMessage extends BaseMessage {
	//音乐  
	private Music Music;

	/**
	 * @return the music
	 */
	public Music getMusic() {
		return Music;
	}

	/**
	 * @param music the music to set
	 */
	public void setMusic(Music music) {
		Music = music;
	}
	
	
	
}
